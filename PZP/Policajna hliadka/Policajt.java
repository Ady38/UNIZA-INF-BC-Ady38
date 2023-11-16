
/**
 * Write a description of class Policajt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Policajt {
    
    private String hladanaOsoba;
    
    /**
     * Constructor for objects of class Policajt
     */
    public Policajt() {
        this.hladanaOsoba = null;
    }
    
    public void setHladanaOsoba(String osoba) {
        this.hladanaOsoba = osoba;
    }
    
    public void zastavAuto(Auto auto) {
        if (auto.getVodic().getPromile() > 0.0) {
            System.out.println(auto.getVodic().toString() + " " + auto.getVodic().getPromile());
        } else {
            System.out.println(auto.getVodic().toString() + " Nenafúkal");
        }
        
        if(auto.getVodic().toString().equals(this.hladanaOsoba)) {
            System.out.println("Našiel som hľadanú osobu " + this.hladanaOsoba);
        }
        
        if(auto.getSpolujazdec() != null &&auto.getSpolujazdec().toString().equals(this.hladanaOsoba)) {
            System.out.println("Našiel som hľadanú osobu " + this.hladanaOsoba);
        }  
    }
}
