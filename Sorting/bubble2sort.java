public class bubble2sort {
    public static void main(String[] args) {
        int []arr = {1,58,6,9,5,3};  
        //  bubble sort 2
        int n= arr.length;
                for(int i = 0 ;i<n-1;i++){
                    for(int j = 0;j<n-1-i;j++){ // i laga diya
                    if(arr[j] > arr[j+1]){
                        int t = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1] = t ;
                    }
                }
                }
                for( int k :arr){
                    System.out.print(k + " ");
                }
    }
}

