
public class quw2 {
    // second largest element in the array;
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 9, 5 };

        int max = arr[0];

        int Elem = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {

                Elem = max;

                max = arr[i];

            } else if (arr[i] > Elem && arr[i] != max) {

                Elem = arr[i];

            }

        }
        System.out.println(max);
        System.out.println(Elem);
    }
}
