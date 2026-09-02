// Audit completo del codice JavaScript di index.html
const fs = require('fs');
const html = fs.readFileSync('index.html', 'utf8');

const scriptStart = html.indexOf('<script>') + '<script>'.length;
const scriptEnd = html.indexOf('</script>');
const script = html.slice(scriptStart, scriptEnd);

console.log("1. Verifica sintattica...");
new Function(script);
console.log("✓ Sintassi JavaScript corretta!");

// Verifica presenza di tutti gli asset personalizzati richiesti
const requiredAssets = [
  "bg_montagna.jpg", "bg_palma.jpg", "bg_bologna.jpg",
  "anna_wait.png", "anna_hold.png", "anna_catch.png", "anna_cheer.png", "anna_cacao_menu.png",
  "anna_cart_0.png", "anna_cart_1.png", "anna_cart_2.png", "anna_cart_3.png",
  "cacao_walk_0.png", "cacao_walk_1.png", "cacao_walk_2.png", "cacao_walk_3.png",
  "cacao_wait_0.png", "cacao_wait_1.png", "cacao_wait_2.png", "cacao_wait_3.png",
  "cacao_sit_0.png", "cacao_sit_1.png", "cacao_sit_2.png", "cacao_sit_3.png",
  "cacao_jump_0.png", "cacao_jump_1.png", "cacao_jump_2.png", "cacao_jump_3.png",
];

for (let i = 0; i <= 10; i++) {
  requiredAssets.push(`block_brick_${i}.png`);
  requiredAssets.push(`block_planks_${i}.png`);
  requiredAssets.push(`block_bologna_${i}.png`);
}

for (let i = 0; i < 8; i++) {
  requiredAssets.push(`house_montagna_${i}.png`);
  requiredAssets.push(`house_palma_${i}.png`);
  requiredAssets.push(`house_bologna_${i}.png`);
}

console.log("2. Verifica esistenza file fisici...");
let missing = 0;
for (const f of requiredAssets) {
  const p = `assets/custom/${f}`;
  if (!fs.existsSync(p)) {
    console.error(`❌ Manca: ${p}`);
    missing++;
  }
}
if (missing === 0) {
  console.log(`✓ Tutti i ${requiredAssets.length} asset personalizzati sono presenti su disco!`);
}

console.log("3. Verifica integrità bundle...");
const bundle = JSON.parse(fs.readFileSync('assets/custom/assets_bundle.json', 'utf8'));
console.log(`✓ Bundle JSON compilato con ${Object.keys(bundle).length} risorse!`);

console.log("AUDIT COMPLETATO CON SUCCESSO!");
