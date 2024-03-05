package org.simple;

public class Fibonacci {
    public static long calculate(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        long prev = 1;
        long nxt = 1;
        for (int i = 3; i <= n; i++) {
            var temp = prev + nxt;
            prev = nxt;
            nxt = temp;
        }
        return nxt;
    }
}
