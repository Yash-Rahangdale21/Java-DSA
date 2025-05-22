import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySort {
    public static void main(String[] args) {
        int [] arr = {6,5,3,2,8,10,9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 3;
        for(int ele : arr){
            minHeap.add(ele);
            if(minHeap.size() > k){
                ans.add(minHeap.remove());
            }
        }
        // this is do for remaining elements in minHeap
        while(minHeap.size() > 0){
            ans.add(minHeap.remove());
        }
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
