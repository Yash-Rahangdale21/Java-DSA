import java.util.ArrayDeque;
import java.util.Queue;

public class BasicSTL {
   public static void main(String[] args) {
// another way to implement queue
    // Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q = new ArrayDeque<>();
    System.out.println(q.isEmpty());
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    q.add(6);
    q.add(7);
    System.out.println(q);
    System.out.println(q.remove());
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.isEmpty());

    System.out.println(q.element());
    System.out.println(q.peek());
    System.out.println(q.size());
   }


}
