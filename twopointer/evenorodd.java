

public class evenorodd {
    

        // 1,2,3,64,52,97,6,3,
        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    
        static void sort2(int[] arr) {
            int n = arr.length;
            int left = 0 ;
            int right=  n-1;
            while(left  < right){
                if(arr[left]%2!=0 && arr[right] %2==0){
                    swap(arr,left,right);
                    left++;
                    right--;
                }
                if(arr[left]%2 ==0){
                    left++;
                }
                if(arr[right]%2 !=0){
                    right--;
                }
            }
        }
    
        static void printArray(int[] arr) {
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int[] arr = {1,2,3,465,6,32,6,3};
            System.out.println("Original Array: ");
            printArray(arr);
            sort2(arr);
            System.out.println("Sorted Array : ");
            printArray(arr);
        }
    }
    

