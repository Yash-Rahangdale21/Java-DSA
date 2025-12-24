public class table{
    public static void main(String[] args){
        // table of 2-6
        for(int i =2;i<=6;i++){
            System.out.println("Table of "+  i);
            for(int j=1;j<=10;j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}