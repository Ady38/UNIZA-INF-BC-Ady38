
/**
 * Enumeration class TypCastiVlaku - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TypCastiVlaku {
    RUSEN("pics/vlak.png"),
    VAGON1("pics/vagon01.png"),
    VAGON2("pics/vagon02.png"),
    VAGON3("pics/vagon03.png");
    
    private final String suborObrazka;
    
    private TypCastiVlaku(String subor) {
        this.suborObrazka = subor;
    } 
    
    public String getSuborObrazka() {
        return this.suborObrazka;
    }
}
