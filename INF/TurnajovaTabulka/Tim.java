
/**
 * Write a description of class Tim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tim {
    
    private int pocetBodov;
    private String nazovTimu;
    private Krajina krajinaPovodu;
    
    /**
     * Constructor for objects of class Tim
     */
    public Tim(String nazov, Krajina povod) {
        this.pocetBodov = 0;
        this.krajinaPovodu = povod;
        this.nazovTimu = nazov;
    }
    
    public Krajina getKrajinaPovodu() {
        return this.krajinaPovodu;
    }
    
    public int getPocetBodov() {
        return this.pocetBodov;
    }
    
    public String getNazovTimu() {
        return this.nazovTimu;
    }
    
    public void pridajBody(int kolko) {
        this.pocetBodov += kolko;
    }
    
    public void vynulujBody() {
        this.pocetBodov = 0;
    }
}
