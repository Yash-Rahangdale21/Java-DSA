import java.util.*;

class Algrebra{
    public int sum(int a ,int b){
        int ans = a + b;
        return ans;
    }
}
public class addtwonumber {

   
    public static void main(String[] args){
    Algrebra obj =new Algrebra();
        //obj.sum(4,6);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a =sc.nextInt();
        System.out.println("enter a second number");
        int b = sc.nextInt();
        int ans = obj.sum(a,b);
        System.out.println(ans);
    }
}
