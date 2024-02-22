
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment {
    private Obdlznik segment;
    
    public Segment(int x, int y, boolean vertikalny) {
        this.segment = new Obdlznik();
        
        if (vertikalny) {
            this.segment.zmenStrany(15,100);
        } else {
            this.segment.zmenStrany(100,15);
        }
        
        this.segment.posunVodorovne(x-60);
        this.segment.posunZvisle(y-50);
    }
    
    public void rozsvietSa() {
        this.segment.skry();
        this.segment.zmenFarbu("red");
        this.segment.zobraz();
    }
    
    public void zhasni() {
        this.segment.skry();
        this.segment.zmenFarbu("black");
        this.segment.zobraz();
    }
}
