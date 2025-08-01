public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();
        int num = 49; 
        boolean result = vps.isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result);
    }
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if (num == 0 || num == 1) return true;

        long left = 2, right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == num) return true;
            if (square < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
        //
    }
}
