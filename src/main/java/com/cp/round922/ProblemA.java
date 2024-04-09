package com.cp.round922;

import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            int n = scanner.nextInt(); // h
            int m = scanner.nextInt(); // w

            System.out.println((m/2) * n);
            scanner.nextLine();
        }
    }
}
