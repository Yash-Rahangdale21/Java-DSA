
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class kClosestElements {
    public static class Doublet implements Comparable<Doublet>{
        int element;
        int difference;
        Doublet(int element, int difference){ // constructor
            this.element = element;
            this.difference = difference;
        }
        public int compareTo(Doublet t){
            if(this.difference == t.difference){  // in that we are doing check on the basis of ele for the less ele store inside the maxheap
                return this.element - t.element;
            }
            return this.difference - t.difference;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,5};
        int k = 4;
        int x = -1;

        
        PriorityQueue<Doublet> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            int diff = Math.abs(x-ele);
            MaxHeap.add(new Doublet(ele, diff));
            if(MaxHeap.size() > k){
                MaxHeap.remove();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(MaxHeap.size() > 0){
            Doublet d = MaxHeap.remove();
            ans.add(d.element);
        }
        Collections.sort(ans);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
