public class BruteFor2sum {

    public static void sum(int[] arr, int t) {
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 0, 6, 12, 2, 8};
        int target = 10;
        sum(arr, target);
    }
}
