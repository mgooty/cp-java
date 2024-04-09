package com.cp.tle.jan;

import java.util.Scanner;

public class DivideAndConquer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();

            long numOfOdds = 0;
            long items[] = new long[n];
            for (int i = 0; i < n; i++) {
                items[i] = scanner.nextLong();
                if (items[i] % 2 == 1) {
                    numOfOdds++;
                }
            }

            long result = Long.MAX_VALUE;
            if (numOfOdds % 2 == 0) {
                System.out.println(0);
            } else {
                for (int i = 0; i < n; i++) {
                    long count = 0;
                    long num = items[i];
                    if (num % 2 == 0) {
                        while (num % 2 == 0) {
                            num = num / 2;
                            count++;
                        }
                    } else {
                        while (num % 2 == 1) {
                            num = num / 2;
                            count++;
                        }
                    }
                    result = Math.min(result, count);
                }
                System.out.println(result);
            }

            scanner.nextLine();
            t--;
        }
    }
}
