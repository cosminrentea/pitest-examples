package ro.rentea.mutationtesting;

public class MyMath {

    public int add(int a, int b) {
        return a + b;
    }

    // low-pass filter
    public int valueUnderThreshold(int value, int threshold) {
        if (value < threshold) {
            return value;
        }
        return threshold;
    }

    // greatest common denominator
    public int gcd(int a, int b) {
        int t;
        int x = a;
        int y = b;
        while (y != 0) {
            t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

}
