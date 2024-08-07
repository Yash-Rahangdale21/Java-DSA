import java.util.*;
public class ques2 {
    //count the number of triplets whose sum is equal to the given value x.
    static int sum(int []nums,int target){
        int count =0;
        for(int i = 0;i<nums.length;i++){ //first number
            for(int j =i+1;j<nums.length-1;j++){ //second number
                for(int k=j+1;k<nums.length;k++){ //third number
                    if(nums[i]+nums[j]+nums[k] ==target){
                        count++;
                    }
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = input.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the " + n + "elements :");
        for(int i =0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target elements : ");
        int j =input.nextInt();
        
        System.out.println(sum(arr,j));
        
    }
}
