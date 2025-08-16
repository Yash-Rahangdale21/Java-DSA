public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println("Hamming Distance between 1 and 4: " + sol.hammingDistance(1, 4)); // Output: 2
        System.out.println("Hamming Distance between 3 and 1: " + sol.hammingDistance(3, 1)); // Output: 1
        System.out.println("Hamming Distance between 7 and 10: " + sol.hammingDistance(7, 10)); // Output: 3
    }
}

class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y; // XOR will give 1 where bits are different
        int count = 0;
        while (xor != 0) {
            count += xor & 1; // check last bit
            xor >>= 1;        // right shift
        }
        return count;
    }
}
