package com.oltruong;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

class Problem11 {

    private static List<ProductBuilder> possibleProducts = List.of(
            Problem11::buildVerticalProduct,
            Problem11::buildHorizontalProduct,
            Problem11::buildDiagonalAscendingProduct,
            Problem11::buildDiagonalDescendingProduct);


    static int getResult() throws Exception {
        int[][] matrix = loadMatrix();
        return findMaxProduct(matrix);
    }

    private static int[][] loadMatrix() throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(Problem11.class.getResource("/problem11.txt").toURI()));
        int[][] matrix = new int[lines.size()][lines.size()];

        IntStream.range(0, matrix.length).forEach(i -> matrix[i] = splitNumbers(lines.get(i)));

        return matrix;
    }

    private static int[] splitNumbers(String line) {
        final String[] numbersAsString = line.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        return numbers;
    }

    private static int findMaxProduct(int[][] matrix) {
        int maxProduct = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                maxProduct = Math.max(maxProduct, computeLocalMaxProduct(matrix, i, j));
            }
        }
        return maxProduct;
    }

    private static int computeLocalMaxProduct(int[][] matrix, int i, int j) {
        return possibleProducts.stream().mapToInt(product -> product.buildProduct(matrix, i, j)).max().orElse(0);
    }

    @FunctionalInterface
    interface ProductBuilder {
        int buildProduct(int[][] matrix, int i, int j);
    }

    private static int buildHorizontalProduct(int[][] matrix, int i, int j) {
        if (j < matrix[i].length - 3) {
            int product = 1;
            for (int k = 0; k < 4; k++) {
                product *= matrix[i][j + k];
            }
            return product;
        } else {
            return 0;
        }
    }

    private static int buildVerticalProduct(int[][] matrix, int i, int j) {
        if (i < matrix.length - 3) {
            int product = 1;
            for (int k = 0; k < 4; k++) {
                product *= matrix[i + k][j];
            }
            return product;
        } else {
            return 0;
        }
    }

    private static int buildDiagonalAscendingProduct(int[][] matrix, int i, int j) {
        if (i < matrix.length - 3 && j >= 3) {
            int product = 1;
            for (int k = 0; k < 4; k++) {
                product *= matrix[i + k][j - k];
            }
            return product;
        } else {
            return 0;
        }
    }

    private static int buildDiagonalDescendingProduct(int[][] matrix, int i, int j) {
        if (i < matrix.length - 3 && j < matrix[i].length - 3) {
            int product = 1;
            for (int k = 0; k < 4; k++) {
                product *= matrix[i + k][j + k];
            }
            return product;
        } else {
            return 0;
        }
    }

}
