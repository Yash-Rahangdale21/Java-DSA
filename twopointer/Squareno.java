
public class Squareno {
// ye question me jo array apn ne diya vo sorted hai isliye ye logic se solve kiye otherwise thoda alag lagna opadta
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            //bigger number square is added to ans 
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr,i,j);
            
                i++;
                j--;
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {-10, -5, -2, 1, 4, 9, 10};
        System.out.println("Original Array: ");
        printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.println("Sorted Array : ");
        reverse(ans);
        printArray(ans);
    }
}
