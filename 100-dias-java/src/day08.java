import java.util.*;

public class day08 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }

        String[] mappings = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        List<String> combinations = new ArrayList<>();
        combinations.add("");

        for (char digit : digits.toCharArray()) {
            List<String> newCombinations = new ArrayList<>();
            for (String combination : combinations) {
                for (char letter : mappings[Character.getNumericValue(digit)].toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }
            combinations = newCombinations;
        }

        return combinations;
    }
}