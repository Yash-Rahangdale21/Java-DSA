
import java.util.Scanner;

public class RotatebyKsteps2 {
    // Rotate the  given arry 'a'by k steps , where k is non negative without using extra space .  
    // note : k can be greater than n as well  . 

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInplace(int[] arr, int k) {

        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Enter a Rotate :");
        int k = sc.nextInt();

        System.out.println("Original Array : ");
        printArray(arr);
        rotateInplace(arr, k);

        System.out.println("Rotate array after " + k + "  steps");
        printArray(arr);

    }
}
