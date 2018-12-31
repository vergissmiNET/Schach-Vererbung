public class Laeufer extends Schachfigur {

    // Konstruktor der Basisklasse aufrufen
    public Laeufer(String startpos) {
        super(startpos);
    }

    // Zeichenkette mit allen möglichen Positionen zusammenstellen
    @Override
    public String ermittleZiele() {
        StringBuilder zuege = new StringBuilder();
        zuege.append(position(spalte + 1, reihe + 1));
        zuege.append(position(spalte + 2, reihe + 2));
        zuege.append(position(spalte + 3, reihe + 3));
        zuege.append(position(spalte + 4, reihe + 4));
        zuege.append(position(spalte + 5, reihe + 5));
        zuege.append(position(spalte + 6, reihe + 6));
        zuege.append(position(spalte + 7, reihe + 7));
        zuege.append(position(spalte - 1, reihe - 1));
        zuege.append(position(spalte - 2, reihe - 2));
        zuege.append(position(spalte - 3, reihe - 3));
        zuege.append(position(spalte - 4, reihe - 4));
        zuege.append(position(spalte - 5, reihe - 5));
        zuege.append(position(spalte - 6, reihe - 6));
        zuege.append(position(spalte - 7, reihe - 7));
        zuege.append(position(spalte - 1, reihe + 1));
        zuege.append(position(spalte - 2, reihe + 2));
        zuege.append(position(spalte - 3, reihe + 3));
        zuege.append(position(spalte - 4, reihe + 4));
        zuege.append(position(spalte - 5, reihe + 5));
        zuege.append(position(spalte - 6, reihe + 6));
        zuege.append(position(spalte - 7, reihe + 7));
        zuege.append(position(spalte + 1, reihe - 1));
        zuege.append(position(spalte + 2, reihe - 2));
        zuege.append(position(spalte + 3, reihe - 3));
        zuege.append(position(spalte + 4, reihe - 4));
        zuege.append(position(spalte + 5, reihe - 5));
        zuege.append(position(spalte + 6, reihe - 6));
        zuege.append(position(spalte + 7, reihe - 7));
        return zuege.substring(0, zuege.length() - 1);
    }
}
