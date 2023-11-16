
/**
 * Write a description of class RodneCislo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RodneCislo {
    
    private int rok;
    private int mesiac;
    private int den;
    private String spojenyDatum;
    
    /**
     * Constructor for objects of class RodneCislo
     */
    public RodneCislo(int rok, int mesiac, int den) {
        this.rok = rok;
        this.mesiac = mesiac;
        this.den = den;
    }
    
    public void setRok(int paRok) {
        this.rok = paRok;
    }
    
    public void setMesiac(int paMesiac) {
        this.mesiac = paMesiac;
    }
    
    public void setDen(int paDen) {
        this.den = paDen;
    }
    
    public int getRok() {
        return this.rok;
    }
    
    public int getMesiac() {
        return this.mesiac;
    }
    
    public int getDen() {
        return this.den;
    }
    
    public void spojenieDatumu() {
        this.spojenyDatum = String.format("%02d",this.rok%100) + String.format("%02d",this.mesiac) + String.format("%02d",this.den);
    }
    
    public String getSpojenyDatum() {
        return this.spojenyDatum;
    }
    
    public void spojenieRodCisla(String rok, int mesiac, String den, boolean zena){
        this.rok = this.konvertujStrNaInt(rok);
        if (zena){
            this.mesiac = mesiac + 50;
        } else {
            this.mesiac = mesiac;
        }
        this.den = this.konvertujStrNaInt(den);
        this.spojenieDatumu();
    }
    
    public boolean skontrolujPlatnost(String rodneCislo) {
        String[] rozdelene = rodneCislo.split("/");
        String datumS = rozdelene[0];
        String cislaS = rozdelene[1];
        
        int datum = konvertujStrNaInt(datumS);
        int cisla = konvertujStrNaInt(cislaS);
        int vysledok = datum+cisla;
        
        if (vysledok % 11 == 0) {
            return true;
        } else {
            return false;
        }
     }
    
    public int konvertujStrNaInt(String str) {
        if (!str.isEmpty()) {
            return Integer.parseInt(str);
        }
        return 0;
    }
}
