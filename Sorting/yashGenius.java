public class yashGenius {
    public static void main(String[] args) {
        int []arr = {1,58,6,9,5,3,55664,655,4};  // start se element arranged hoge

        for(int i = 0 ;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
            if(arr[i] > arr[j]){
                int t = arr[i];
                arr[i]=arr[j];
                arr[j] = t ;
            }
        }
        }
        for( int k :arr){
            System.out.print(k + " ");
        }
    }
}
