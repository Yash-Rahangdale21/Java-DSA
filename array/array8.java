
public class array8 {

    //check if the given arrayis sorted or not . we take increasing order
    static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            /*
             i =1 se isliye suru huaa quki apne ko check karna padega
             */
            if (arr[i] < arr[i - 1]) {
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
       // int[] arr = {4, 5, 6, 8, 9, 7, 5, 1, 6, 5};
int[] arr = {1,2,3,3,5,6};
        System.out.println(isSorted(arr));
    }
}
