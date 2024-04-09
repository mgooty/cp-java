package com.cp.tle.mar;

import java.util.Scanner;

public class Crypto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            long num = scanner.nextLong();

            if (num%2 == 0) {
                System.out.println("2 " + num/2);
            } else {
                if (num-1 == 4) {
                    System.out.println("2 4");
                } else {
                    System.out.println("2 " + (num-1)/2);
                }
            }

            scanner.nextLine();
            t--;
        }
    }
}
