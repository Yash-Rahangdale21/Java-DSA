import java.util.*;
public class Print1toN2 {
    static int n;
    public static void print(int x) {
         if (x > n) return;  // base
       System.out.println(x); //work
        print(x+1);   //call
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        // in global declare we cant declaration those variable again
        n = sc.nextInt();
        print(1);
    }
}