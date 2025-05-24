import java.util.ArrayList;
import java.util.Collections;
public class LastWeightStone {
    public static void main(String[] args) {
        //Brute force approach
        int [] stones = {2, 7, 4, 1, 8, 1};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < stones.length; i++){
            arr.add(stones[i]);
        }
        while(arr.size() > 1){
            Collections.sort(arr);
            int y = arr.remove(arr.size()-1);
            int x = arr.remove(arr.size()-1);
            if(y != x) arr.add(y-x);
        }
         
        if(arr.size() == 0) System.out.println(0);
        else System.out.println(arr.get(0));
        
    }
}
