
/**
 * Write a description of class Cesta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cesta {
    
    private Obdlznik cesta;
    
    /**
     * Constructor for objects of class Cesta
     */
    public Cesta(int dlzka, int hrubka, int polohaX, int polohaY) {
        this.cesta = new Obdlznik();
        this.cesta.zmenFarbu("black");
        this.cesta.zmenStrany(hrubka, dlzka);
        this.cesta.posunVodorovne(polohaX - 60);
        this.cesta.posunZvisle(polohaY - 50);
    }
}
