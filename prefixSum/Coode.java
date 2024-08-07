
public class Coode {
    static void printArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    static int[] PrefixSum(int []arr){
        int n = arr.length;
        int []pref = new int [n];
        pref[0] = arr[0];
        
        for(int i = 1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];
            
        }
        return pref;
    }
    
    public static void main(String[] args) {
        int []arr = {2,1,3,4,5};
        System.out.println("Original Array : ");
        printArray(arr);
       int []ans =  PrefixSum(arr);
        System.out.println("Sorted Array : ");
        printArray(ans);
    }
}

