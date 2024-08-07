
public class sort{
    static void printArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }
    static void swap(int []arr,int i ,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    static void sorrtZeroandOnes(int []arr){
        int n = arr.length;
        //count number of zeroes
        int zeroes  = 0 ;
        for(int i = 0 ;i<n ;i++){
            if(arr[i] == 0){
                zeroes++;
            } 
        }
        //0 to zero-1 : 0 , zeroes to n-1 : 1
        for(int i = 0;i<n;i++){
            if(i<zeroes){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {1,0,0,1,0,1,1,0,0};
        System.out.println("Original Array : ");
        printArray(arr);
        sorrtZeroandOnes(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
}