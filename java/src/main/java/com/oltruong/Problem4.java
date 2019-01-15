package com.oltruong;

class Problem4 {

    static int getResult() {
        int maxPalindrom = -1;

        for (int i = 100; i < 1_000; i++) {
            for (int j = 100; j <= i; j++) {
                int product = i * j;
                if (isPalindrom(product) && product > maxPalindrom) {
                    maxPalindrom = product;
                }
            }
        }
        return maxPalindrom;
    }

    private static boolean isPalindrom(int product) {
        return firstMethod(product);
//        return secondMethod(product);
    }

    private static boolean firstMethod(int product) {
        int[] intArray = new int[6];
        int index = 0;
        while (product > 0) {
            intArray[index] = product % 10;
            product /= 10;
            index++;
        }

        boolean verdict = true;

        for (int i = 0; verdict && i < intArray.length ; i++) {
            verdict = intArray[i] == intArray[intArray.length - i - 1];
        }
        return verdict;
    }

    private static boolean secondMethod(int product) {
        String productString = String.valueOf(product);

        final char[] chars = productString.toCharArray();

        boolean verdict = true;
        for (int j = 0; verdict && j < chars.length; j++) {
            verdict = chars[j] == chars[chars.length - 1 - j];
        }

        return verdict;
    }
}
