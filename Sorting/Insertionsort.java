public class Insertionsort {

    // usinng two for loop 
    public static void swap(int []arr,int i,int j){
        int t =arr[i];
        arr[i] =arr[j];
        arr[j]=t;
    }
    public static void printArray(int []arr){
        for(int el:arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //insertion sort 

        int []arr ={4,6,29,36,14,16,27,5};
        printArray(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    
                }else break;
            }
            
        }
        printArray(arr);
        
    }
}
