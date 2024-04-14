package com.cp.dev2.round939;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NeneCardGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            int result = 0;
            int n = scanner.nextInt();
            scanner.nextLine();
            Set<Integer> cards = new HashSet<>(n);
            while (n > 0) {
                n--;

                boolean added = cards.add(scanner.nextInt());
                if (!added) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
