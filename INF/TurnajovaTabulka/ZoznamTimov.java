import java.util.ArrayList;

/**
 * Write a description of class ZoznamTimov here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZoznamTimov {

    private ArrayList<Tim> zoznamTimov;

    /**
     * Constructor for objects of class ZoznamTimov
     */
    public ZoznamTimov() {
        zoznamTimov = new ArrayList<Tim>();
    }

    public boolean pridajTim(Tim pridavany) {
        if (this.getTim(pridavany.getNazovTimu()) == null) {
            this.zoznamTimov.add(pridavany);
            return true;
        }
        return false;
        
        //Druha moznost
        //int pocetNerovnakych = 0;
        // for (Tim tim : this.zoznamTimov) {
            // if (!pridavany.getNazovTimu().equals(tim.getNazovTimu())) {
                // pocetNerovnakych++;
            // }
        // }
        // if (pocetNerovnakych == zoznamTimov.size()) {
            // this.zoznamTimov.add(pridavany);
            // return true;
        // }
        //return false;
    }

    public Tim getTim(String nazovHladaneho) {
        for (Tim tim : this.zoznamTimov) {
            if(nazovHladaneho.equals(tim.getNazovTimu())) {
                return tim;
            }
        }
        return null;
    }

    public void vynulujVysledky() {
        for (Tim tim : this.zoznamTimov) {
            tim.vynulujBody();
        }
    }
}
