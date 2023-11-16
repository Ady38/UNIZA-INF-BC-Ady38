import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Bar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar {

    private ArrayList<Auto> parkovisko;
    private ArrayList<Osoba> osobyVBare;
    private Random r;

    /**
     * Constructor for objects of class Bar
     */
    public Bar() {
        this.parkovisko = new ArrayList<Auto>();
        this.osobyVBare = new ArrayList<Osoba>();
        this.r = new Random();
    }

    public void zaparkujAuto(Auto auto) {
        this.parkovisko.add(auto);
        this.osobyVBare.add(auto.getVodic());
        if (auto.getSpolujazdec() != null) {
            this.osobyVBare.add(auto.getSpolujazdec());
        }
    }

    public void objednajKoloVsetkym() {
        for (Osoba osoba : this.osobyVBare) {
            if (!osoba.jeZodpovedna()) {
                osoba.vypiPoldeci();
            }
        }
    }

    public void simulujPiatok(int pocetHodin) {
        for (int i = 0; i <= pocetHodin; i++) {
            for (Osoba osoba : this.osobyVBare) {
                if (r.nextDouble() < 0.05) {
                    this.objednajKoloVsetkym();
                } else if (r.nextDouble() < 0.4) {
                    if (!osoba.jeZodpovedna()) {  
                        osoba.vypiPivo();
                    }
                } else if (r.nextDouble() < 0.4) {
                    if (!osoba.jeZodpovedna()) {
                        osoba.vypiPoldeci();
                    }
                }
            }
        }
    }
}
