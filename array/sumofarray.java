public class sumofarray {
    ///sum of the array
    public int sum(){
        int []arr = {1,5,3};
        int s = 0;
        for(int y:arr){
           s = s+y;
        }
        return s;
    }
    public static void main(String[] args) {
        sumofarray obj =new sumofarray();
        int x = obj.sum();
        System.out.println("sum is " + x);
    }
}
