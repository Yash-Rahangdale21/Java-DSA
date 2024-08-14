import java.util.Scanner;

public class Power {
    public static int pow(int a,int b)//Tc = O( b)
    {
       
        if(b==0) return 1;
        return (a *pow(a,b-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        //it is only use for when both are zero
        // if(a==0 && b==0){
        //     System.out.println("Not defined");
            
        // }
        System.out.println(pow(a,b));
    }
}
