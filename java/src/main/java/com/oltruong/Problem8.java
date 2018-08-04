package com.oltruong;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Long.max;

class Problem8 {
    private static final int DIGITS_TO_MULTIPLY = 13;

    static long getResult() throws IOException, URISyntaxException {
        final int[] numbers = buildNumberArray();

        long result = 0;
        for (int index = 0; index < numbers.length - DIGITS_TO_MULTIPLY; index++) {
            result = max(buildProduct(numbers, index), result);
        }
        return result;
    }

    private static int[] buildNumberArray() throws IOException, URISyntaxException {
        final String line = Files.readAllLines(Paths.get(Problem8.class.getResource("/problem8.txt").toURI())).get(0);

        final int[] numbers = new int[line.length()];

        for (int i = 0; i < line.length(); i++) {
            numbers[i] = Integer.parseInt(line.substring(i, i + 1));
        }
        return numbers;
    }

    private static long buildProduct(int[] numbers, int index) {
        long product = 1;
        for (int i = 0; i < DIGITS_TO_MULTIPLY; i++) {
            if (numbers[index + i] == 0) {
                return 0;
            }
            product *= numbers[index + i];
        }
        return product;
    }


}
