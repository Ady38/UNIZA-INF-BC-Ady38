
/**
 * Write a description of class CirkusStringerto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CirkusStringerto {
    private String retazec;

    public CirkusStringerto(String retazec) {
        this.retazec = retazec;
    }
    
    public String getRetazec() {
        return this.retazec;
    }   

    public void setRetazec(String novyRetazec) {
        this.retazec = novyRetazec;
    }
    
    public String opakujRetazec(int pocet) {
        return retazec.repeat(pocet);
    }
    
    public boolean jePalindrom() {
        char x = this.retazec.charAt(0);
        char y = this.retazec.charAt(this.retazec.length()-1);
        x = Character.toLowerCase(x);
        y = Character.toLowerCase(y);
        int i = 1;
        while (x == y) {
            x = this.retazec.charAt(i);
            y = this.retazec.charAt(this.retazec.length() - i - 1);
            x = Character.toLowerCase(x);
            y = Character.toLowerCase(y);
            i++;
            if (i == this.retazec.length()){
            return true;
        }
        }
        return false;
    }
    
    public void posuvaj(int pocetKrokov) {
        String posun = " ";
        for (int i = 0; i < pocetKrokov; i++) {
            System.out.println(posun.repeat(i) + this.retazec);
        }
    }       
       
}
