
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student {
    
    private String meno;
    private String priezvisko;
    private double priemer;
    private double eMany;
    private Skola skola;
    private Internat internat;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String meno, String priezvisko, double priemer) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.priemer = priemer;
        this.eMany = 0;
        this.skola = null;
        this.internat = null;
    }
    
    public String getMeno() {
        return this.meno;
    }
    
    public String getPriezvisko() {
        return this.priezvisko;
    }
    
    public double getEMAny() {
        return this.eMany;
    }
    
    public double getPriemer() {
        return this.priemer;
    }
    
    public void znizEMany(double oKolko) {
        this.eMany -= oKolko;
    }
    
    public void dobiEMany(double oKolko) {
        this.eMany += oKolko;
    }
    
    public void setMeno(String meno) {
        if (meno.equals("")) {
            this.meno = "Neznáme meno";
        } else {
            this.meno = meno;
        }
    }
    
    public void setPriezvisko(String priezvisko) {
        if (priezvisko.equals(" ")) {
            this.priezvisko = "Neznáme priezvisko";
        } else {
            this.priezvisko = priezvisko;
        }
    }
    
    public void zapisNaSkolu(Skola skola) {
        this.skola = skola;
    }
    
    public void zapisNaInternat(Internat internat) {
        this.internat = internat;
    }
    
    public Skola getSkola() {
        return this.skola;
    }
}
