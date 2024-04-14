package com.cp.dev2.round939;

import java.util.Scanner;

public class NenesGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;
            scanner.nextInt();
            int numOfInitialPositions = scanner.nextInt();
            int lowest = scanner.nextInt();

            scanner.nextLine();
            for (int i = 0; i < numOfInitialPositions; i++) {
                int initial = scanner.nextInt();
                if (initial < lowest) {
                    System.out.print(initial + " ");
                } else {
                    System.out.print(lowest-1 + " ");
                }
            }
            System.out.println();
        }
    }
}
