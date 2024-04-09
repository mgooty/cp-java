package com.cp.tle.mar;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCols = scanner.nextInt();
        scanner.nextLine();

        int[] cols = new int[numOfCols];
        for (int i = 0; i < numOfCols; i++) {
            cols[i] = scanner.nextInt();
        }

        Arrays.sort(cols);
        for (int numOfCubes: cols) {
            System.out.print(numOfCubes + " ");
        }
    }
}
