package com.cp.tle.feb;

import java.util.Scanner;

public class GCDProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println((n-1)/2 + " " + ((n-1)/2+1) + " 1");
            } else {
                int temp = (n-1)/2;
                if (temp % 2 == 0) {
                    System.out.println((temp-1) + " " + (temp+1) + " 1");
                } else {
                    System.out.println((temp-2) + " " + (temp+2) + " 1");
                }
            }

            scanner.nextLine();
        }
    }
}
