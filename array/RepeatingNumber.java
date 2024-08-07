public class RepeatingNumber {
    /*given an array 'a' consisting of integers . Return the first value that is repeating in the array 
      if novalue is being repeated , return -1.
     */
    static int check(int []arr){
        int n = arr.length;
        for(int i =0;i<n;i++){ //first number
            for(int j=i+1;j<n;j++){ //second number
                if(arr[i] == arr[j]){ //found number
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int []arr ={1,2,3,4,83,4};
        System.out.println("First Repeating Number : "+ check(arr));
    }
}
