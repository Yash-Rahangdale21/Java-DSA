import java.util.*;
public class KthClosestfromOrigin {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i =0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int d2 = x*x + y*y;
            MaxHeap.add(d2);
            if(MaxHeap.size() > k){
                MaxHeap.remove();
            }
        } 
    }

    
}