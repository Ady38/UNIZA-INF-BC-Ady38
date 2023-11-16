
/**
 * Write a description of class Internat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Internat {
    
    private char blok;
    private int kapacita;
    private int pocetStudentov;
    
    /**
     * Constructor for objects of class Internat
     */
    public Internat(char blok, int kapacita) {
        this.blok = blok;
        this.kapacita = kapacita;
        this.pocetStudentov = 0;
    }
    
    public char getBlok() {
        return this.blok;
    }
    
    public int getKapacita() {
        return this.kapacita;
    }
    
    public void zapisStudentaNaBlok(Student student) {
        if (student == null) {
            System.out.println("Nezadali ste študenta");
        } else {
            if (student.getSkola() == null) {
                System.out.println("Ľutujeme nie ste študentom. Nemáte nárok na internát.");
            } else {
                if (this.pocetStudentov + 1 > kapacita) {
                    System.out.println("Kapacita bloku je naplnena, na tento blok sa neda zapisat.");
                } else {
                    this.pocetStudentov += 1;
                    student.zapisNaInternat(this);
                }
            }
        }
    }
}
