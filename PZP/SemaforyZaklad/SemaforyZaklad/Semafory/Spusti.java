
/**
 * Write a description of class Spusti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spusti {
    private Doprava doprava1;
    
    /**
     * Constructor for objects of class Spusti
     */
    public Spusti() {
       this.doprava1 = new Doprava();
       int q = 1;
       while(q == 1) {
           doprava1.posun();
           doprava1.presun();
       }
    }
}
