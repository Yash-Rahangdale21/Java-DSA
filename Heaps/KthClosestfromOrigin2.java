import java.util.*;
public class KthClosestfromOrigin2 {
    public  static class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d,int x, int y){
            this.d = d;
            this.x = x;
            this.y = y;
            
        }
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }
    // is code ke through kuch case ko solve nhi kar skate to we can use heap without map
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}, {1, 0},{3,2}};
        int k = 2;
        //MaxHeap
        PriorityQueue<Triplet> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i =0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int d2 = x*x + y*y;
            MaxHeap.add(new Triplet(d2, x, y));
            if(MaxHeap.size() > k){
                MaxHeap.remove();
            }
        } 
        int [][] ans = new int[k][2];
        for(int i = 0; i < k; i++){
            //remove the max element from the heap
            Triplet t = MaxHeap.remove();
            
            ans[i][0] = t.x;
            ans[i][1] = t.y;
            
        }
        for(int i = 0; i < k; i++) {
            System.out.print(Arrays.toString(ans[i]) + " ");
        }
        System.out.println();
    }

    
}
