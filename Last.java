public class Last {

    // Function to find length of last word
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1; //

        // Step 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count length of last word
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    // Main method for testing
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Input: \"" + s1 + "\" -> Output: " + lengthOfLastWord(s1)); // 5
        System.out.println("Input: \"" + s2 + "\" -> Output: " + lengthOfLastWord(s2)); // 4
        System.out.println("Input: \"" + s3 + "\" -> Output: " + lengthOfLastWord(s3)); // 6
    }
}
