import java.util.Random;

public class Osoba {

    private String meno;
    private String priezvisko;
    private PracovneZaradenie pracovneZaradenie;
    private int plat;
    private Random random;

    public Osoba(String meno, String priezvisko) {
        this.random = new Random();
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.plat = (int)((random.nextDouble()*2500)+500);
        this.pracovneZaradenie = PracovneZaradenie.STUDENT;
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public int getPlat() {
        return this.plat;
    }

    public PracovneZaradenie getPracovneZaradenie() {
        return this.pracovneZaradenie;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void zvysPlat() {
        switch (this.pracovneZaradenie) {
            case ASISTENT:
                this.plat = this.plat * 2;
                break;
            case DOCENT:
                this.plat = this.plat * 3;
                break;
            case PROFESOR:
                this.plat = this.plat * 4;
                break;
        }
    }

    public void zvysKvalifikaciu() {
        switch (this.pracovneZaradenie) {
            case STUDENT:
                this.pracovneZaradenie = PracovneZaradenie.ASISTENT;
                break;
            case ASISTENT:
                this.pracovneZaradenie = PracovneZaradenie.DOCENT;
                break;
            case DOCENT:
                this.pracovneZaradenie = PracovneZaradenie.PROFESOR;
                break;
        }
    }

    public String toString() {
        return (this.meno + " " + this.priezvisko + " " + this.pracovneZaradenie.getReprezentacia());
    }
}
