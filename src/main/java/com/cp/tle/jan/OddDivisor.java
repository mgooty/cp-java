package com.cp.tle.jan;

import java.util.Scanner;

public class OddDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;
            long num = scanner.nextLong();

            boolean exists = false;
            while (num > 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            scanner.nextLine();
        }
    }
}
