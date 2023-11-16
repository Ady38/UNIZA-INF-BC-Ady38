

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
    private Kalkulacka kalkulac1;

    

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        kalkulac1 = new Kalkulacka();
    }

    @Test
    public void spociataj5A9()
    {
        kalkulac1.zadajCislo(5);
        kalkulac1.pripocitaj(9);
        assertEquals(14, kalkulac1.getVysledok(), 0.1);
    }

    @Test
    public void vynasob8A3()
    {
        kalkulac1.zadajCislo(8);
        kalkulac1.vynasob(3);
        assertEquals(24, kalkulac1.getVysledok(), 0.1);
    }

    @Test
    public void vypocitaj5Plus9()
    {
        kalkulac1.zadajCislo(5);
        assertEquals(true, kalkulac1.vypocitaj("+", 9));
        assertEquals(14, kalkulac1.getVysledok(), 0.1);
    }
}



