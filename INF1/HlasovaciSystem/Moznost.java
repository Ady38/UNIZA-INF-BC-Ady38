import java.util.ArrayList;

public class Moznost {
    
    private String text;
    private int pocetHlasov;
    private ArrayList<String> hlasujuci;

    public Moznost(String text) {
        this.text = text;
        this.hlasujuci = new ArrayList<String>();
    }
    
    public void zvysPocetHlasov(String meno) {
        this.pocetHlasov++;
        this.hlasujuci.add(meno);
    }
    
    public int getPocetHlasov() {
        return this.pocetHlasov;
    }
    
    public String getText() {
        return this.text;
    }
    
    public String getHlasujuci() {
        int i = 0;
        String zoznam = "";
        for(String meno : this.hlasujuci) {
            if (i < hlasujuci.size() - 1) {
                zoznam += meno + ", ";
            } else {
                zoznam += meno;
            }
            i++;
        }
        return zoznam;
    }
}
