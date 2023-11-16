
/**
 * Write a description of class Skola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skola {
    
    private String nazovSkoly;
    private double minPriemer;
    
    /**
     * Constructor for objects of class Skola
     */
    public Skola(double minPriemer) {
        this.minPriemer = minPriemer;
        this.nazovSkoly = "UNIZA";
    }
    
    public void setNazovSkoly(String nazov) {
        if (nazov.equals("")) {
            this.nazovSkoly = "Neznámz názov školy";
        } else {
            this.nazovSkoly = nazov;
        }
    }
    
    public String getNazovSkoly() {
        return this.nazovSkoly;
    }
    
    public void setMinPriemer(double minPriemer) {
        if (minPriemer <= 0) {
            this.minPriemer = 0;
        } else {
            this.minPriemer = minPriemer;
        }
        
    }
    
    public double getMinPriemer() {
        return this.minPriemer;
    }
    
    public void zapisStudenta(Student student) {
        if (student == null) {
            System.out.println("Nezadali ste študenta");
        } else {
            if (student.getPriemer() <= this.minPriemer) {
                System.out.println("Študent bol prijatý");
                student.zapisNaSkolu(this);
            } else {
                System.out.println("Študent nebol prijatý");
            }
        }
    }
}
