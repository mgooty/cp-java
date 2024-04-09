package com.cp.round921;

import java.util.Scanner;

public class ProblemB {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            long x = scanner.nextLong();
            long n = scanner.nextLong();

            if (x % n == 0) {
                System.out.println(x/n);
            } else {
                long temp = x / n;
                long remaining = x - (x * (n-1));
                if (remaining % temp == 0) {
                    System.out.println(temp);
                } else {
                    System.out.println(1);
                }
            }

            scanner.nextLine();
        }


    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            long x = scanner.nextLong();
            long n = scanner.nextLong();

            long result = 0;
            long count = 1;
            while (n * count <= x) {
                long temp = n * count;
                if ((x-temp) % count == 0) {
                    result = Math.max(result, count);
                }
                count++;
            }

            System.out.println(result);
        }

    }
}
