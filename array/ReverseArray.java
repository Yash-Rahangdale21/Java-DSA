public class ReverseArray {
    // Reverse an array consisting of integer values . 
    static int[] check(int [] nums){
        int [] ans = new int [nums.length];
        int j = 0;

        //traverse original array in  reverse direction
        for(int i = nums.length-1 ;i>=0;i--){
            ans [j++] = nums[i];
        }
        return ans;
        
    }
    static void printArray(int []nums){
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int []nums  = { 1,2,3,4,5,6,7};
        int []sol = check(nums);
       printArray(sol);
    }
}
