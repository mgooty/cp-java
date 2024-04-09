package com.cp.tle.mar;

import java.util.Scanner;

public class DivisibilityProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            long num = scanner.nextLong();
            long divisor = scanner.nextLong();

            if (num <= divisor) {
                System.out.println(divisor-num);
            } else if (num % divisor == 0) {
                System.out.println(0);
            } else {
                long counter = (num / divisor) + 1;
                System.out.println((divisor*counter)-num);
            }

            scanner.nextLine();
            t--;
        }
    }
}
