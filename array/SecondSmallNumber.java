public class SecondSmallNumber {
        //find the second smallest element in given array . 
        static int SecondLargest(int []arr){
            int min =   Integer.MAX_VALUE;
            for(int i =0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            
            return min;
        }
        static int findSecondMax(int []arr){
            int mx =SecondLargest(arr);
            for(int i = 0;i<arr.length;i++){
                if(arr[i]==mx){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMx = SecondLargest(arr);
        return secondMx;
        }
        public static void main(String[] args) {
            // System.out.println(Integer.MAX_VALUE);
            // System.out.println(Integer.MIN_VALUE);
            int arr[] = {1,2,5,4,6,8,3,3,65};
           System.out.println("second Smallest element is : " + findSecondMax(arr));
        }
    }
    
    
    
