
/**
 * Write a description of class Krizovatka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Krizovatka {
    
    private Cesta cestaA;
    private Cesta cestaB;
    private Semafor semafor1;
    private Semafor semafor2;
    private String stav;
    private Pruh pruh1;
    private Pruh pruh2;
    private Pruh pruh3;
    private Pruh pruh4;
    
    public Krizovatka() {
        this.cestaA = new Cesta(500, 100, 200, 0);
        this.cestaB = new Cesta(100, 500, 0, 200);
        this.semafor1 = new Semafor(145, 90);
        this.semafor2 = new Semafor(315, 320);
        this.pruh1 = new Pruh (200,200,false);
        this.pruh2 = new Pruh (250,295,false);
        this.pruh3 = new Pruh (295,200,true);
        this.pruh4 = new Pruh (200,250,true);
        
        this.stav = "Vypnute";
    }
    
    public String getStav() {
        return this.stav;
    }
    
    public void tik() {
        switch (this.stav) {
            case "Vypnute" : 
                this.semafor1.rozsvietVsetko();
                this.semafor2.rozsvietVsetko();
                this.stav = "Zapnute";
                break;
            case "Zapnute" :
                this.semafor1.rozsvietPripravSa();
                this.semafor2.rozsvietPozor();
                this.stav = "Priprav sa";
                break;
            case "Stoj" :
                this.semafor1.rozsvietPripravSa();
                this.semafor2.rozsvietPozor();
                this.stav = "Priprav sa";
                break;
            case "Priprav sa" :
                this.semafor1.rozsvietVolno();
                this.semafor2.rozsvietStoj();
                this.stav = "Volno";
                break;
            case "Volno" :
                this.semafor1.rozsvietPozor();
                this.semafor2.rozsvietPripravSa();
                this.stav = "Pozor";
                break;
            case "Pozor" :
                this.semafor1.rozsvietStoj();
                this.semafor2.rozsvietVolno();
                this.stav = "Stoj";
                break;
        }
    }
}
