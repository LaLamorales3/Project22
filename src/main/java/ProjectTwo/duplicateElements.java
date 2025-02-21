package ProjectTwo;


import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class duplicateElements {
    public static void printDuplicateElements (@org.jetbrains.annotations.NotNull String @NotNull [] arr) {
        Set<String> uniqueElements = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String str : arr) {
            if (!uniqueElements.add(str)) {
                duplicates.add(str);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape"};
        printDuplicateElements(words);
    }
}
