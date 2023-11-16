

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RodneCisloTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RodneCisloTest {
    private RodneCislo rodneCis1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        rodneCis1 = new RodneCislo(2023, 10, 30);
    }

    @Test
    public void zadavanieRodnehoCisla()
    {
        int rok = 2004;
        int mesiac = 8;
        int den = 30;
        rodneCis1.setDen(den);
        rodneCis1.setMesiac(mesiac);
        rodneCis1.setRok(rok);
        assertEquals(den, rodneCis1.getDen());
        assertEquals(mesiac, rodneCis1.getMesiac());
        assertEquals(rok, rodneCis1.getRok());
    }

    @Test
    public void spojenieDatumu()
    {
        rodneCis1.spojenieDatumu();
        assertEquals("231030", rodneCis1.getSpojenyDatum());
    }
    
    @Test
    public void spojenieRodCisla1()
    {
        rodneCis1.spojenieRodCisla("1998", 10, "03", true);
        assertEquals("986003", rodneCis1.getSpojenyDatum());
    }
    
    @Test
    public void spojenieRodCisla2()
    {
        rodneCis1.spojenieRodCisla("1998", 10, "03", false);
        assertEquals("981003", rodneCis1.getSpojenyDatum());
    }

    @Test
    public void kontrolaPlatnosti()
    {
        assertEquals(true, rodneCis1.skontrolujPlatnost("975605/9973"));
        assertEquals(false, rodneCis1.skontrolujPlatnost("965105/0273"));
        assertEquals(true, rodneCis1.skontrolujPlatnost("920120/8478"));
        assertEquals(true, rodneCis1.skontrolujPlatnost("770527/0518"));
        assertEquals(true, rodneCis1.skontrolujPlatnost("575426/3152"));
        assertEquals(true, rodneCis1.skontrolujPlatnost("940227/0977"));
        assertEquals(true, rodneCis1.skontrolujPlatnost("210417/0057"));
        assertEquals(true, rodneCis1.skontrolujPlatnost("040830/2532"));
    }
}





