package com.oltruong;

import java.util.stream.IntStream;

class Problem17 {

    private static final String[] BASE = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENBASE = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] POWERS = {"", "", "hundred", "thousand"};


    static int getResult() {

        return findLettersOfNumbers(1000);
    }

    private static int findLettersOfNumbers(int maxNumber) {
        return IntStream.rangeClosed(0, maxNumber).map(Problem17::numberOfLetters).sum();
    }

    private static int numberOfLetters(int number) {
        return toLetters(number)
                .replaceAll(" |-", "")
                .length();
    }

    private static String toLetters(int number) {
        if (number < BASE.length) {
            return BASE[number];
        } else if (number < 100) {
            int divider = number / 10;
            int remainder = number % 10;
            return TENBASE[divider-2] + (remainder==0?"": "-" + BASE[remainder]);
        } else {
            for (int power=POWERS.length;power>1;power--){
                int tenthPower= (int) Math.pow(10,power);
                int divider =  number /tenthPower;
                int remainder = number % tenthPower;
                if (divider>0){
                    return BASE[divider]+" "+POWERS[power]+ (remainder==0?"":" and "+toLetters(remainder));
                }
            }
        }

        throw new IllegalArgumentException("Cannot parse "+number);
    }

}