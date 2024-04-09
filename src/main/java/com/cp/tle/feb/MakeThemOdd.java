package com.cp.tle.feb;

import java.util.*;

public class MakeThemOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            long n = scanner.nextLong();

            TreeSet<Long> nums = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                long temp = scanner.nextLong();
                if (temp % 2 == 0) {
                    nums.add(temp);
                }
            }

            long result = 0;
            Iterator<Long> iterator = nums.descendingIterator();
            while (iterator.hasNext()) {
                Long num = iterator.next();
                iterator.remove();
                if (num%2 == 0) {
                    result++;
                    nums.add(num/2);
                }
            }

            System.out.println(result);
            t--;
            scanner.nextLine();
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            long n = scanner.nextLong();

            TreeSet<Long> nums = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                long temp = scanner.nextLong();
                if (temp % 2 == 0) {
                    nums.add(temp);
                }
            }

            Iterator<Long> iterator = nums.descendingIterator();
            Set<Long> result = new HashSet<>();
            while (iterator.hasNext()) {
                long num = iterator.next();
                while (num%2 == 0 && !result.contains(num)) {
                    result.add(num);
                    num /= 2;
                }
            }

            System.out.println(result.size());
            t--;
            scanner.nextLine();
        }
    }
}
