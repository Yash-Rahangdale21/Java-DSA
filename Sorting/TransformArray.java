public class TransformArray {
    public static void printArray(int []arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,56,86,91,13,5};
        //             0 3  4 5  2  1
        int n =arr.length;
        printArray(arr);
        int x =0;
        for(int i = 0;i<n;i++){
            int min =Integer.MAX_VALUE;
            int mindx = -1;
            for(int  j =0;j<n;j++){
               if(arr[j]< min && arr[j] > 0 ){
                min =arr[j];
                mindx =j;
               }
            }
            arr[mindx] = x;
            x--;
        }
        printArray(arr);
        // for(int el :arr){   //  we cant modify element with the help of for each loop.
        //     el = el * -1;
        // }
        for(int i = 0;i<n;i++){
            arr[i]=arr[i]*-1;
        }
        printArray(arr);
    }
}
