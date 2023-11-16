package ua.lpnu;

import org.junit.Assert;
import org.junit.Test;


public class AppTest extends Assert
{
    @Test
    public void testFactorial()
    {
        final double expected = 5040.0;
        final double actual = App.factorial(7);
        assertEquals( expected, actual, 0 );
    }

    @Test
    public void testErr()
    {
        final double expected = 1296.0;
        final double actual = App.err(6.0, 3);
        assertEquals( expected, actual, 0 );
    }

    @Test
    public void testP()
    {
        final double expected = -26.9;
        final double actual = App.p(8.0, 7);
        assertEquals( expected, actual, 0.007 );
    }

    @Test(timeout = 5000)
    public void testTeylor()
    {
        final double expected = Math.sin(2.5);
        final double actual = App.teylor(2.5, expected, 0.001);
        assertEquals( expected, actual, 0.001 );
    }
}
