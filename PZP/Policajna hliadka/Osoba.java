
/**
 * Write a description of class Osoba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Osoba {
    
    private String meno;
    private String priezvisko;
    private double promile;
    private boolean zodpovedna;
    
    /**
     * Constructor for objects of class Osoba
     */
    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.promile = 0;
        this.zodpovedna = false;
    }
    
    public void vypiPivo() {
        this.promile += 0.28;
    }
    
    public void vypiPoldeci() {
        this.promile += 0.4;
    }
    
    public double getPromile() {
        return this.promile;
    }
    
    public void setZodpovedna(boolean zodpovedna) {
        this.zodpovedna = zodpovedna;
    }
    
    public boolean jeZodpovedna() {
        return this.zodpovedna;
    }
    
    public String toString() {
        return this.meno + " " + this.priezvisko;
    }
}
