package com.solvd;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class UniqueWordCounter {
    public static void uniqueWordCounter() throws IOException {
        // Read file, remove any non alphabet character, split by whitespace characters and store in array.
        // Convert array to Stream<String>. Use distinct() to rule out repeated word, the use count() to count.
        long uniqueWordCount = Arrays.stream(
                        FileUtils.readFileToString(new File("src/main/resources/The-fixer.txt"),
                                "UTF-8").replaceAll("\\W", " ").split("\\s+"))
                .distinct().count();
        // Print count() output on file output
        FileUtils.writeStringToFile(new File("src/main/resources/output.txt"), "Number of unique words: "
                + uniqueWordCount, "UTF-8");
/*
        // Print in console
        System.out.println("Number of unique words: " + uniqueWordCount);
        Arrays.stream(FileUtils.readFileToString(new File("src/main/resources/The-fixer.txt"),
                                "UTF-8").replaceAll("\\W", " ").split("\\s+"))
                .distinct().forEach(System.out::println);
*/
    }
}