public class main33 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example test
        String licensePlate = "aBc 12c";
        String[] words = {"abccdef", "caaacab", "cbca"};
        
        String ans = sol.shortestCompletingWord(licensePlate, words);
        System.out.println("Shortest Completing Word: " + ans);
    }
}

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // Count letters in licensePlate
        int[] target = countLetters(licensePlate);
        
        String result = null;
        
        for (String word : words) {
            if (covers(word, target)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        
        return result;
    }
    
    // Count frequency of letters in a string
    private int[] countLetters(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                count[Character.toLowerCase(ch) - 'a']++;
            }
        }
        return count;
    }
    
    // Check if word covers all required letters
    private boolean covers(String word, int[] target) {
        int[] count = new int[26];
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                count[Character.toLowerCase(ch) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] < target[i]) return false;
        }
        return true;
    }
}
