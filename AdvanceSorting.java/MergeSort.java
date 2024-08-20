public class MergeSort {

    // but in that code space complexity is O(n*log n) it is not good now we can improve it 
    public static void print(int []arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void merge(int []a,int []b,int []c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                c[k++] = b[j++];
            }
            else{
                c[k++] = a[i++];
            }
        }
        while(j<b.length)  c[k++] = b[j++];
        while(i<a.length)  c[k++] = a[i++];
    }
    public static void mergeSort(int []arr){
        int n = arr.length;
        if(n==1) return;  //base case 

        // create two arrays of n/2 size each
        int []a =new int[n/2];
        int []b =new int[n-n/2];

        //copy pasting 
        for(int i =0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i =0;i<n-   n/2;i++){
            b[i] = arr[i+n/2];
        }

        //magic 
        mergeSort(a);
        mergeSort(b);

        //merge these "a" and "b" 
        merge(a, b, arr);
    }
    public static void main(String[] args) {
        int [] arr ={80,4,10,60,12,87,54};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
