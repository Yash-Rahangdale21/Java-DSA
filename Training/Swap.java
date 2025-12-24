public class Swap {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        a = a + b; // 15+5 = 20
        b = a-b; //20-5=15
        a= a-b;//20-15=5
        System.out.println("Value of A is "+a);
        System.out.println("Value of B is "+b);
    }
}
