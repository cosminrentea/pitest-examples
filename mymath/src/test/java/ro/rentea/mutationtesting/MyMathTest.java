package ro.rentea.mutationtesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    public void should_return_sum_of_parameters() {
        int sum = math.add(2, 1);
        assertEquals(sum, 3);
    }

    @Test
    public void should_return_value_under_threshold() {
        int v = math.valueUnderThreshold(1, 2);
        assertEquals(v, 1);
    }

    @Test
    public void should_return_threshold() {
        int v = math.valueUnderThreshold(2, 2);
        assertEquals(v, 2);
    }

    @Test
    public void should_return_threshold_for_larger_value() {
        int v = math.valueUnderThreshold(3, 2);
        assertEquals(v, 2);
    }

    @Test
    public void should_return_gcd() {
        int gcd = math.gcd(20, 8);
        assertEquals(gcd, 4);
    }

}
