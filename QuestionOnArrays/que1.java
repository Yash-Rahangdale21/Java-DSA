public class que1 {
    public static void main(String[] args) {

    // product of all the element in the array;
        int [] arr = {1,2,3,4,5};
        int p =1;
        for (int i = 0;i<arr.length;i++){
            p = p *arr[i];
        }
        System.out.println("product of all ele " + p);
        
    }

}
