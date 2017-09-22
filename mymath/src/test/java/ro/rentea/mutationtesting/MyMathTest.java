package ro.rentea.mutationtesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    public void should_return_sum_of_parameters() {
        int sum = math.add(3, 0);
    }

    @Test
    public void should_check_threshold() {
        int v = math.valueUnderThreshold(2, 2);
    }

    @Test
    public void should_check_threshold_2() {
        int v = math.valueUnderThreshold(1, 2);
    }

    @Test
    public void should_return_gcd() {
        int gcd = math.gcd(8, 8);
    }

}
