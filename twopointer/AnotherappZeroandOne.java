package twopointer;

public class AnotherappZeroandOne {

    // 1,0,,0,1,0,1,0,1,0,0
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort2(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }

    }

    static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 0, 1, 0, 0, 1};
        System.out.println("Original Array: ");
        printArray(arr);
        sort2(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
}
