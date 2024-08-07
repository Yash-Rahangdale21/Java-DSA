
public class array7 {

    // count the number of elements stricly greater than value x .
    static int Greater1(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 86, 9, 45};
        int x = 2;
        System.out.println(Greater1(arr, x));

    }
}
