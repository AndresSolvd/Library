package com.solvd;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class UniqueWordCounter {
    public static void uniqueWordCounter() throws IOException {
        // Read file, split string at one or more whitespace characters and store in array of words.
        // Convert array to Stream<String>. Use distinct() to rule out repeated word, the use count() to count.
        long uniqueWordCount = Arrays.stream(
                        FileUtils.readFileToString(new File("src/main/resources/The-fixer.txt"),
                                "UTF-8").split("\\s+"))
                .distinct().count();
        // Result of unique words from count() is printed in the console and in a new file called output.
        FileUtils.writeStringToFile(new File("scr/main/resources/output.txt"), "Number of unique words: "
                + uniqueWordCount, "UTF-8");
        System.out.println("Number of unique words: " + uniqueWordCount);
    }
}