import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Write a description of class Bar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar {

    private ArrayList<Osoba> osobyVBare;

    /**
     * Constructor for objects of class Bar
     */
    public Bar() {
        this.osobyVBare = new ArrayList<Osoba>();
    }

    public void prichodDoBaru(Osoba osoba) {
        this.osobyVBare.add(osoba);
    }

    public void vypis() {
        for (Osoba osoba : this.osobyVBare) {
            System.out.println(osoba.toString());
        }
    }

    public void priradCesty() {
        int y = 50;
        Random r = new Random();
        for (Osoba osoba : this.osobyVBare) {
            osoba.urciCestuDomov(r.nextInt(9)+1, 50, y);
            y += 55;
        }
    }

    public void odchodZBaru() {
        Random r = new Random();
        for (Osoba osoba : this.osobyVBare) {
            while (osoba.getAktualnaVzdialenostOdDomu() != 0) {
                if (osoba.getAktualnaPozicia() < osoba.getCesta().getDlzkaCesty()){
                    if (osoba.getPromile() < r.nextInt(5)) {
                        osoba.setAktualnaVzdialenostOdDomu(osoba.getAktualnaVzdialenostOdDomu()-1);
                        osoba.getCesta().zobrazAktualnuPoziciu(osoba.getPredchadzajucaPozicia(), osoba.getAktualnaPozicia());
                        osoba.setPozicie(osoba.getAktualnaPozicia(),osoba.getAktualnaPozicia() + 1);
                        Platno.dajPlatno().wait(350);
                    } else {
                        osoba.setAktualnaVzdialenostOdDomu(osoba.getAktualnaVzdialenostOdDomu()+1);
                        osoba.getCesta().zobrazAktualnuPoziciu(osoba.getPredchadzajucaPozicia(), osoba.getAktualnaPozicia());
                        if(osoba.getAktualnaPozicia() - 1 < 0) {
                        } else {
                            osoba.setPozicie(osoba.getAktualnaPozicia(),osoba.getAktualnaPozicia() - 1);
                        }
                        Platno.dajPlatno().wait(350);
                    }
                } else {
                    System.out.println("Osoba prisla domov");
                    osoba.getCesta().zobrazAktualnuPoziciu(osoba.getPredchadzajucaPozicia(), osoba.getAktualnaPozicia());
                    break;
                }

                if (osoba.getAktualnaPozicia() < osoba.getCesta().getDlzkaCesty()) {
                    osoba.getCesta().zobrazAktualnuPoziciu(osoba.getPredchadzajucaPozicia(), osoba.getAktualnaPozicia());
                }
            }
        }
    }
}
