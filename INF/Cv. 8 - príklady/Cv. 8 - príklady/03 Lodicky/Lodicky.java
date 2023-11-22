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
    
    /**
     * Constructor for objects of class Lodicky
     */
    public Lodicky(String nazovMapy) throws IOException {
        File subor = new File(nazovMapy);
        Scanner citac = new Scanner(subor);
        
        int x = Integer.valueOf(citac.next());
        int y = Integer.valueOf(citac.next());
        
        this.hraciaPlocha = new Policko[x][y];
        
        //Vytvorenie hracej plochy v grafickom vystupe
        for (int i = 0; i < x; i++){
            for (int j = 0;  j < y; j++) {
                this.hraciaPlocha[i][j] = new Policko(i*40,j*40,40);
            }
        }

    }
}
