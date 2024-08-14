import java.util.Scanner;
//using of extra parameter
public class Print1toN {
    //static int n;
    public static void print(int x,int n) {
         if (x > n) return;  // base
       System.out.println(x); //work
        print(x+1,n);   //call
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        print(1,n);
    }
}
