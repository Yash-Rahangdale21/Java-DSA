import java.util.Scanner;

public class pract1 {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4}};
        int [][] arr2 = {{5,6},{7,8}};

        // printing of first array
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // printing of second array
        for (int[] arr21 : arr2) {
            for (int j = 0; j<arr2.length; j++) {
                System.out.print(arr21[j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Addition of Two Matrices: ");
            System.out.println("2. Subtraction of Two Matrices: ");
            System.out.println("3. Multiplication of Two Matrices: ");
            System.out.println("4. Transpose of Two Matrices: ");
            System.out.println("5.Exit ");

            System.out.println("Enter Your Choice = ");
            int n = sc.nextInt();
            S
        }
    }
}
