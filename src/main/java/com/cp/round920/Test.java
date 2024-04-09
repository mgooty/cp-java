package com.cp.round920;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        int x1, y1, x2, y2, x3, y3, x4, y4;
        while (t > 0) {
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            scanner.nextLine();

            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            scanner.nextLine();

            x3 = scanner.nextInt();
            y3 = scanner.nextInt();
            scanner.nextLine();

            x4 = scanner.nextInt();
            y4 = scanner.nextInt();
            scanner.nextLine();

            if (x1 == x2) {
                System.out.println((y2-y1) * (y2-y1));
            } else if (x1 == x3) {
                System.out.println((y3-y1) * (y3-y1));
            } else if (x1 == x4) {
                System.out.println((y4-y1) * (y4-y1));
            } else if (x2 == x3) {
                System.out.println((y3-y2) * (y3-y2));
            } else if (x2 == x4) {
                System.out.println((y4-y2) * (y4-y2));
            } else if (x3 == x4) {
                System.out.println((y4-y3) * (y4-y3));
            }

            t--;
        }
    }
}
