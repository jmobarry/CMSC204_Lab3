import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest
{
    private GradeBook g1;
    private GradeBook g2;

    @Before
    public void setUp()
    {

        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        //Expected Sum =399.0
        //Expected Size = 5
        //Expected Minimum = 55.0
        //Expected Final Score = 344

        g1.addScore(72.0);
        g1.addScore(55.0);
        g1.addScore(100.0);
        g1.addScore(83.0);
        g1.addScore(89.0);

        //Expected Sum = 284.0
        //Expected Size = 5
        //Expected Minimum = 20.0
        //Expected Final Score = 264
        g2.addScore(20.0);
        g2.addScore(100.0);
        g2.addScore(44.0);
        g2.addScore(55.0);
        g2.addScore(65.0);
    }

    @After
    public void tearDown()
    {

        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore()
    {
        assertEquals(g1.toString(), "72.0 55.0 100.0 83.0 89.0");
        assertEquals(g2.toString(), "20.0 100.0 44.0 55.0 65.0");
        assertEquals(g1.getScoresSize(), 5);
        assertEquals(g2.getScoresSize(), 5);
    }

    @Test
    public void testSum()
    {
        assertEquals(g1.sum(), 399.0, 0.001);
        assertEquals(g2.sum(), 284.0, 0.001);
    }

    @Test
    public void testMinimum()
    {
        assertEquals(g1.minimum(), 55.0, 0.001);
        assertEquals(g2.minimum(), 20.0, 0.001);
    }

    @Test
    public void testFinalScore()
    {
        assertEquals(g1.finalScore(), 344.0, 0.001);
        assertEquals(g2.finalScore(), 264.0, 0.001);
    }
}