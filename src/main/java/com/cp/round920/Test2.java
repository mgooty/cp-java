package com.cp.round920;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int num = scanner.nextInt();
            scanner.nextLine();

            char[] before = scanner.nextLine().toCharArray();
            char[] after = scanner.nextLine().toCharArray();

            int beforeCats = 0;
            int afterCats = 0;
            for (int i = 0; i < num; i++) {
                if (before[i] != after[i]) {
                    if (before[i] == '1') {
                        beforeCats++;
                    }

                    if (after[i] == '1') {
                        afterCats++;
                    }
                }
            }
            System.out.println(Math.max(beforeCats, afterCats));

            t--;
        }

    }
}
