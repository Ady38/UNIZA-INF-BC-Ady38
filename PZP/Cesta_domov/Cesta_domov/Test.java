
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test {
    private Main main;
    private Obdlznik biela;
    
    /**
     * Constructor for objects of class Test
     */
    public Test() {
        for(int i = 0; i < 25; i++) {
            this.main = new Main();
            this.main.main();
            this.biela = new Obdlznik();
            this.biela.zmenFarbu("white");
            this.biela.posunVodorovne(-60);
            this.biela.posunZvisle(-50);
            this.biela.zmenStrany(700, 500);
        }
    }

}
