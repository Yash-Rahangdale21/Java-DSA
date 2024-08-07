public class array5 {
    // count the number of occurencees of a particular element x .with the use of method 
    static int Numcoccur(int []arr,int x){
        int count = 0 ;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr = {1,2,36,9,45,36};
        int x =36;
        int y = Numcoccur(arr, x);
        System.out.println("the occurences of element is " + y);
    }
}
