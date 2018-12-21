public class Main {

    public static void main(String[] args) {
	// 3 Spielpositionen als Test
        String[] tst = {"e5", "a1", "e8" };

        // Ausgabe der Springerpositionen
        for (String pos : tst) {
            Springer sp = new Springer(pos);
            System.out.println("Position des Springers: " + pos);
            System.out.println(" Mögliche Ziele des Springers: " + sp.ermittleZiele());
        }

        // Ausgabe der Turmpositionen
        for (String pos : tst) {
            Turm tm = new Turm(pos);
            System.out.println("Position des Turmes: " + pos);
            System.out.println(" Mögliche Ziele des Turmes: " + tm.ermittleZiele());
        }

        // Ausgabe der Läuferposition
        for (String pos : tst) {
            Laeufer lf = new Laeufer(pos);
            System.out.println("Position des Läufers: " + pos);
            System.out.println(" Mögliche Ziele des Läufers: " + lf.ermittleZiele());
        }

    }
}
