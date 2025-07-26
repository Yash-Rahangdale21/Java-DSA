public class lemonodeChange {
    public static void main(String[] args) {
        int [] arr ={5,5,10,10,5,5,5,10,20};
        int fc=0, tc=0, twc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 5) fc++;
            else if(arr[i] == 10) {
                tc++;
                if(fc > 0) fc--; // Use one 5 to give change for 10
                else {
                    System.out.println("Not enough 5s to give change for 10");
                    return; // Exit if not enough change
            }
            } else if(arr[i] == 20) {
                twc++;
                if(tc > 0 && fc > 0) {
                    tc--; // Use one 10 and one 5 to give change for 20
                    fc--;
                } else if(fc >= 3) {
                    fc -= 3; // Use three 5s to give change for 20
                } else {
                    System.out.println("Not enough change for 20");
                    return; // Exit if not enough change
                }
            }
        }
        System.out.println("Change given successfully!");
    }
}
