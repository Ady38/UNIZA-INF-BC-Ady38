import fri.shapesge.Stvorec;

/**
 * Write a description of class Policko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Policko {
    
    private Stvorec stvorec;
    
    /**
     * Constructor for objects of class Policko
     */
    public Policko(int x, int y, int velkost) {
        this.stvorec = new Stvorec();
        this.stvorec.zmenStranu(velkost);
        this.stvorec.posunVodorovne(x);
        this.stvorec.posunZvisle(y);
        this.stvorec.zmenFarbu("blue");
        this.stvorec.zobraz();
    }
    
    private void prekresli() {
        this.stvorec.zmenFarbu("red");
    }
}
