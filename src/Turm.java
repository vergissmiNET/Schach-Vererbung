public class Turm extends Schachfigur {

    // Konstruktor der Basisklasse aufrufen
    public Turm(String startpos) {
        super(startpos);
    }

    @Override
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

}
