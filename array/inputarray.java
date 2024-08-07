import java.util.*;
public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of array =");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter the "+n+ "elements : ");
        for(int i= 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("elements are :");
        for(int y :arr){
            System.out.print(y + " ");
        }
    }
}
