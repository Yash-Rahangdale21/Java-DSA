public class ReverseArray2 {
    // Reverse an array consisting of integer values .  second approach without use of new array
    static int[] check(int [] nums){
     int n =  nums.length ;
        
       for(int i = 0;i<n;i++){
        int t= nums[i];
        nums[i] = nums[n-1];
        nums[n-1]= t;
        n--;
       }

        return nums;
        
    }
    static void printArray(int []nums){
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int []nums  = { 1,2,3,5,6,7,8};
        int []sol = check(nums);
       printArray(sol);
    }
}


