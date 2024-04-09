package com.cp.tle.jan;

import java.util.Scanner;

public class ProperNutrition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMoney = scanner.nextInt();
        scanner.nextLine();

        int a = scanner.nextInt();
        scanner.nextLine();

        int b = scanner.nextInt();
        scanner.nextLine();

        if (totalMoney % a == 0) {
            System.out.println("YES");
            System.out.print(totalMoney / a + " 0");
        } else if (totalMoney % b == 0) {
            System.out.println("YES");
            System.out.print("0 " + totalMoney / b);
        } else {
            int numOfAs = 0;
            while (true) {
                int remainingMoney = totalMoney - (a * numOfAs);
                if (remainingMoney < 0) {
                    System.out.println("NO");
                    break;
                }
                if (remainingMoney % b == 0) {
                    System.out.println("YES");
                    System.out.println(numOfAs + " " + remainingMoney / b);
                    break;
                }
                numOfAs++;
            }
        }


    }
}
