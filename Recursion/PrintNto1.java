
import java.util.Scanner;
//using recursion print n to 1
public class PrintNto1 {

    public static void print(int n) {
        if (n == 0) return; //base case
        System.out.println(n); //work
        print(n-1); //call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int x = sc.nextInt();
        print(x);
    }

}
