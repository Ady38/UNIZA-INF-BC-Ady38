
/**
 * Write a description of class Kocka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kocka {
    private double a;
    
    /**
     * Inicializacia kocky pomocou dlzky strany 
     */
    public Kocka(double a) {
        this.a = a;
    }
    
    /**
     * Vypocita a vrati povrch kocky
     */
    public double getPovrch() {
        return (6 * this.a * this.a);
    }
    
    /**
     * Vypocita a vrati objem kocky
     */
    public double getObjem() {
        return (this.a * this.a * this.a);
    }
    
    /**
     * Vráti dlzku strany
     */
    public double getStrana() {
        return this.a;
    }
    
    /**
     * Zmeni dlzku strany
     */
    public void setStrana(double paStrana) {
        this.a = paStrana;
    }
    
    /**
     * Vrati údaje o kocke ako textový reťazec
     */
    public String toString() {
        return "strana: " + this.a + "; povrch: " + (6 * this.a * this.a) + "; objem: " + (this.a * this.a * this.a);
    }
    
    /**
     * Vypise udaje o kocke
     */
    public void vypis() {
        System.out.println("strana: " + this.a);
        System.out.println("povrch: " + (6 * this.a * this.a));
        System.out.println("objem: " + (this.a * this.a * this.a));
    }
}
