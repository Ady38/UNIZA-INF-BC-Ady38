import java.util.ArrayList;

public class Osoba {
    private String meno;
    private String priezvisko;
    private ArrayList<Double> body;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.body = new ArrayList<Double>();
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public void vypis() {
        System.out.println(this.meno + " " + this.priezvisko);
    }
    
    public void pridajVysledok(double body) {
        this.body.add(body);
    }
    
    public double vypocitajPriemerBodov() {
        double sucet = 0;
        int pocet = 0;
        for (double body : this.body) {
            sucet += body;
            pocet++;
        }
        return sucet/pocet;
    }
}
