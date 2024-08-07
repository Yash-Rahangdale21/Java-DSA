import java.util.Arrays;
public class arraySort {
    // small and largest element 
    static int[] smallestandLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans ;
    }
   
    public static void main(String[] args) {
        int []arr = {1,2,6,3,6,7,8,6};
       int  []ans = smallestandLargestElement(arr);
        System.out.println("Smallest : " +ans[0]);
        System.out.println("Largest : " +ans[1]);
    }
}
