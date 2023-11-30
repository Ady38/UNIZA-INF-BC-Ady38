
/**
 * Write a description of class Turnaj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turnaj {
    
    private Tim[] prihlaseneTimy;
    private Vysledok[][] tabulka;
    private boolean uzavrety;
    
    /**
     * Constructor for objects of class Turnaj
     */
    public Turnaj(String[] timy, ZoznamTimov liga) {
        this.uzavrety = false;
        this.prihlaseneTimy = new Tim[timy.length];
        this.tabulka = new Vysledok[timy.length][timy.length];

        for(int i = 0; i < timy.length; i++) {
            this.prihlaseneTimy[i] = liga.getTim(timy[i]);

            for(int j = 0; j < timy.length; j++) {
                if (i == j) {
                    this.tabulka[i][j] = Vysledok.NEHRA_SA;
                } else {
                    this.tabulka[i][j] = Vysledok.NEODOHRANE;
                }
            }
        }
    }
    
    public void uzavriTurnaj() {
        this.uzavrety = true;
    }
    
    public boolean vlozVysledokDoTabulky(int x, int y, Vysledok vysledok) {
        if (uzavrety || x == y || x > this.prihlaseneTimy.length - 1 || 
        y > this.prihlaseneTimy.length - 1 || tabulka[x][y] != Vysledok.NEODOHRANE) {
            return false;
        }
        this.tabulka[x][y] = vysledok;
        return true;
    }
    
    public void vypisTabulku() {
        int pocet = (this.prihlaseneTimy.length+1)*16;
        String line = "_".repeat(pocet);
        System.out.println(line);

        System.out.print("|");
        System.out.format("%-15s","");
        System.out.print("|");

        for (int i = 0; i < this.prihlaseneTimy.length; i++) {
            System.out.format("%-15s",this.prihlaseneTimy[i].getNazovTimu());
            System.out.print("|");
        }
            System.out.println();
            System.out.println(line);


        System.out.println();
        for (int i = 0; i < this.prihlaseneTimy.length; i++) {
            System.out.print("|");
            System.out.format("%-15s",this.prihlaseneTimy[i].getNazovTimu());
            System.out.print("|");
            for(int j = 0; j < this.prihlaseneTimy.length; j++) {
                System.out.format("%-15s",tabulka[i][j]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println(line);
        }
    }
}
