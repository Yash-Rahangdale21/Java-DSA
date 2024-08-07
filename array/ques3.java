
import java.util.Scanner;
//find the unique number in  a given array where all the elements
// are being repeated twice with one value being unique.(only positive elements)

public class ques3 {

    static int FindUnique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] =-1;
                }
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + "elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
       
        
        System.out.println("Unique Elements :  " + FindUnique(arr));

    }
}
