public class FirstST {
    public static void fst(int []arr){
       int first,second,third;
         first = second = third = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>first){
                 third = second;
                 second = first;
                 first = arr[i];
             }
             else if(arr[i]>second && arr[i]!=first){
                 third = second;
                 second = arr[i];
             }
             else if(arr[i]>third && arr[i]!=second && arr[i]!=first){
                 third = arr[i];
             }
         }
            System.out.println("first largest :"+ first);
            System.out.println("second largest :"+ second);
            System.out.println("third largest :"+ third);
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8,9};
        int n = arr.length;
        fst(arr);
    }
}
