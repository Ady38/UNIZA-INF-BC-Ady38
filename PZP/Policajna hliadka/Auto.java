import java.util.Random;

/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto {
    
    private Osoba vodic;
    private Osoba spolujazdec;
    private Random r;
    
    /**
     * Constructor for objects of class Auto
     */
    public Auto() {
        this.vodic = null;
        this.spolujazdec = null;
        this.r = new Random();
    }
    
    public Osoba getVodic() {
        return this.vodic;
    }
    
    public Osoba getSpolujazdec() {
        return this.spolujazdec;
    }
    
    public void nastupAkoSpolujazdec(Osoba osoba) {
        this.spolujazdec = osoba;
    }
    
    public void nastupAkoSofer(Osoba osoba) {
        this.vodic = osoba;
        if (r.nextDouble() < 0.8) {
            this.vodic.setZodpovedna(true);
        }
    }
}
