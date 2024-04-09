package com.cp.tle.feb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        List<Integer> randomPositiveEvenNumbers = generateRandomPositiveEvenNumbers(200000);

        // Print the first 10 numbers as an example
        for (int i = 0; i < 200000; i++) {
            System.out.print(randomPositiveEvenNumbers.get(i) + " ");
        }
    }

    private static List<Integer> generateRandomPositiveEvenNumbers(int count) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomEvenNumber = random.nextInt(1000000000) * 2 + 2; // Adjust the range as needed
            numbers.add(randomEvenNumber);
        }

        return numbers;
    }
}
