
import java.util.Scanner;

public class array4 {

    // count the number of occurencees of a particular element x .
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the" + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element =");
        int x = sc.nextInt();
        int i, count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;

            }

        }
        System.out.println("the element occur  " + count);

    }
}
