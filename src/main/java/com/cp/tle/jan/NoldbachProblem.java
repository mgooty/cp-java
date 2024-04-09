package com.cp.tle.jan;

import java.util.*;

public class NoldbachProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOfPrimes = scanner.nextInt();

        List<Integer> globalPrimes = new ArrayList<>();
        int result = 0;
        for (int i = 2; i <= n; i++) {
            if (!isPrime(i)) {
                continue;
            }

            globalPrimes.add(i);

        }

        for (int i = 0; i < globalPrimes.size() - 1; i++) {
            int sum = globalPrimes.get(i) + globalPrimes.get(i+1) + 1;
            if (globalPrimes.contains(sum)) {
                result++;
            }

            if (result == numOfPrimes) {
                break;
            }
        }

        if (result == numOfPrimes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
