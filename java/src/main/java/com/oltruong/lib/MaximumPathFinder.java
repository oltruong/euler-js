package com.oltruong.lib;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class MaximumPathFinder {

    public static int findMaximumPath(String fileName) throws Exception {
        Integer[][] triangle = loadTriangle(fileName);

        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        return triangle[0][0];
    }

    private static Integer[][] loadTriangle(String fileName) throws Exception {

        try (Stream<String> lines = Files.lines(Paths.get(MaximumPathFinder.class.getResource(fileName).toURI()))) {
            return lines
                    .map(stringCharacter -> Arrays.stream(stringCharacter.split(" "))
                                                  .map(Integer::parseInt)
                                                  .toArray(Integer[]::new))
                    .toArray(Integer[][]::new);
        }

    }
}
