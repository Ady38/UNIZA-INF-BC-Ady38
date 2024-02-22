import fri.shapesge.Stvorec;

/**
 * Write a description of class Policko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Policko {
    
    private Stvorec stvorec;
    private Lodka lodka;
    private boolean zasiahnute;
    
    /**
     * Constructor for objects of class Policko
     */
    public Policko(int x, int y, int velkost) {
        this.stvorec = new Stvorec(x * (velkost + 1),y * (velkost + 1));
        this.stvorec.zmenStranu(velkost);
        this.stvorec.zmenFarbu("blue");
        this.stvorec.zobraz();
        this.zasiahnute = false;
    }
    
    public void priradLodku(Lodka lodka) {
        this.lodka = lodka;
    }
    
    public void zasiahni() {
        this.zasiahnute = true;
        this.prekresli();
    }
    
    private void prekresli() {
        if (this.zasiahnute) {
            if (this.lodka == null) {
                this.stvorec.zmenFarbu("#00008B");
            } else {
                this.stvorec.zmenFarbu("red");
            }
        } else {
            this.stvorec.zmenFarbu("red");
        }
    }
}
