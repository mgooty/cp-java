package com.cp.tle.jan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TMTDocument {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;
            scanner.nextLine();
            char[] str = scanner.nextLine().toCharArray();

            List<Integer> ts = new ArrayList<>();
            List<Integer> ms = new ArrayList<>();
            for (int i=0; i< str.length; i++) {
                if ('M' == str[i]) {
                    ms.add(i);
                } else {
                    ts.add(i);
                }
            }

            boolean ans = true;
            if (ts.size() != ms.size()*2) {
                ans = false;
            } else {
                for (int i = 0; i < ms.size(); i++) {
                    if (!(
                            ms.get(i) > ts.get(i) &&
                            ms.get(i) < ts.get(i + ms.size()))
                    ) {
                        ans = false;
                    }
                }
            }

            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
