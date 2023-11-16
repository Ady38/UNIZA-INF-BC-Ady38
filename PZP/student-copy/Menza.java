
/**
 * Write a description of class Menza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menza {
    
    private double cenaObedaStudent;
    private double cenaObedaNormal;
    
    /**
     * Constructor for objects of class Menza
     */
    public Menza() {
        this.cenaObedaStudent = 2.10;
        this.cenaObedaNormal = 3.93;
    }
    
    public double getCenaObedaStudent() {
        return this.cenaObedaStudent;
    }
    
    public double getCenaObedaNormal() {
        return this.cenaObedaNormal;
    }
    
    public void chcemObed(Student student) {
        if (student.getSkola() == null) {
            System.out.println(this.cenaObedaNormal);
            System.out.println("Zaplatte v hotovosti prosím");
        } else {
            System.out.println(this.cenaObedaStudent);
            if (student.getEMAny() > this.cenaObedaStudent) {
                student.znizEMany(this.cenaObedaStudent);
                System.out.println("Odobral som kredit, dobru chut");
            } else {
                System.out.println("Nemate dostatok kreditu");
            }
        }
    }
}
