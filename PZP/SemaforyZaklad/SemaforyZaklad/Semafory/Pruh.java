
/**
 * Write a description of class pruh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pruh {
    private Obdlznik pruh;
    
    /**
     * Constructor for objects of class pruh
     */
    public Pruh(int x, int y, boolean jeVertikalny) {
        this.pruh = new Obdlznik();
        this.pruh.posunVodorovne(x - 60);
        this.pruh.posunZvisle(y - 50);
        if (jeVertikalny) {
            this.pruh.zmenStrany(5, 50);
        } else {
            this.pruh.zmenStrany(50, 5);
        }
        
        this.pruh.zmenFarbu("white");
    }
}
