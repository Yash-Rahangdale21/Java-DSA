
import java.util.*;

public class subarray {

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int k : arr) {
            totalSum += k;
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);

        int prefSum = 0 ;

        for(int i = 0;i<arr.length;i++){
            prefSum +=  arr[i];
            int SuffixSum = totalSum - prefSum;
            if(SuffixSum == prefSum){
                return true ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + "elemens : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            
        }
        System.out.println("Equal Partition possible : " + equalSumPartition(arr));
    }
}
