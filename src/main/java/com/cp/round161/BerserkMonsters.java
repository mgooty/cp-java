package com.cp.round161;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BerserkMonsters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            t--;

            int n = scanner.nextInt();
            scanner.nextLine();

            long[] attacks = new long[n];
            long[] defences = new long[n];

            for (int i = 0; i < n; i++) {
                attacks[i] = scanner.nextInt();
            }
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                defences[i] = scanner.nextInt();
            }
            scanner.nextLine();

            if (attacks.length == 1) {
                System.out.println(0);
                continue;
            }

            List<Integer> deathsAfterEachRound = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                long[] postRoundAttacks = new long[attacks.length];
                for (int i = 0; i < attacks.length; i++) {
                    int attacksLen = attacks.length;
                    if (attacks[i] == 0) {
                        continue;
                    }

                    if (i == 0 && attacks[1] != 0) {
                        postRoundAttacks[1] = postRoundAttacks[1] + attacks[i];
                    } else if (i == attacksLen-1 && attacks[attacksLen-2] != 0) {
                        postRoundAttacks[attacksLen-2] = postRoundAttacks[attacksLen-2] + attacks[attacksLen-1];
                    } else {
                        if (attacks[i-1] != 0) {
                            postRoundAttacks[i-1] = postRoundAttacks[i-1] +  attacks[i];
                        }

                        if (attacks[i+1] != 0) {
                            postRoundAttacks[i+1] = postRoundAttacks[i+1] +  attacks[i];
                        }
                    }
                }

                int deaths = 0;
                for (int i = 0; i < attacks.length; i++) {
                    if (postRoundAttacks[i] > defences[i]) {
                        deaths++;
                        attacks[i] = 0;
                    }
                }

                int counter = 0;
                long[] tempAttacks = new long[attacks.length-deaths];
                long[] tempDefences = new long[attacks.length-deaths];
                for (int i = 0; i < attacks.length; i++) {
                    if (attacks[i] != 0) {
                        tempAttacks[counter] = attacks[i];
                        tempDefences[counter] = defences[i];
                        counter++;
                    }
                }
                attacks = tempAttacks;
                defences = tempDefences;
                deathsAfterEachRound.add(deaths);

                if (attacks.length == 1 || attacks.length == 0 || deaths == 0) {
                    break;
                }
            }

            for (Integer deaths: deathsAfterEachRound) {
                System.out.print(deaths + " ");
            }

            for (int i = deathsAfterEachRound.size(); i < n; i++) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
