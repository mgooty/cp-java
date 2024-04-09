package com.cp.tle.jan;

import java.util.Scanner;

public class LuckyDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean result = false;
        for (int i = 4; i <= n; i++) {
            if (isLuckyNum(i)) {
                if (n % i == 0) {
                    result = true;
                    break;
                }
            }
        }

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isLuckyNum(int n) {
        while (n > 0) {
            int temp = n % 10;
            if (temp != 4 && temp != 7) {
                return false;
            }

            n = n / 10;
        }

        return true;
    }
}
