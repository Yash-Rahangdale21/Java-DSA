public class ques4 {
    //find the second largest element in given array . 
    static int SecondLargest(int []arr){
        int max =   Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int []arr){
        int mx =SecondLargest(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==mx){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    int secondMx = SecondLargest(arr);
    return secondMx;
    }
    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        int arr[] = {1,-2,-54,6,-8,-3,-65};
       System.out.println("second largest element is : " + findSecondMax(arr));
    }
}


