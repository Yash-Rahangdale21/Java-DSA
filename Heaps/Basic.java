
import java.util.PriorityQueue;

public class Basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(2);
        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        minHeap.add(10);
        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        minHeap.add(1);
        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        minHeap.remove();
        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        minHeap.add(0);
        System.out.println(minHeap);
        System.out.println(minHeap.peek());

    }
}
