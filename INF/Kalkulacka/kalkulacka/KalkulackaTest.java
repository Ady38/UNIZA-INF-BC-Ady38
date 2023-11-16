

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KalkulackaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KalkulackaTest {
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
    }

    @Test
    public void spocitaj5A9() {
        Kalkulacka kalkulac1 = new Kalkulacka();
        kalkulac1.zadajCislo(5);
        kalkulac1.zaklOperacie('+', 9);
        assertEquals(14, kalkulac1.getCislo(), 0.1);
    }

    @Test
    public void vynasob8A3() {
        Kalkulacka kalkulac1 = new Kalkulacka();
        kalkulac1.zadajCislo(8);
        kalkulac1.zaklOperacie('*', 3);
        assertEquals(24, kalkulac1.getCislo(), 0.1);
    }
}



