
/**
 * Write a description of class Osoba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Osoba {
    
    private String meno;
    private String priezvisko;
    private int vzdialenostBaruOdDomu;
    private int aktualnaVzdialenostOdDomu;
    private Cesta cesta;
    private Double promile;
    private int predchdzajucaPozicia;
    private int aktualnaPozicia;
    
    /**
     * Constructor for objects of class Osoba
     */
    public Osoba(String meno, String priezvisko, double promile) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.promile = promile;
        this.cesta = null;
        this.vzdialenostBaruOdDomu = 0;
        this.aktualnaVzdialenostOdDomu = 0;
        this.predchdzajucaPozicia = -1;
        this.aktualnaPozicia = 0;
    }
    
    public String getMeno() {
        return this.meno;
    }
    
    public String getPriezvisko() {
        return this.priezvisko;
    }
    
    public Cesta getCesta() {
        return this.cesta;
    }
    
    public int getAktualnaVzdialenostOdDomu() {
        return this.aktualnaVzdialenostOdDomu;
    }
    
    public int getVzdialenostBaruOdDomu() {
        return this.vzdialenostBaruOdDomu;
    }
    
    public double getPromile() {
        return this.promile;
    }
    
    public void setAktualnaVzdialenostOdDomu(int aktualnaVzdialenost) {
        this.aktualnaVzdialenostOdDomu = aktualnaVzdialenost;
    }
    
    public void urciCestuDomov(int vzdialenostBaruOdDomu, int pozCestyX, int pozCestyY) {
        this.vzdialenostBaruOdDomu = vzdialenostBaruOdDomu;
        this.setAktualnaVzdialenostOdDomu(vzdialenostBaruOdDomu);
        this.cesta = new Cesta(vzdialenostBaruOdDomu, pozCestyX, pozCestyY, 50);
    }
    
    public String toString() {
        return this.meno + " " + this.priezvisko + " má cestu domov vzdialenú " + this.vzdialenostBaruOdDomu + "km";
    }
    
    public int getAktualnaPozicia() {
        return this.aktualnaPozicia;
    }
    
    public int getPredchadzajucaPozicia() {
        return this.predchdzajucaPozicia;
    }
    
    public void setPozicie(int predchadzajuca, int aktualna) {
        this.aktualnaPozicia = aktualna;
        this.predchdzajucaPozicia = predchadzajuca;
    }
    
}
