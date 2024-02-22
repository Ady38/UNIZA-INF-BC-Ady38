
/**
 * Enumeration class Smer - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Smer {
    HORE(90, 0, -1),
    DOLE(-90, 0, 1),
    VPRAVO(180, 1, 0),
    VLAVO(0, -1, 0);
    
    private final int vektorX;
    private final int vektorY;
    private final int uhol;
    
    private Smer(int uhol , int vektorX, int vektorY) {
        this.vektorX = vektorX;
        this.vektorY = vektorY;
        this.uhol = uhol;
    }
    
    public int getVektorX() {
        return this.vektorX;
    }
    
    public int getVektorY() {
        return this.vektorY;
    }
    
    public int getUhol() {
        return this.uhol;
    }
}
