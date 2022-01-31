package it.unikey;

public class Fibonacci {
    public static void fibonacciStamp(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = fibonacci[1] = 1;

        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);
        for (int i = 2; i<n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            System.out.println(fibonacci[i]);
        }
    }
}
