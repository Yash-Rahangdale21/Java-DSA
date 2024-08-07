public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,96,43,63,5};
        int n = arr.length;
        for(int i= 0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j =i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }

            //swap arr[i] and arr[mindx]
            int temp = arr[i];
            arr[i]= arr[mindx];
            arr[mindx] = temp;
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
