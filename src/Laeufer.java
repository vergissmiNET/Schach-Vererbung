public class Laeufer {
    // Für a - h (entpricht 0-7)
    private int spalte;
    // Für 1 - 8 (entspricht 0-7)
    private int reihe;

    // Mögliche Werte als String
    final static private String SPALTEN = "abcdefgh";
    final static private String REIHEN = "12345678";

    // Konstruktor
    public Laeufer(String startpos) {
        // Fehler wenn Zeichenkette ungleich 2 Zeichen
        if (startpos.length() != 2) {
            throw new IllegalArgumentException("Ungültige Startposition, Du Greenhorn!");
        }

        // Bestimmen ob eingegebene Spalte bzw. Reihe innerhalb des gültigen
        // Bereiches liegt
        // Beispiel startpos = E5
        // charAt(0) ist E
        // Character.toLowerCase = e
        // SPALTEN.indexOf e = 4
        // charAT(1) = 5
        // REIHEN.indexOf = 4
        spalte = SPALTEN.indexOf(Character.toLowerCase(startpos.charAt(0)));
        reihe = REIHEN.indexOf(startpos.charAt(1));

        if (spalte == -1 || reihe == -1) {
            throw new IllegalArgumentException("Ungültige Startposition, Du Greenhorn!");
        }
    }
    // Zeichenkette mit allen möglichen Positionen zusammenstellen
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

    private String position(int spalte, int reihe) {
        if (spalte < 0 || spalte > 7 || reihe < 0 || reihe > 7) {
            return "";
        } else {
            return "" + SPALTEN.charAt(spalte) + REIHEN.charAt(reihe) + ";";
        }


    }
}
