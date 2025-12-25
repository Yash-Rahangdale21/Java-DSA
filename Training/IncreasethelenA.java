public class IncreasethelenA {
    public static void main(String[] args) {

        /// two case  : 
        /// case 1  :{9,9,9} = {1,0,0,0}
        /// case 2 : {1,2,3} = {1,2,4}
        int [] arr ={9,9,9};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        arr = addToArray(arr);
        System.out.println();
        System.out.println("After adding 1 to the last element,array ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public  static int[] addToArray(int []arr){
        // read the array from right to left 
        for(int i = arr.length-1;i>=0;i--){
            // case 1 : last element is less than 9
            if(arr[i] != 9){
                arr[i]++;
                return arr;
            }
            //case 2:
            arr[i] = 0;
        }
        //case 3 : all the elements are 9
        int result[] = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }
}
