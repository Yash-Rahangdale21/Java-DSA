public class for1ton {
    public static void main(String[] args) {
        int i =10;
        for(int j = 1;j<=i;j++){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Reverse of the Number is : ");
        ReservePrint(i);

        // Printing a number  512 256 128 64 32 16 8 4 2 
        System.out.println();
        int k = 2;
        for(int m = 1;m<=9;m++){
            System.out.print(k + " ");
            k = k * 2;
        }
       
        System.out.println();

        //2 256 128 64 32 16 8 4 2
        for(int n = 512;n>=2;n/=2){
            System.out.print(n + " ");
        }



    }
    public static void ReservePrint(int n){
        for(int k = n;k>=1;k--){
            System.out.print(k + " ");
        }
    }

}
