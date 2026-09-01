# 🏛️ Pyramid Bloxx — Annina & Cacao Edition
## Documento di Handoff & Specifiche di Progetto

> **Data:** 1 Settembre 2026  
> **Versione:** 1.2 (Bologna Scenario & Enhanced Systems Edition)  
> **Stato:** Completato al 100% e verificato  

---

## 📖 1. Panoramica del Progetto

**Pyramid Bloxx: Annina & Cacao Edition** è un remake fedele e personalizzato in pixel-art del celebre gioco arcade per cellulari Nokia del 2004 (*Pyramid Bloxx* di Digital Chocolate).  

Il gioco è stato interamente riprogettato con un tema affettivo unico:
- **Annina ("Anna")**: Ragazza protagonista (top fucsia/magenta, shorts bianchi, riccioli castani voluminosi, occhi scuri e lentiggini).
- **Cacao**: Il fedele Labrador retriever color cioccolato con collare turchese e medaglietta dorata, che lavora come operaio sulla torre prendendo i blocchi sul dorso e saltando di gioia.
- **Tre Scenari Panoramici Selezionabili**:
  1. 🏔️ **Casetta in Montagna (Chalet Alpino)**: Mattoni rossi in terracotta, impalcatura in legno scuro, prato fiorito e camino fumante.
  2. 🏖️ **Chiringuito a Palma de Mallorca**: Assi di legno legate con corde, impalcatura in bambù dorato, sabbia dorata, mare turchese e torcia tiki.
  3. 🏛️ **Bologna (Palazzina Storica coi Portici)**: Città universitaria di Annina fuori sede, blocchi in cotto antico bolognese e pietra arenaria, impalcatura da restauro storico in legno caldo e giunti metallici, sfondo panoramico con le Due Torri (Asinelli e Garisenda), portici storici e Santuario di San Luca sui colli all'orizzonte.

---

## 🕹️ 2. Modalità di Gioco e Funzionalità

### A. Scalata Rapida (Quick Mode)
- Scalata procedurale infinita con regolazione dinamica della velocità basata sulla qualità di atterraggio del blocco:
  - **Velocità Base Iniziale**: `32` unità ($1.60\text{s}$ per oscillazione completa).
  - **Atterraggio Perfetto (PERFETTO! 🌟)**: Riduce la velocità del **-5%** ($-1.6$ unità), premiando la precisione con un ritmo più rilassato e controllato (fino al minimo di $22$, durata ciclo $2.33\text{s}$).
  - **Atterraggio Medio (BUONO! 👍)**: Mantiene la velocità **invariata** ($0\%$).
  - **Atterraggio al Bordo (AL BORDO! ⚠️)**: Aumenta la velocità del **+5%** ($+1.6$ unità), rendendo il ritmo più incalzante e punitivo a seguito di lanci imprecisi (fino al massimo di $42$, durata ciclo $1.22\text{s}$).
  - **Range Rigoroso $[22, 42]$**: La velocità può variare esclusivamente entro $\pm 10$ unità rispetto alla base, garantendo una giocabilità sempre equa e accessibile ai riflessi umani.
  - **Eredità lungo la Catena**: La velocità modulata viene trasferita direttamente all'operaio ricevente che effettuerà il lancio successivo, resettandosi a 32 all'inizio di una nuova partita.
- A partire dal 4° piano in poi (`quickFloors >= 3`), possono verificarsi con probabilità del 50% eventi ambientali speciali (Terremoto, Vento, Bufera di Neve o Nebbione Bolognese) della durata di 5–15 secondi.
- Punteggio continuo con combo per prese perfette consecutive.
- **HUD pulita**: I tre pallini delle vite sono nascosti per focalizzarsi su punteggio, combo, evento attivo e tempo.

### B. Costruisci la Casetta (Empire Mode)
- Costruzione progressiva di una casa a 8 moduli architettonici a incastro stretto (fondazioni, pilastri, pareti, porte, finestre, balcone e tetto).
- **Velocità Costante e Rilassata**: In questa modalità la velocità di oscillazione degli operai è **rigorosamente fissa e immutabile a 32 unità** ($1.60\text{s}$ per ciclo), garantendo un gameplay accessibile e rilassante incentrato sulla costruzione.
- **Difficoltà Ambientali dal 4° Blocco in poi** (dopo aver piazzato 3 blocchi):
  - **Probabilità di comparsa**: **50%** ad ogni scalata di un blocco (non garantita, così da alternare livelli sereni e livelli con sfide speciali).
  - **Comparsa a Sorpresa**: L'evento non parte subito, ma si manifesta casualmente dopo 1–4.5 secondi dall'inizio della scalata.
  - **Durata Prestabilita**: Durata calibrata **tra 5 e 15 secondi** (non per l'intero livello), con countdown visibile nell'HUD e banner di notifica sia all'inizio che al ritorno della calma.
  - 🌋 **Terremoto**: Disponibile per tutti gli scenari, provoca scosse sismiche e oscillazioni irregolari dell'operaio a scatti, accompagnate da screen shake del canvas e pulviscolo di detriti cadenti.
  - 💨 **Vento (Spiaggia di Palma)**: Raffiche orizzontali (a destra ➡️ o a sinistra ⬅️) che deviano fisicamente la parabola del blocco in volo di 18-24px con scie di brezza e granelli di sabbia.
  - ❄️ **Bufera di Neve (Chalet di Montagna)**: Tormenta di neve (a destra ➡️ o a sinistra ⬅️) con deviazione laterale del blocco e densa nevicata diagonale.
  - 🌫️ **Nebbione Bolognese (Bologna)**: Banchi di fitta nebbia in quota (a destra ➡️ o a sinistra ⬅️) con raffiche di brezza umida che deviano la traiettoria del blocco e particelle di vapore/nebbia a schermo.
- **Banner di Allerta & Badge HUD**: Notifica animata ad alto contrasto ad ogni attivazione di evento con durata in secondi, e badge continuo con conto alla rovescia nella barra superiore (`🌋 SISMA 8s`, `💨 VENTO ➡️ 12s`, `❄️ BUFERA ⬅️ 6s`, `🌫️ NEBBIA ➡️ 10s`).
- **Sistema 3 Tentativi (Vite)**: 3 errori consentiti per ciascun blocco; le vite si resettano automaticamente a 3 all'inizio di ogni nuovo pezzo da consegnare (`startClimb`).
- **Cutscene di Consegna**: Al termine della scalata, Anna riceve il blocco nella cesta della slitta/carrello, attraversa il ponte e lo posa con animazione di discesa parabolica nel cantiere della casetta.
- **Schermata Risultati & Rango Finale**: Valutazione e medaglia da Architetto Leggendario al completamento di tutti gli 8 pezzi.

### C. Sala dei Record & Statistiche 🏆
- Sezione dedicata accessibile direttamente dal menu principale (**"Record & Statistiche 🏆"**).
- **Statistiche Casetta (Empire Mode)**:
  - Miglior punteggio totale della casetta completata.
  - Miglior Titolo/Rango ottenuto (Apprendista -> Architetto Leggendario).
  - Conteggio totale casette finite con suddivisione per scenario (🏔️ Montagna vs 🏖️ Palma vs 🏛️ Bologna).
  - Miglior tempo di completamento e record di prese perfette 🌟 in una run.
- **Statistiche Scalata Rapida (Quick Mode)**:
  - Record punteggio massimo.
  - Piani massimi scalati.
  - Combo massima raggiunta.
- Salvataggio automatico e persistente in `localStorage` (`pb_stats_v2`, `pb_highscore_quick`).

### D. Sistema Musicale e Mood di Annina
- Accessibile dal menu con la voce **"Musica & Mood di Annina 🎧"**:
  - 💄 **BADDIE** -> Riproduzione in loop di `assets/audio/baddie.mp3`
  - 😈 **CATTIVA** -> Riproduzione in loop di `assets/audio/cattiva.mp3`
  - 🌴 **ESPANOL** -> Riproduzione in loop di `assets/audio/espanol.mp3`
  - 🔊 **Toggle Audio ON / OFF**
- Navigabile sia da tastiera/gamepad che tramite **tap/click diretto** su schermo da smartphone e PC.

---

## 🏗️ 3. Struttura dei File

```
pyramid/
├── index.html                  # Game loop, StateMachine, Canvas 2D, Fisica, Audio
├── assets/
│   ├── custom/                 # 84 Asset grafici pixel art + bundle JSON
│   │   ├── bg_montagna.jpg     # Sfondo panoramico Montagna (16-bit)
│   │   ├── bg_palma.jpg        # Sfondo panoramico Palma de Mallorca (16-bit)
│   │   ├── bg_bologna.jpg      # Sfondo panoramico Bologna (Due Torri & Portici 16-bit)
│   │   ├── anna_wait.png       # Anna posa attesa
│   │   ├── anna_hold.png       # Anna posa lancio
│   │   ├── anna_catch.png      # Anna posa presa
│   │   ├── anna_cheer.png      # Anna esultanza
│   │   ├── anna_cart_0..3.png  # Anna che tira il carrello (animazione 4 frame)
│   │   ├── cacao_walk_0..3.png # Cacao oscillazione con blocco sul dorso
│   │   ├── cacao_wait_0..3.png # Cacao attesa / respiro
│   │   ├── cacao_sit_0..3.png  # Cacao seduto con coda scodinzolante
│   │   ├── cacao_jump_0..3.png # Cacao salto festoso presa
│   │   ├── block_brick_0..10.png   # 11 inclinazioni fisiche mattoni alpini
│   │   ├── block_planks_0..10.png  # 11 inclinazioni fisiche assi di legno Palma
│   │   ├── block_bologna_0..10.png # 11 inclinazioni fisiche cotto antico & arenaria Bologna
│   │   ├── house_montagna_0..7.png # 8 moduli architettonici Chalet Alpino
│   │   ├── house_palma_0..7.png    # 8 moduli architettonici Chiringuito
│   │   └── house_bologna_0..7.png  # 8 moduli architettonici Palazzina Storica coi Portici
│   └── audio/
│       ├── baddie.mp3          # Traccia audio mood Baddie
│       ├── cattiva.mp3         # Traccia audio mood Cattiva
│       └── espanol.mp3         # Traccia audio mood Espanol
├── audit_game_systems.js       # Script di verifica integrità e sintassi
└── HANDOFF.md                  # Questo documento
```

---

## ⚙️ 4. Dettagli di Fisica e Regole di Gioco

1. **Parabola e Raggiungibilità Garantita al 100%**:
   - Velocità iniziale di lancio $v_0 = -3927$ (Anna) / $-3740$ (Cacao), gravità $g = 10030$.
   - Apice massimo del lancio singolo: **$127.69\text{ px}$**.
   - Tutti i passi verticali sono limitati a un massimo di **$92\text{ px}$** (4 tile da 23px): ogni lancio supera sempre l'altezza del ricevente e scende pulito attraverso il box di presa.
2. **Distribuzione di Cacao**:
   - **Probabilità uniforme del 30%** su tutti i piani e postazioni della torre (da terra $i = 0$ fino a $i = n - 2$) in tutte le modalità di gioco.
   - L'ultimo operaio in cima (`i === n - 1`) è sempre **Anna con il carrello**.
3. **Banner di Feedback Visivo**:
   - `PERFETTO! 🌟`, `BUONO! 👍`, `AL BORDO! ⚠️`, `MANCATO! ❌` racchiusi in una capsula scura semitrasparente con bordo luminoso e drop-shadow ad alto contrasto per una leggibilità ottimale contro qualsiasi sfondo.
4. **Scaffolding a Tutta Larghezza**:
   - 4 pilastri verticali distribuiti uniformemente (legno montano, bambù o cotto antico bolognese), croci di Sant'Andrea rinforzate con nodi di corda/giunti metallici, scala a pioli e pedane continue allineate con precisione ai piedi dei personaggi.

---

## 🚀 5. Come Avviare e Pubblicare il Progetto

### Avvio in Locale:
```bash
# Avvia il server HTTP nella cartella del progetto
python3 -m http.server 8080

# Apri il browser all'indirizzo:
http://localhost:8080/index.html
```

### Pubblicazione Online (GitHub Pages / Netlify / Vercel):
1. Poiché il gioco è interamente contenuto in `index.html` e nella cartella `assets/`, è sufficiente caricare la cartella su qualsiasi hosting statico o abilitare **GitHub Pages** dal branch del repository.
2. Servire sempre via protocollo HTTP/HTTPS (non aprendo `file:///` nel browser) per consentire il caricamento corretto degli asset e dell'AudioContext.

---

## 🧪 6. Test di Verifica Automatizzati

Per eseguire l'audit completo di sintassi, risorse e integrità del codice:
```bash
node audit_game_systems.js
```
*Output atteso:*
```
1. Verifica sintattica...
✓ Sintassi JavaScript corretta!
2. Verifica esistenza file fisici...
✓ Tutti i 84 asset personalizzati sono presenti su disco!
3. Verifica integrità bundle...
✓ Bundle JSON compilato con 84 risorse!
AUDIT COMPLETATO CON SUCCESSO!
```
