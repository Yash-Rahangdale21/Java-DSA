
public class ProductsDistribution {

    public static boolean isPossible(int maxQuantity, int n, int[] arr) {
        int stores = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % maxQuantity == 0) {
                stores += arr[i] / maxQuantity;
            } else {
                stores += arr[i] / maxQuantity + 1;
            }
        }
        if (stores > n) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {11, 6};
        int n = 6;
        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        int lo = 1, hi = mx;
        int maxAns = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(mid, n, arr)) {
                maxAns = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(maxAns);
    }
}
