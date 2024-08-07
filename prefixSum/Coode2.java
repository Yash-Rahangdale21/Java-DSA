public class Coode2 {
    static void printArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    static int[] PrefixSum(int []arr){
        int n = arr.length;
       for(int i =1;i<n;i++){
        arr[i] = arr[i] + arr[i-1];
       }
        return arr;
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