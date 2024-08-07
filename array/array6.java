public class array6 {
    // find the last occuence of the element x in a given array . 
    static int lastOcuurence(int []arr,int y){
        int lastIndex = -1;
        for(int i = 0;i<arr.length;i++){
        if(arr[i]==y){
            lastIndex = i ;
        }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,48,6,9,6};
        int y = 6;
       int o =  lastOcuurence(arr, y);
        System.out.println("last occur at "+" " + o);
    }
}
