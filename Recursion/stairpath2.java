import java.util.*;
public class stairpath2 {
    // using  of 1 and 3 step  in stair
    public static int stair(int n){
        if(n==1||n==3) return n;
        return stair(n-1)+stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n =sc.nextInt();
        System.out.println(stair(n));
    }

} 