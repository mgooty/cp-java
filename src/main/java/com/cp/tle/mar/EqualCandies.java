package com.cp.tle.mar;

import java.util.Scanner;

public class EqualCandies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int numOfBoxes = Integer.parseInt(scanner.nextLine());
            long[] candies = new long[numOfBoxes];
            long min = Long.MAX_VALUE;
            for (int i = 0; i < numOfBoxes; i++) {
                candies[i] = scanner.nextLong();
                min = Math.min(min, candies[i]);
            }

            long candiesToEat = 0;
            for (int i = 0; i < numOfBoxes; i++) {
                if (candies[i] != min) {
                    candiesToEat += candies[i] - min;
                }
            }

            System.out.println(candiesToEat);
            scanner.nextLine();
            t--;
        }
    }
}
