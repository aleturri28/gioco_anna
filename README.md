# 🏛️ Pyramid Bloxx — Annina & Cacao Edition

Un remake fedele e personalizzato in pixel-art del celebre classico arcade **Pyramid Bloxx** (Digital Chocolate 2004), sviluppato in HTML5 / Canvas 2D puro con animazioni a 60 FPS, fisica balistica accurata, supporto mobile/desktop e colonna sonora personalizzata.

---

## 🎮 Scenari e Modalità di Gioco

- **3 Scenari Panoramici:**
  - 🏔️ **Montagna (Chalet Alpino):** Mattoni rossi, impalcatura in legno scuro e bufera di neve.
  - 🏖️ **Palma de Mallorca (Chiringuito):** Assi di legno con corde, bambù dorato e vento di mare.
  - 🏛️ **Bologna (Palazzina coi Portici):** Cotto antico, pietra arenaria, vista sulle Due Torri e nebbione bolognese.

- **Modalità di Gioco:**
  - ⚡ **Scalata Rapida (Quick Mode):** Scalata procedurale infinita con velocità dinamica modulata sulla qualità delle prese (🌟 Perfetto $-5\%$, 👍 Medio $0\%$, ⚠️ Bordo $+5\%$, range $[22, 42]$).
  - 🏠 **Costruisci la Casetta (Empire Mode):** Costruzione progressiva di un edificio a 8 moduli ad incastro stretto con velocità fissa e rilassante a 32 unità e difficoltà meteo a sorpresa dal 4° blocco in poi.
  - 🏆 **Sala dei Record:** Tracciamento persistente dei punteggi massimi, casette completate per scenario e combo.
  - 🎧 **Musica & Mood di Annina:** Selezione tracce dedicate (Baddie, Cattiva, Espanol).

- **🐕 Cacao il Labrador:** Presente come operaio lungo la torre con probabilità del 30% su tutte le modalità, con animazioni dedicate di oscillazione col blocco sul dorso e salti festosi alla presa.

---

## 🕹️ Comandi di Gioco

- **Lancio Blocco / Interazione:**
  - **Spazio / Freccia Su / Invio** su tastiera
  - **Click sinistro del mouse** su PC
  - **Tap su schermo** su smartphone / tablet
- **Navigazione Menu:**
  - **Frecce Su/Giù** per selezionare le voci, **Invio / Spazio** per confermare
  - **Tap diretto** sulle voci da touchscreen

---

## 🚀 Avvio Locale

Per giocare in locale è sufficiente avviare un qualsiasi server statico:

```bash
# Python 3
python3 -m http.server 8080

# Oppure Node.js (npx serve / http-server)
npx serve .
```

Apri il browser su `http://localhost:8080/index.html`.

---

## 🌐 Pubblicazione Online (GitHub Pages / Vercel / Netlify)

Il gioco è completamente autocontenuto nella root e nella cartella `assets/`.

1. **GitHub Pages:**
   - Vai nelle impostazioni del repository (**Settings -> Pages**).
   - Imposta la sorgente su `Deploy from a branch` (branch `main` / root `/`).
   - Il gioco sarà subito accessibile online!
2. **Netlify / Vercel:**
   - Collega il repository, lascia la directory di output vuota (root) e pubblica direttamente.

---

## 📂 Struttura del Progetto

```
pyramid/
├── index.html                  # Entry point del gioco (Game Loop, Canvas 2D, Fisica, SFX)
├── assets/                     # Grafiche pixel-art, audio mp3 e sprite manifest
│   ├── custom/                 # 84 asset personalizzati (sfondi, moduli casetta, blocchi, personaggi)
│   ├── audio/                  # Brani musicali (baddie.mp3, cattiva.mp3, espanol.mp3)
│   ├── sprites/                # Sprite base originali
│   └── menu/                   # Interfaccia grafica
├── audit_game_systems.js       # Script di verifica automatica di integrità e risorse
├── HANDOFF.md                  # Documento di specifiche tecniche dettagliate (v1.2)
├── README.md                   # Questa guida
└── add_inutile/                # Archivio strumenti di sviluppo, script python e dump storici
    ├── STRUTTURA_ORIGINALE.md  # Mappa storica della struttura prima della pulizia
    └── ripristina_struttura.sh # Script per ripristinare i file di sviluppo nella root
```
