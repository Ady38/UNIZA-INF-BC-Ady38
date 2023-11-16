
/**
 * Write a description of class Semafor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semafor {
    
    private Svetlo cerveneSvetlo;
    private Svetlo zlteSvetlo;
    private Svetlo zeleneSvetlo;
    private Obdlznik pozadie;
    
    /**
     * Constructor for objects of class Semafor
     */
    public Semafor(int polohaX, int polohaY) {
        this.pozadie = new Obdlznik();
        this.pozadie.zmenFarbu("black");
        this.pozadie.posunVodorovne(polohaX - 60);
        this.pozadie.posunZvisle(polohaY - 60);
        this.pozadie.zmenStrany(40, 110);
        this.pozadie.zobraz();
        this.cerveneSvetlo = new Svetlo(polohaX + 5, polohaY, "red");
        this.zlteSvetlo = new Svetlo(polohaX + 5, polohaY + 30, "yellow");
        this.zeleneSvetlo = new Svetlo(polohaX + 5, polohaY + 60, "green");
    }
    
    public void rozsvietStoj() {
        this.cerveneSvetlo.rozsviet();
        this.zlteSvetlo.zhasni();
        this.zeleneSvetlo.zhasni();
    }
    
    public void rozsvietPripravSa() {
        this.cerveneSvetlo.rozsviet();
        this.zlteSvetlo.rozsviet();
        this.zeleneSvetlo.zhasni();
    }
    
    public void rozsvietVolno() {
        this.cerveneSvetlo.zhasni();
        this.zlteSvetlo.zhasni();
        this.zeleneSvetlo.rozsviet();
    }
    
    public void rozsvietPozor() {
        this.cerveneSvetlo.zhasni();
        this.zlteSvetlo.rozsviet();
        this.zeleneSvetlo.zhasni();
    }
    
    public void rozsvietVsetko() {
        this.cerveneSvetlo.rozsviet();
        this.zlteSvetlo.rozsviet();
        this.zeleneSvetlo.rozsviet();
    }
}
