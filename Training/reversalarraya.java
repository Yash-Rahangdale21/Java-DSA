public class reversalarraya {
    static void revarray(int [] arr,int n){
        int start = 0; 
        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
            
        }
    
    public static void main(String[] args) {
        int [] arr = {3,9,0,8,5,9};
        int n = arr.length;
        System.out.println("Original array : ");
        revarray(arr,n);
    }
}
