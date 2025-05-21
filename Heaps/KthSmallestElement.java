import java.util.PriorityQueue;
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;
        //MinHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        for(int i=1;i<=k-1;i++){
            minHeap.remove();
        }
        System.out.println(minHeap.peek());
    }

    
}