package com.cp.tle.jan;

import java.util.Scanner;

public class MaximumGCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            long maxGCD = Long.MIN_VALUE;
            long num = scanner.nextLong();
            System.out.println(num / 2);
            scanner.nextLine();
        }
    }

    private static long gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }
}
