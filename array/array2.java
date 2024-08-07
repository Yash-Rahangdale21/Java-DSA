public class array2 {
    // linear search if element present return index other wise return -1;
     //and also first occcurence
    public int search1(){
        int []array = {1,2,3,4,6,8};
        int target = 81;
        int ans =-1;
        for(int i = 0;i<array.length;i++){
            if(array[i] == target){
                ans = i;
                break;
            }
            
            
        }
        if(ans == -1){
            System.out.println("element not found");
        }
        return ans;
        
    }
    public static void main(String[] args) {
        array2 obj = new array2();
       int u = obj.search1();
        System.out.println("index is "  + u);
    }
}
