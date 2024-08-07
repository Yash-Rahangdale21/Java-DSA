public class array3 {
    static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
    }
    static void app(int [] arr){
        for(int i = 0;i<arr.length;i++){
        arr[i] = 0;
        }
    }
    // static void changee_val(int a){
    //      a = 1000;

    // }
    public static void main(String[] args) {
        // int a =  5;
        // changee_val(a);
        // System.out.println(a);

        int []array = {1,2,3,5,6};
        app(array);
        printArray(array);
    }
}
