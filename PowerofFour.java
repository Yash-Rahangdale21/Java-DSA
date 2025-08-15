public class PowerofFour {
    public static void main(String[] args) {
        PowerofFour solution = new PowerofFour();

        // Test cases
        System.out.println(solution.isPowerofFour(16)); // true
        System.out.println(solution.isPowerofFour(8));  // false
        System.out.println(solution.isPowerofFour(1));  // true
        System.out.println(solution.isPowerofFour(64)); // true
    }

    public boolean isPowerofFour(int n) {
        if (n <= 0) return false;
        
        while (n % 4 == 0) {
            n /= 4;
        }
        
        return n == 1;
    }
}
