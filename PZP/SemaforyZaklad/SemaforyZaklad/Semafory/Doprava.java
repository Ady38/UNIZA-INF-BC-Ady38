
/**
 * Write a description of class Doprava here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doprava {
    private Krizovatka k;
    private Auto hore;
    private Auto dole;
    private Auto vpravo;
    private Auto vlavo;
    private Casovac c;
    
    /**
     * Constructor for objects of class Doprava
     */
    public Doprava() {
        this.k = new Krizovatka();
        this.hore = new Auto(210,-60,true);
        this.dole = new Auto(260,500,true);
        this.vpravo = new Auto(500,210,false);
        this.vlavo = new Auto(-60,260,false);
        this.c = new Casovac(this.k);
    }
    
    public void posun() {
        switch (this.k.getStav()) {
            case "Priprav sa" :
            case "Stoj" :
                this.vpravo.posunZelena(2);
                this.vlavo.posunZelena(4);
                this.hore.posunCervena(1);
                this.dole.posunCervena(3);
                break;
            case "Volno" :
            case "Pozor" :
                this.vpravo.posunCervena(2);
                this.vlavo.posunCervena(4);
                this.hore.posunZelena(1);
                this.dole.posunZelena(3);
                break;
        }
    }
    
    public void presun() {
        this.vpravo.opakuj(2);
        this.vlavo.opakuj(4);
        this.hore.opakuj(1);
        this.dole.opakuj(3);
    }
}
