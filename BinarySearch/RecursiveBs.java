public class RecursiveBs{
    public static int binarySearch(int[] arr,int target,int left,int right){
        if(left > right){
            return -1; // Target not found
        }
        
        int mid = left + (right - left) / 2; // Avoids overflow
        
        if(arr[mid] == target){
            return mid; // Target found
        } else if(arr[mid] < target){
            return binarySearch(arr, target, mid + 1, right); // Search in the right half
        } else{
            return binarySearch(arr, target, left, mid - 1); // Search in the left half
        }
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + result);
    }
}