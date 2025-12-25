public class ReversEANos {
    public static void reverseNumber(int n,int rev){
        // int sign  =1;
        // if(n < 0){
        //     sign = -1;
        //     n = -n;
        // }
        while(n != 0){
            int digit  = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        // if(sign == -1){
        //     rev = -rev;
        // }
        System.out.println("Reversed Number is : " + rev);
    }
    public static void main(String[] args) {
        int n = -2005;
        int rev = 0;
        reverseNumber(n, rev);
    }
}
