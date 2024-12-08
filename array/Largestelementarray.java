public class Largestelementarray {
    //find the second largest element in given array . 
    static int Largest(int []arr){
        int max =   Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        int a[] = {1,02,54,6,58,3,65};
        System.out.println("largest element is  : "+ Largest(a));
    }
}
