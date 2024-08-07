
public class muktiarray {

    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6}, {7, 8, 9}, {5, 6, 7}};

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
        }
        // for(int y : arr){
        //     System.out.print(y);
        // }
    }
}
