public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {5,6,9,3,4,6,9};
        int x = 4;
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x ){
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println("Element found");
        else System.out.println("Element not found");
        
    }
}
