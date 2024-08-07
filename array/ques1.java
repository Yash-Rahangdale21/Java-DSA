public class ques1 {
    // find the total no of pairs in the array whose sum isequal to the given value x.
    static int target(int[] array,int k){
        int add = 0;
        for(int i = 0;i<array.length;i++){ //first number
            for(int j = 1 ; j<array.length-1;j++){  // j =1 isliye quki vo check hoga uska sum target ke equal hai ky 
                if(array[i]+array[j] == k){
                    add++;
                }
            }
        }
        return add;
    }
    public static void main(String[] args) {
        int []arr = {4,6,3,5,8,2};
        int x = 7;
       int y = target(arr,x);
       System.out.print(" the pairs are :" +  y);
    }
}
