package com.cp.round921;

import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            String str = "";
            char ch = 'a';
            for (int i = 0; i < k; i++) {
                str = str + ch;
                ch++;
            }

            String revStr = "";
            for (int i = str.length()-1; i >= 0; i--) {
                revStr = revStr + str.charAt(i);
            }

            for (int i = 1; i <= n; i++) {
                if (i%2 == 1) {
                    System.out.print(str);
                } else {
                    System.out.print(revStr);
                }
            }
            System.out.println();
        }
    }
}
