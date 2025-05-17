
import java.util.Collections;
import java.util.PriorityQueue;

public class Maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(2);
        System.out.println(maxHeap + " " + maxHeap.peek());
        maxHeap.add(10);
        System.out.println(maxHeap + " " + maxHeap.peek());
        maxHeap.add(1);
        System.out.println(maxHeap + " " + maxHeap.peek());
        maxHeap.remove();
        System.out.println(maxHeap+ " " + maxHeap.peek());
        maxHeap.add(0);
        System.out.println(maxHeap + " " + maxHeap.peek());
        
    }
}
