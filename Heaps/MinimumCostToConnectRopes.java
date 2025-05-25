import java.util.*;
public class MinimumCostToConnectRopes {
    public static void main(String[] args) {
        int [] ropes = {2,7,4,1,8};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < ropes.length; i++){
            minHeap.add(ropes[i]);
        }
        int cost = 0;
        while(minHeap.size() > 1){
            int x = minHeap.remove();
            int y = minHeap.remove();
            cost += x + y;
            minHeap.add(x + y);
        }
        System.out.println(cost);
        // Output: 29
    }
}
