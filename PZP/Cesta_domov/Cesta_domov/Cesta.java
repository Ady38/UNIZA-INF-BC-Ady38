
/**
 * Write a description of class Cesta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cesta {
    
    private Obdlznik[] usekyCesty;
    private Obrazok dom;
    private int dlzkaCesty;
    
    /**
     * Constructor for objects of class Cesta
     */
    public Cesta(int pocetUsekov, int startPozX, int startPozY, int dlzkaUseku) {
        this.vytvorCestu(pocetUsekov,startPozX,startPozY,dlzkaUseku);
        this.dom = new Obrazok("images/house.png");
        this.dom.zmenVelkost(70, 50);
        this.dom.zmenPolohu(startPozX + (dlzkaUseku * pocetUsekov), startPozY);
        this.dlzkaCesty = pocetUsekov - 1;
    }
    
    public Obdlznik[] getUsekyCesty() {
        return this.usekyCesty;
    }
    
    public void vytvorCestu(int pocetUsekov, int startPozX, int startPozY, int dlzkaUseku) {
        this.usekyCesty = new Obdlznik[pocetUsekov];
        for (int i = 0; i < pocetUsekov; i++) {
            Obdlznik obdlznik = new Obdlznik();
            obdlznik.posunVodorovne(startPozX - 60 + (dlzkaUseku * i));
            obdlznik.posunZvisle(startPozY - 50);
            obdlznik.zmenStrany(dlzkaUseku, dlzkaUseku);
            obdlznik.zmenFarbu("black");
            this.usekyCesty[i] = obdlznik;
        }
    }
    
    public void zobrazAktualnuPoziciu(int predchadzajucaPozicia, int aktualnaPozicia) {
        if(predchadzajucaPozicia >= 0) {
            this.usekyCesty[predchadzajucaPozicia].zmenFarbu("black");
        }
        this.usekyCesty[aktualnaPozicia].zmenFarbu("red");
    }
    
    public int getDlzkaCesty() {
        return this.dlzkaCesty;
    }
}
