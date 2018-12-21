public class Turm {
    // Für a - h (entpricht 0-7)
    private int spalte;
    // Für 1 - 8 (entspricht 0-7)
    private int reihe;
    private String sr = Integer.toString(spalte + reihe);

    // Mögliche Werte als String
    final static private String SPALTEN = "abcdefgh";
    final static private String REIHEN = "12345678";

    // Konstruktor
    public Turm(String startpos) {
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
        String sr = Integer.toString(spalte) + Integer.toString(reihe);

        if (spalte == -1 || reihe == -1) {
            throw new IllegalArgumentException("Ungültige Startposition, Du Greenhorn!");
        }
    }
    // Zeichenkette mit allen möglichen Positionen zusammenstellen
    // Bei einem Turm ist das Ergebnis --> am Beispiel e5
    // char0 (Buchstabe) + alle Reihen  --> (e+1), (e+2), ...
    // char1 (Reihe) + alle Spalten   --> (a+5), (b+5), ...
    // abschließend muss vom ergebnis die eigene Position (startpos) herausgeschnitten werden

    public String ermittleZiele() {
        StringBuilder zuege = new StringBuilder();
        for(int i=0; i<REIHEN.length(); i++ ) {
            zuege.append(position(spalte,i));
        }
        for(int j=0; j<REIHEN.length(); j++ ) {
            zuege.append(position(j,reihe));
        }
        return zuege.substring(0,zuege.length()-1);
    }

    // liefert eine Schachposition in der Notation a1 bis h8
    private String position(int spalte, int reihe) {
        return ""+ SPALTEN.charAt(spalte) + REIHEN.charAt(reihe) + ";";
    }


}
