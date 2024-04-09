package com.cp.round921;

import java.util.*;

public class ProblemC {

    public static void main1(String[] args) {
        System.out.println((char) ('a' + 3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();

            String result = "";
            Set<Character> blockItems = new HashSet<>();
            String str = scanner.nextLine();
            for (int i = 0; i < m; i++) {
                char ch = str.charAt(i);
                blockItems.add(ch);

                if (blockItems.size() == k) {
                    result += ch;
                    blockItems = new TreeSet<>();
                }
            }

            if (result.length() >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                char missing = ' ';
                for (int j=0; j<k; j++) {
                    char c = (char) ('a' + j);
                    if (!blockItems.contains(c)) {
                        missing = c;
                        break;
                    }
                }

                while (result.length() < n) {
                    result += missing;
                }
                System.out.println(result);
            }

            t--;
        }
    }
}
