import java.util.Scanner;
/// print sum from 1 to n
public class Sum {
    public static void sum(int n,int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        } //base case
         sum(n-1,s+n); // call and work
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int x = sc.nextInt();
        sum(x,0);
    }
}
