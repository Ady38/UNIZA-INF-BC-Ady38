import fri.shapesge.Obrazok;

/**
 * Write a description of class CastVlaku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastVlaku {
    /**
     * Constructor for objects of class CastVlaku
     */
    
    private static final int VELKOST_POLICKA = 35;
    private Poloha poloha;
    private final Obrazok obrazok;
    private CastVlaku pripojenaCast;
    
    public CastVlaku(Poloha poloha, TypCastiVlaku typ) {
        this.poloha = poloha;
        this.obrazok = new Obrazok(typ.getSuborObrazka(), poloha.getX() * VELKOST_POLICKA, poloha.getY() * VELKOST_POLICKA);
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
        this.obrazok.zobraz();
        this.pripojenaCast = null;
    }
    
    public Poloha getPoloha() {
        return this.poloha;
    }
    
    public void setPoloha(Poloha poloha) {
        this.obrazok.zmenPolohu(poloha.getX() * VELKOST_POLICKA, poloha.getY() * VELKOST_POLICKA);
        this.poloha = poloha;
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
    }
    
    public void posun(Smer smer) {
        Smer otocenie = this.poloha.getSmer();
        this.setPoloha(this.poloha.getPosunutuPolohu(1, smer));
        
        if (this.pripojenaCast != null) {
            this.pripojenaCast.posun(otocenie);
        }
    }
    
    public void pripojCast(TypCastiVlaku castVlaku){
        if (pripojenaCast != null) {
            this.pripojenaCast.pripojCast(castVlaku);
        } else {
            this.pripojenaCast = new CastVlaku(this.poloha.getPosunutuPolohu(-1, this.poloha.getSmer()),castVlaku);
        }
    }
}
