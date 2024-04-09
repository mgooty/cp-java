package com.cp.round920;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();

            List<Long> list1 = new ArrayList<>(n);
            List<Long> list2 = new ArrayList<>(m);

            for (int i = 0; i < n; i++) {
                list1.add(scanner.nextLong());
            }

            for (int i = 0; i < m; i++) {
                list2.add(scanner.nextLong());
            }

            list1.sort(Comparator.naturalOrder());
            list2.sort(Comparator.naturalOrder());

            long result = 0;
            int al = 0, ar = n-1, bl = 0, br = m-1;
            for (int i = 0; i < n; i++) {
                long temp1 = Math.abs(list1.get(al) - list2.get(br));
                long temp2 = Math.abs(list1.get(ar) - list2.get(bl));
                result += Math.max(temp1, temp2);

                if (temp1 > temp2) {
                    al++;
                    br--;
                } else {
                    ar--;
                    bl++;
                }
            }

            System.out.println(result);
            t--;
        }

    }
}
