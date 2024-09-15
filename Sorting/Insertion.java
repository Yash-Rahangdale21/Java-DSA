public class Insertion{
    public static void main(String[] args) {
        int j;
        int []arr={6,5,8,2,4,6};
        for(int i=0;i<arr.length;i++){
           int val=arr[i];
            for ( j =i-1;j>=0;j--){
                if(arr[j]>val)
                {
                    arr[j+1] =arr[j];
                }
                else break;
            }
            arr[j+1] = val;
        }
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
    }
}