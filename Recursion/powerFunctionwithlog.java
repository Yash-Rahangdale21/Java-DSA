import java.util.Scanner;

public class powerFunctionwithlog {
    /// using logarithmics
    public static int pow2(int a, int b){ //Tc = O(log b)
        if(b ==0) return 1;
        int ans =pow2(a,b/2);
        if(b % 2 ==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        
        System.out.println(pow2(a,b));
    }
}
