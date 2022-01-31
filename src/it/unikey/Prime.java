package it.unikey;

import java.util.Scanner;

public class Prime {

    public static void primesToStamp() {
        int n = getPrime();
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime (int n) {
        if (n ==0 || n == 1){
            return false;
        }
        else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getPrime() {
        Scanner leggi = new Scanner(System.in);
        System.out.println("Dimmi quanti numeri primi devo stampare: ");
        return leggi.nextInt();
    }

}
