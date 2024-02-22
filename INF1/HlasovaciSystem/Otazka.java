import java.util.ArrayList;

public class Otazka {
    
    private TypOtazky typ;
    private String text;
    private boolean tajne;
    private ArrayList<Moznost> moznosti;
    private int pocetHlasov;
    
    public Otazka(TypOtazky typ, String text,boolean jeTajne) {
        this.moznosti = new ArrayList<Moznost>();
        this.text = text;
        this.typ = typ;
        this.tajne = jeTajne;
        if(typ == TypOtazky.ANO_NIE) {
            this.moznosti.add(new Moznost("Ano"));
            this.moznosti.add(new Moznost("Nie"));
        }
    }
    
    public void pridajMoznost(String text) {
        if(this.typ == TypOtazky.ANO_NIE) {
            System.out.println("Do hlasovania typu Ano/Nie nie je mozne" +  
            " pridat dalsiu moznost");
        } else {
            this.moznosti.add(new Moznost(text));
        }
    }
    
    public void zapocitajHlas(int moznost, String meno){
        this.moznosti.get(moznost-1).zvysPocetHlasov(meno);
        this.pocetHlasov++;
    }
    
    public void vypisOtazku(boolean zobrazVysledky) {
        System.out.println(this.text);
        for (int i = 0; i < this.moznosti.size(); i++) {
            String ostatne = "";
            
            
            if (zobrazVysledky) {
                double percenta = 0;
                if (this.pocetHlasov != 0) {
                     percenta = (double)this.moznosti.get(i).getPocetHlasov() / this.pocetHlasov * 100;
                    }
                ostatne = String.format("%20.2f %% [%d]", percenta, this.moznosti.get(i).getPocetHlasov());
            }
            
            int j = i+1;
            System.out.println("    " + j + ". " + this.moznosti.get(i).getText() + ostatne);
            
            if (zobrazVysledky && !this.tajne) {
                System.out.println("    " + this.moznosti.get(i).getHlasujuci());
                }
        }
    }
    
    public void vypisVysledok() {
        String vysledok = this.zistiVysledok();
        if(vysledok != null){
            System.out.println("Otazka uspesna, vysledok:");
            System.out.println(vysledok);
        } else {
            System.out.println("Otazka neuspesna");
        }
    }
    
    private String zistiVysledok() {
        for (Moznost moznost : this.moznosti) {
            double percenta = 0;
            if (this.pocetHlasov != 0) {
                percenta = (double)moznost.getPocetHlasov() / this.pocetHlasov * 100;
            }
            
            if(percenta > 50) {
                return(moznost.getText() + String.format(" - %.2f %%", percenta));
            }
        }
        return null;
    }
}
