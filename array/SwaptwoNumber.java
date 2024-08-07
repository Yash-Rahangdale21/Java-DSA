
import java.util.Scanner;

public class SwaptwoNumber {

    // given 2 integers a and b . swaap the 2 given values using temporaryu variables. 
    static void Swapwitht(int a,int b ){
        System.out.println("original value of a : " + a);
        System.out.println("original value of b : " + b);
        int t ;  
         t = a;
        a = b;
        b = t;
        System.out.println("after swap a is : " + a);
        System.out.println("after swap b is : " + b);
    }
    static void swap(int a, int b) {
        System.out.println("original value of a : " + a);
        System.out.println("original value of b : " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap a is : " + a);
        System.out.println("after swap b is : " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Element :");
        int a = sc.nextInt();
        System.out.println("Enter a Second  Element :");
        int b = sc.nextInt();
        swap(a, b);
        Swapwitht(a, b);

    }
}
