public class Maximum69problem {
    public static void main(String[] args) {
        int num = 969;
        System.out.println("Maximum Number after changing one digit: " + maximum69Number(num));
    }

    public static int maximum69Number (int num) {
        char[] digits = String.valueOf(num).toCharArray();
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9'; // Change first 6 to 9
                break;           // Only one change allowed
            }
        }
        
        return Integer.parseInt(new String(digits));
    }
}
