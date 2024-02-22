import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Skupina {

    private String nazov;
    private ArrayList<Osoba> zoznamOsob;

    public Skupina(String nazov) {
        this.nazov = nazov;
        this.zoznamOsob = new ArrayList<Osoba>();
    }

    public void pridajOsobu(Osoba osoba) {
        int rovnake = 0;
        int pocet = zoznamOsob.size();
        for(int i = 0; i < pocet; i++) {
            if (this.zoznamOsob.get(i).getMeno().equals(osoba.getMeno())  && this.zoznamOsob.get(i).getPriezvisko().equals(osoba.getPriezvisko())) {
                rovnake += 1;
            }
            if (rovnake==0){
                this.zoznamOsob.add(osoba);
            }
        }
        if(this.zoznamOsob.size() == 0) {
            this.zoznamOsob.add(osoba);
        }
    }

    public void ulozDoSuboru(String cestaKSuboru) throws IOException {
        File subor = new File(cestaKSuboru);
        PrintWriter zapisovac = new PrintWriter(subor);
        for (Osoba osoba : this.zoznamOsob) {
            zapisovac.println(osoba.toString());
        }
        zapisovac.close();
    }

    public Osoba vyberNajbohatsiehoDocenta() {
        Osoba najbohatsia = null;
        int najPlat = 0;
        for (Osoba osoba : this.zoznamOsob) {
            if (osoba.getPracovneZaradenie() == PracovneZaradenie.DOCENT) {
                if (osoba.getPlat() > najPlat) {
                    najPlat = osoba.getPlat();
                    najbohatsia = osoba;
                }
            }
        }
        return najbohatsia;
    }
}
