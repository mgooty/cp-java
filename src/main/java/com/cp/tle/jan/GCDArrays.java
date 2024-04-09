package com.cp.tle.jan;

import java.util.Scanner;

public class GCDArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long k = scanner.nextLong();

            long numOfElements = (r - l) + 1;
            long numOfOdds = 0;
            if (numOfElements == 1) {
                 if (l == 1) {
                     System.out.println("NO");
                 } else {
                     System.out.println("YES");
                 }
            } else {
                if (numOfElements % 2 == 0) {
                    numOfOdds = numOfElements / 2;
                } else {
                    if (l % 2 == 0) {
                        numOfOdds = numOfElements / 2;
                    } else {
                        numOfOdds = (numOfElements / 2) + 1;
                    }
                }

                if (k >= numOfOdds) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
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
