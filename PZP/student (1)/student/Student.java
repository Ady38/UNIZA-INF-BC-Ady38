/**
 * Trieda Student predstavuje studenta. Obsahuje jeho meno, osobne cislo
 * a prospech.
 */
public class Student {
    // meno studenta (Priezvisko, Meno)
    private String celeMeno;
    // osobne cislo studenta
    private String osobneCislo;
    // doteraz ziskane body
    private int body;
    //vek studenta
    private int vek;
    private int rok = 2023;

    /**
     * Vytvor noveho studenta so zadanym menom (Priezvisko, Meno osobnym cislom.
     * Nastavi jeho pocet bodov na nulu.
     */
    public Student(String celeMeno, String osobneCislo, int vek) {
        this.celeMeno = celeMeno;
        this.osobneCislo = osobneCislo;
        this.vek = vek;
        this.body = 0;
    }

    /**
     * Vrat cele meno (Priezvisko, Meno)
     */
    public String getCeleMeno() {
        return this.celeMeno;
    }
    
    /**
     * Vrat vek
     */
    public int getVek(){
        return this.vek;
    }
    /**
     * Vrat osobne cislo
     */
    public String getOsobneCislo() {
        return this.osobneCislo;
    }

    /**
     * Pridaj studentovi zadany pocet bodov
     */
    public void pridajBody(int ziskaneBody) {
        this.body += ziskaneBody;
        if(this.body > 100) this.body = 100;
    }

    /**
     * Vrat pocet ziskanych bodov.
     */
    public int getBody() {
        return this.body;
    }
    
    public String getZnamka(){
        String znamka = "";
        if(this.body<=100 && this.body >=93) znamka = "A";
        else if(this.body<=92 && this.body >=85) znamka = "B";
        else if(this.body<=84 && this.body >=77) znamka = "C";
        else if(this.body<=76 && this.body >=69) znamka = "D";
        else if(this.body<=68 && this.body >=61) znamka = "E";
        else znamka = "Fx";
        
        switch(znamka){
            case "A":return "A - Výborne";
            case "B":return "B - Ve¾mi dobre";
            case "C":return "C - Dobre";
            case "D":return "D - Uspokojivo";
            case "E":return "E - Dostatoène" ;
            case "Fx":return "Fx - Nedostatoène";
        }
        return"";
    }
    
    /**
     * Vypocitaj a vrat prihlasovacie meno studenta
     */
    public String getPrihlasovacieMeno() {
        return this.celeMeno.substring(0, 4)
            + this.osobneCislo.substring(0, 3);
    }
    
    /**
     * Vypocitaj a vrat rok narodenia studenta
     */
    public int getRokNarodenia(){
        return (this.rok-this.vek);
    }
}
