
/**
 * Write a description of class pravouhly_hviezdicky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pravouhly_hviezdicky {
    private int vyska;
    
    /**
     * Constructor for objects of class pravouhly_hviezdicky
     */
    public pravouhly_hviezdicky(int vyska) {
        this.vyska = vyska;
    }
    
    public void nakresli(){
        for(int i = 0;i<vyska;i++){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");    
        }
    }
    
    public void test(){
        System.out.println (7.5/3);
    }
}
