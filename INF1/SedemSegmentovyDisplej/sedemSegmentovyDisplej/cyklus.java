
/**
 * Write a description of class cyklus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cyklus {
    private DvojciferneCislo x;
    /**
     * Constructor for objects of class cyklus
     */
    public cyklus() {
        this.x = new DvojciferneCislo (0);
        for(int i = 0;i<100;i++){
            x.zmenHodnotu(i);
        }
    }
}
