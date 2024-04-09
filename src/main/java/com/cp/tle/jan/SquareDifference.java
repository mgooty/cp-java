package com.cp.tle.jan;

import java.math.BigInteger;
import java.util.Scanner;

public class SquareDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            long big = scanner.nextLong();
            long small = scanner.nextLong();

            if ((big-small) == 1 && isPrime(big+small)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            scanner.nextLine();
        }
    }

    private static boolean isPrime(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
