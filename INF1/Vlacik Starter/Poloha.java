
/**
 * Write a description of class Poloha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poloha {
    
    private final int x;
    private final int y;
    private final Smer smer;
    
    /**
     * Constructor for objects of class Poloha
     */
    public Poloha(int x, int y, Smer smer) {
        this.x = x;
        this.y = y;
        this.smer = smer;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Smer getSmer() {
        return this.smer;
    }
    
    public Poloha getPosunutuPolohu(int krok, Smer smer) {
        return new Poloha(
        this.x + smer.getVektorX() * krok,
        this.y + smer.getVektorY() * krok,
        smer
        );
    }
}
