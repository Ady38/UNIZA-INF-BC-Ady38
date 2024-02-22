
/**
 * Write a description of class DvojciferneCislo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DvojciferneCislo {
    private Cislica desiatky;
    private Cislica jednotky;
    
    /**
     * Constructor for objects of class DvojciferneCislo
     */
    public DvojciferneCislo(int cislo) {
        this.desiatky = new Cislica (0,0,cislo / 10);
        this.jednotky = new Cislica (200,0,cislo % 10);
    }
    
    public void zmenHodnotu(int cislo){
        this.desiatky = new Cislica (0,0,cislo / 10);
        this.jednotky = new Cislica (200,0,cislo % 10);
    }
}
