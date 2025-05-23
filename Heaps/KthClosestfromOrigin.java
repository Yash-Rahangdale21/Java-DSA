import java.util.*;

public class KthClosestfromOrigin {
    public  static class Pair{
        int x;
        int y;
        
        Pair(int x, int y){
            this.x = x;
            this.y = y;
            
        }
    }
    
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}, {1, 0},{3,2}};
        int k = 2;
        //MaxHeap
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Pair> map = new HashMap<>();
        for(int i =0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int d2 = x*x + y*y;
            MaxHeap.add(d2);
            Pair coordinate = new Pair(x, y);
            map.put(d2,coordinate);
            if(MaxHeap.size() > k){
                MaxHeap.remove();
            }
        } 
        int [][] ans = new int[k][2];
        for(int i = 0; i < k; i++){
            //remove the max element from the heap
            int dist = MaxHeap.remove();
            Pair coordinate = map.get(dist);
            ans[i][0] = coordinate.x;
            ans[i][1] = coordinate.y;
            
        }
        for(int i = 0; i < k; i++) {
            System.out.print(Arrays.toString(ans[i]) + " ");
        }
        System.out.println();
    }

    
}