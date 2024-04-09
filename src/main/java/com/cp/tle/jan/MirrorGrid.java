package com.cp.tle.jan;

import java.util.Scanner;

public class MirrorGrid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            int n = scanner.nextInt();
            scanner.nextLine();

            int[][] grid = new int[n][n];
            int[][] memoize = new int[n][n];
            for (int i = 0; i < n; i++) {
                String str = scanner.nextLine();
                char[] items = str.toCharArray();
                for (int j = 0; j < n; j++) {
//                    int temp = scanner.nextInt();
                    grid[i][j] = Integer.valueOf(items[j]+"");
                }
//                scanner.nextLine();
            }

            int numOfChanges = 0;
            int zero_x, zero_y, ninety_x, ninety_y, oneeighty_x, oneeighty_y, twoseventy_x, twoseventy_y;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (memoize[i][j] == 1) {
                        continue;
                    }

                    zero_x = i;
                    zero_y = j;

                    ninety_x = zero_y;
                    ninety_y = n - zero_x - 1;

                    oneeighty_x = ninety_y;
                    oneeighty_y = n - ninety_x - 1;

                    twoseventy_x = oneeighty_y;
                    twoseventy_y = n - oneeighty_x - 1;

                    int temp = grid[zero_x][zero_y] + grid[ninety_x][ninety_y] + grid[oneeighty_x][oneeighty_y] + grid[twoseventy_x][twoseventy_y];
                    if (temp == 1 || temp == 3) {
                        numOfChanges += 1;
                    } else if (temp == 2) {
                        numOfChanges += 2;
                    }

                    memoize[zero_x][zero_y] = 1;
                    memoize[ninety_x][ninety_y] = 1;
                    memoize[oneeighty_x][oneeighty_y] = 1;
                    memoize[twoseventy_x][twoseventy_y] = 1;
                }
            }
            System.out.println(numOfChanges);
        }
    }
}
