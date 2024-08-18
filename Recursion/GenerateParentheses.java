import java.util.*;
public class GenerateParentheses {
    public static void para(int open, int close,int n,String s){
        if(s.length() == 2*n){
            System.out.println(s);
            return;
        }
        if(open<n) para(open +1,close,n,s+"(");
        if(close<open) para(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        para(0,0,n,"");
    }
}
