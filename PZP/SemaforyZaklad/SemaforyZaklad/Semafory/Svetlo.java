
/**
 * Write a description of class Svetlo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Svetlo {
    
    private Kruh svetielko;
    
    /**
     * Konštruktor triedy svetlo
     * Vytvori svetlo a umiestni jeho lavy horny roh na zadane suradnice
     */
    public Svetlo(int poziciaX, int poziciaY, String farba) {
        this.svetielko = new Kruh();
        this.svetielko.zmenFarbu(farba);
        this.svetielko.posunVodorovne(poziciaX - 20);
        this.svetielko.posunZvisle(poziciaY - 60);
    }
    
    public void rozsviet() {
        this.svetielko.zobraz();
    }
    
    public void zhasni() {
        this.svetielko.skry();
    }
}
