import java.util.*;
public class mazePath {
    // find the number of path
    public static int maze(int row,int col,int m,int n){
        //if(row ==m||col ==n) return  1;  // base case 
        if(row == m && col ==n) return 1;
        if(row>n || col>n) return 0;
         int rightWays =maze(row,col+1,m,n);
         int downWays = maze(row+1,col,m,n);
         return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n and m :");
        int n =sc.nextInt();
        int m = sc.nextInt();
        System.out.print("There are "+maze(1,1,m,n) +" ways");
       
    }
}
