import java.util.HashMap;
import java.util.PriorityQueue;
public class TopKFrequentEle {
    public static class Pair implements Comparable<Pair> {
        int element;
        int frequency;

        Pair(int element, int frequency) { // constructor
            this.element = element;
            this.frequency = frequency;
        }

        public int compareTo(Pair p) {
            return this.frequency - p.frequency; // min heap based on frequency
        }
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int k = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1); // increment frequency
            } else {
                map.put(ele, 1); // initialize frequency
            }
        }
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int freq = map.get(ele);
            minHeap.add(new Pair(ele, freq));
            if (minHeap.size() > k) {
                minHeap.remove(); // remove the least frequent element
            }
        }
        while (minHeap.size() > 0) {
            Pair p = minHeap.remove();
            System.out.print(p.element + " ");
        }
    }
}