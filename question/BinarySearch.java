// Wap to implement the binary Search on the sorted array(Ascending Order)
// a. Iterative Implementaion of Binary Search
// b. Recursive Implementation of Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 20, 45, 63, 89, 142, 259, 468 };
        int target = 63;
        int lower = 0;
        int upper = arr.length - 1;
        boolean flag = false; // false means not present
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (arr[mid] < target) {
                lower = mid + 1;
            } else if (arr[mid] > target) {
                upper = mid - 1;
            } else if (arr[mid] == target) {

                flag = true;
                break;
            }
        }
        if (flag == true)
            System.out.println("Target found  ");
        else
            System.out.println("Target not found");

    }
}
