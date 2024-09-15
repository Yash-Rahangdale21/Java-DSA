import java.util.Scanner;
import java.util.Stack;

public class TakingStackInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        int n ;
        System.out.print("Enter a no. of element  you want to insert : ");
        n = sc.nextInt();
        System.out.println("Enter the element :");
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
