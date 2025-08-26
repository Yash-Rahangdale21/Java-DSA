public class ArrangeCoins {
    public static int arrangeCoins(int n) {
        long N = (long) n;   // convert to long to avoid overflow
        return (int)((Math.sqrt(1 + 8 * N) - 1) / 2);
    }

    public static void main(String[] args) {
        int n = 5;  // you can change input here
        int result = arrangeCoins(n);
        System.out.println("Number of complete rows: " + result);
    }
}
