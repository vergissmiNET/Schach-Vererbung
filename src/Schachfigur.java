public abstract class Schachfigur {
    // Für a - h (entpricht 0-7)
    protected int spalte;
    // Für 1 - 8 (entspricht 0-7)
    protected int reihe;

    // Mögliche Werte als String
    final static protected String SPALTEN = "abcdefgh";
    final static protected String REIHEN = "12345678";

    // Konstruktor
    public Schachfigur(String startpos) {
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

        if (spalte == -1 || reihe == -1)
            throw new IllegalArgumentException("ungültige Startposition");
    }

    // Abgeleitete Klassen müssen ermittleZiele() implementieren
    abstract public String ermittleZiele();

    // liefert eine Schachposition
    final static protected String position(int spalte, int reihe) {
        if (spalte < 0 || spalte > 7 || reihe < 0 || reihe > 7) {
            return "";
        } else {
            return "" + SPALTEN.charAt(spalte) + REIHEN.charAt(reihe) + ";";
        }
    }
}