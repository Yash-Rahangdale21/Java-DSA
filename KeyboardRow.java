import java.util.*;
public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        for (String word : result) {
            System.out.println(word);
        }
    }

    public static String[] findWords(String[] words) {
        String[] keyboardRows = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (canBeTypedInOneRow(word.toLowerCase(), keyboardRows)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    private static boolean canBeTypedInOneRow(String word, String[] keyboardRows) {
        for (String row : keyboardRows) {
            if (row.contains(String.valueOf(word.charAt(0)))) {
                for (char c : word.toCharArray()) {
                    if (!row.contains(String.valueOf(c))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
