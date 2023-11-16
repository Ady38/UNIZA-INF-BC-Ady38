import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Casovac implements ActionListener {
    private Krizovatka krizovatka;
    private Timer timer;
    
    private long oldTick;    
    private static final long TICK_LENGTH = 250000000;   

    /**
     * Vytvori casovac.
     * 
     * @param krizovatka krizovatka, v ktorej sa casovac nachadza a 
     *                   posiela jej pravidelne spravu tik()        
     */
    public Casovac(Krizovatka krizovatka) {
        this.krizovatka = krizovatka;
        
        this.timer = new javax.swing.Timer(3000, null);        
        this.timer.addActionListener(this);      
        
        this.oldTick = 0;
        this.timer.start();
    }
    
    public void actionPerformed(ActionEvent event) {
        long newTick = System.nanoTime();
        if (newTick - this.oldTick >= Casovac.TICK_LENGTH || newTick < Casovac.TICK_LENGTH) {
            this.oldTick = (newTick / Casovac.TICK_LENGTH) * Casovac.TICK_LENGTH;
            this.krizovatka.tik(); 
        }
    }  
}
