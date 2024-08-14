import java.util.*;
public class stairpath1 {
    // using  of 1 and 2 step  in stair
    public static int stair(int n){
        if(n==1||n==2) return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n =sc.nextInt();
        System.out.println(stair(n));
    }

} 
