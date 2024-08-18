import java.util.*;
public class PreinPost {
    public static void pip(int m){
        if(m == 0) return;
        System.out.println("pre " + m); //pre
        pip(m-1);
        System.out.println("in " + m); //in
        pip(m-1);
        System.out.println("post " + m); //out
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        pip(n);
        
    }
}
