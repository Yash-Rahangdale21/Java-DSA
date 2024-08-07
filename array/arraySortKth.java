import java.util.Arrays;

public class arraySortKth {
    
    // small and largest element */
    static int[] smallestandLargestElement(int[] arr,int k){
        Arrays.sort(arr);
        
    //    for(int i = 0; i<arr.length;i++){
    //     if(arr[i] == k){
    //        ans ={i} ;
    //     }
    //    }
    
    }
   
    public static void main(String[] args) {
        int []arr = {1,2,14,16,5,3};
        int k =5;
       int  []ans = smallestandLargestElement(arr,k);
        System.out.println("Smallest : " +ans[0]);
        System.out.println("Largest : " +ans[1]);
    }
}

