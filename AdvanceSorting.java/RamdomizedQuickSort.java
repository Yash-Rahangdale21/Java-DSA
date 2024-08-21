public class RamdomizedQuickSort {
    public static void print(int[]arr){
        for(int el :arr){
            System.out.print(el + "  ");
        }
        System.out.println();
    }
    public static void swap(int []arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int []arr ,int lo,int hi){
        int mid =(lo+hi)/2;
        int pivot =arr[mid],pivotIdx = mid;
        int smallerCount = 0;
        for(int i = lo;i<=hi;i++){
            if( i == mid) continue;
            if(arr[i]<=pivot) smallerCount++;

        }
        int correctIdx =lo+ smallerCount;
        swap(arr,pivotIdx,correctIdx);

        //partition
        int  i = lo,j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i] <=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j] <=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;

    }
    public static void quickSort(int []arr,int lo,int hi){
        if(lo>=hi) return;
        // pivot (arr[lo]) ko sahi jagah rakho ye nhi karege uski jagah
        //mid nikal kar quick apply karege
        // and left part me <=pivot 
        int idx = partition(arr,lo,hi);
       quickSort(arr, lo, idx-1);
       quickSort(arr, idx+1, hi);
    }
    public static void main(String[] args) {
        int []arr = {8,6,9,4,5,3,1,2};
        print(arr);
        int n =arr.length;
        quickSort(arr, 0, n-1);
        print(arr);
    }
}

