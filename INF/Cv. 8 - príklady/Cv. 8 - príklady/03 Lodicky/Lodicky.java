import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * Write a description of class Lodicky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lodicky {
    
    private Policko[][] hraciaPlocha;
    private Lodka [] lodky;
    
    /**
     * Constructor for objects of class Lodicky
     */
    public Lodicky(int velkostPolicka, String nazovMapy) throws IOException {
        File subor = new File(nazovMapy);
        Scanner citac = new Scanner(subor);
        
        int x = Integer.valueOf(citac.next());
        int y = Integer.valueOf(citac.next());
        int pocetLodiek = Integer.valueOf(citac.next());
        
        this.hraciaPlocha = new Policko[x][y];
        
        this.lodky = new Lodka[pocetLodiek];
        
        for (int i = 0;  i < y; i++) {
                this.lodky[i] = new Lodka();
            }
        
        //Vytvorenie hracej plochy v grafickom vystupe
        for (int i = 0; i < x; i++){
            for (int j = 0;  j < y; j++) {
                this.hraciaPlocha[i][j] = new Policko(i,j,velkostPolicka);
                
                int cisloLodky = citac.nextInt();
                if (cisloLodky != 0) {
                    Lodka lodka = this.lodky[cisloLodky - 1];
                    this.hraciaPlocha[y][x].priradLodku(lodka);
                }
            }
        }
        
        citac.close();
    }
    
    public void zasiahnu(int x ,int y) {
        this.hraciaPlocha[x][y].zasiahni();
    }
    
}
