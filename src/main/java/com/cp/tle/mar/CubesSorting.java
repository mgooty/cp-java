package com.cp.tle.mar;

import java.util.Scanner;

public class CubesSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int numOfCubes = Integer.parseInt(scanner.nextLine());
            int maxNumOfMoves = ((numOfCubes * (numOfCubes-1))/2)-1;

            long[] cubes = new long[numOfCubes];
            for (int i = 0; i < numOfCubes; i++) {
                cubes[i] = scanner.nextLong();
            }

            int numOfMoves = 0;
            for (int prev = 0; prev < numOfCubes; prev++) {
                for (int j = prev+1; j < numOfCubes-prev; j++) {
                    if (cubes[prev] > cubes[j]) {
                        long temp = cubes[prev];
                        cubes[prev] = cubes[j];
                        cubes[j] = temp;
                        numOfMoves++;
                    }

                    if (numOfMoves > maxNumOfMoves) {
                        break;
                    }
                }
                if (numOfMoves > maxNumOfMoves) {
                    break;
                }
            }

            if (numOfMoves > maxNumOfMoves) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            scanner.nextLine();
            t--;
        }
    }
}
