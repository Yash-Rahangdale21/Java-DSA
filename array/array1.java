public class array1 {
    /* Maximum number in array */
    public void maxnumber(){
        int []arr = {4,5,6,9,5,45};
        int max = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(max<arr[i]){
                max =arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        array1 obj =new array1();
        obj.maxnumber();
    }
}
