
import java.util.Collections;
import java.util.PriorityQueue;

public class LastWeightStone2 {
   
    public static void main(String[] args) {
        //Maxheap
        int [] stones = {2, 7, 4, 1, 8, 1};
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            MaxHeap.add(stones[i]);
        }
        while(MaxHeap.size() > 1){
            int y = MaxHeap.remove();
            int x = MaxHeap.remove();
            if(y != x) MaxHeap.add(y-x);
        }
         
        if(MaxHeap.size() == 0) System.out.println(0);
        else System.out.println(MaxHeap.remove());
        
    }


}
