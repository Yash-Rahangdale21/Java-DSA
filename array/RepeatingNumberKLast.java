 public class RepeatingNumberKLast {
    /*given an array 'a' consisting of integers . Return the last value that is repeating in the array 
      if novalue is being repeated , return -1.
     */
    static int check(int []arr){
        int n = arr.length;
        int store1 = -1 ;
        for(int i =0;i<n;i++){ //first number
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    store1 =  arr[i];
                }
            }
        }
        return store1;
    }
    public static void main(String[] args){
        int []arr ={1,2,3,4,3,4};
        System.out.println("last Repeating Number : "+ check(arr));
    }
} 
    

