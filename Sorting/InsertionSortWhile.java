public class InsertionSortWhile {
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
        int []arr={4,56,2,3,14};
        System.out.println("Unsorted array :");
        printArray(arr);
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int j =i;
            while(j>=1 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        printArray(arr);
    }
}
