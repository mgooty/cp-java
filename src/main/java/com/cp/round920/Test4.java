package com.cp.round920;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int n = scanner.nextInt(); // num of messages
            long f = scanner.nextInt(); // initial phone's charge
            long a = scanner.nextInt(); // charge consumption per unit of time
            long b = scanner.nextInt(); // consumption when turned off and on
            scanner.nextLine();

            Long moment = 0l;
            Long totalConsumption = 0l;
            for (int i = 0; i < n; i++) {
                long nextMoment = scanner.nextLong();

                long consUntilNextMoment = (nextMoment - moment) * a;
                totalConsumption += Math.min(consUntilNextMoment, b);
                moment = nextMoment;
            }

            if (totalConsumption < f) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }

    }
}
