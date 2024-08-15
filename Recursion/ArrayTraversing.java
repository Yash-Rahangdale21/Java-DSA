public class ArrayTraversing {
    public static void print(int i,int [] arr){
        if(i == arr.length) return;
        System.out.print(arr[i] + " ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int []arr = {1,2,63,45,3,6,1,32};
        print(0,arr);
    }
}
