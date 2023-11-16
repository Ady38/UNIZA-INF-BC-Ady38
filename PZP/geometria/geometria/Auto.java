import java.util.Calendar;

/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto {
    private String typ;
    private String znacka;
    private int tachometer;
    private double spotreba;
    private int rokVyroby;
    private int pocetMiest;
    private boolean parkovaciaKamera;
    private int platnostSTK;

    /**
     * Inicializuje Auto
     */
    public Auto(String znacka, String typ, int tachometer, int rokVyroby, int pocetMiest, boolean parkovaciaKamera, int platnostSTK) {
        this.znacka = znacka;
        this.typ = typ;
        this.tachometer = tachometer;
        this.rokVyroby = rokVyroby;
        this.pocetMiest = pocetMiest;
        this.parkovaciaKamera = parkovaciaKamera;
        this.platnostSTK = platnostSTK;
    }

    /**
     * Vrati stav tachometra
     */
    public int getTachometer() {
        return this.tachometer;
    }

    /**
     * Vrati True/False ci ma auto parkovaciu kameru
     */
    public boolean getParkovaciaKamera() {
        return this.parkovaciaKamera;
    }

    /**
     * Znizi pocet km na tachometri o zadanu vzdialenost
     */
    public void stocKm(int oKolko) {
        this.tachometer = this.tachometer - oKolko;
    }

    /**
     * Vyrata spotrebu na 1km zo vzdialenosti a mnozstva spotrebovaneho paliva
     */
    public void setSpotreba(double vzdialenost, double mnozstvoPaliva) {
        this.spotreba = mnozstvoPaliva / vzdialenost;
    }

    /**
     * Vyrata cenu cesty na zaklade spotreby, vzdialenosti a ceny PHM
     */
    public double vypocetCenyCesty(int vzdialenost, double cenaPaliva) {
        return (this.spotreba * vzdialenost * cenaPaliva);
    }

    /**
     * Prida 2 roky do platnosti STK
     */
    public void obnovSTK() {
        this.platnostSTK += 2;
    }

    /**
     * Vrati spotrebu auta
     */
    public double getSpotreba() {
        return this.spotreba;
    }

    /**
     * Vrati vo formate string informacie o aute
     */
    public String toString() {
        return (this.znacka + " " + this.typ + " " + this.rokVyroby + " najazdene: " + this.tachometer + "km, pocet miest: " + this.pocetMiest + ", ma parkovaciu kameru: " + this.parkovaciaKamera + ", Stk platna do " + this.platnostSTK); 
    }

    /**
     * Vytlaci informacie o aute pre potreby inzeratu
     * Pomocou vetvenia IF vypise info o kamere ak ju auto ma, inak nevypisuje nic
     */
    public void tlacInzerat() {
        System.out.println(this.znacka + " " + this.typ + " " + this.rokVyroby);
        System.out.println(this.pocetMiest + "miestne");
        System.out.println("najazdne: " + tachometer);
        System.out.println("STK Platna do: " + platnostSTK);
        if (this.parkovaciaKamera) {
            System.out.println("Ma parkovaciu kameru");
        }
        
    }

    public String inzeratInak() {
        return this.getPozdrav() + ", predám vozidlo značky " + this.znacka + " typ " + this.typ +
            ". \nRok výroby auta je " + this.rokVyroby +
            ". \nVozidlo ma najazdenych " + this.tachometer + " km, pričom jeho spotreba je " + this.spotreba +
            " l/100km. \nAuto je  " + this.popisMiest() +
            " \nO auto je výborne postarané. Najbližšia výmena oleja je potrebná za " + this.vymenaOleja() +
            "km. \n" + this.popisParkovaciaKamera() +
            "\n" + this.platnostSTK1();
    }

    public String getPozdrav() {
        int hodiny = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hodiny > 0 && hodiny < 10) {
            return "Dobré ráno";
        } else if (hodiny > 10 && hodiny < 16) {
            return "Dobrý deň";
        } else {
            return "Dobrý večer";
        }
    }

    public String popisMiest() {
        switch (this.pocetMiest) {
            case 4: return "pre malu rodinu,stvorclennu";
            case 5: return "pre patclennu rodinu";
            case 7: return "pre velku rodinu, ma sedem miest";
            default: return this.pocetMiest + " miestne";
        }
    }

    public int vymenaOleja() {
        return this.tachometer % 15000;
    }

    public String popisParkovaciaKamera() {
        if (this.parkovaciaKamera) {
            return "O bezproblemove parkovanie sa postara parkovacia kamera.";
        } else {
            return "Kedze auto nema parkovaciu kameru, je vhodne mat po ruke spolujazdca s dobrym odhadom.";
        }
    }

    public String platnostSTK1() {
        int rok = Calendar.getInstance().get(Calendar.YEAR);
        int platiEste = rok - platnostSTK;
        if (platiEste == 2) {
            return "Auto ma platnu STK este 2 roky.";
        } else if (platiEste == 1) {
            return "Auto ma platnu STK este 1 rok.";
        } else if (platiEste == 0) {
            return "Autu konci platnost STK uz tento rok.";
        } else if (platiEste < -1 && platiEste > -5) {
            return "Auto nema platnu STK už " + Math.abs(platiEste) + " roky.";
        } else {
            return "Auto nema platnu STK už " + Math.abs(platiEste) + " rokov.";
        }
    }
}
