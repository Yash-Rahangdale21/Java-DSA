public class BubbleSortclg {
    public static void main(String[] args) {
        int [] arr = {10,50,40,20,30};
        int n = arr.length;
       // boolean flag = true; //  it will not deal average case 
        for(int i = 1;i<n-1;i++){  // passs
            boolean flag = true;  // important to put inside the loop
            for(int j = 0 ;j<n-i;j++){ // compare
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        for(int k :arr){
            System.out.println(k + " ");
        }
    }
}
