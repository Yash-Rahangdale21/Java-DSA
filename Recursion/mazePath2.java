import java.util.*;
public class mazePath2 {
    // find the number of path another approach
    public static int maze2(int m,int n){
// without using of extra parametre
        if(m == 1 || n == 1) return 1;
         int rightWays =maze2(m,n-1);
         int downWays = maze2(m-1,n);
         return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n and m :");
        int n =sc.nextInt();
        int m = sc.nextInt();
        System.out.print("There are "+maze2(m,n) +" ways");
       
    }
}
