import java.util.*;

public class SmallestRangeFinder {

    public class Triplet implements Comparable<Triplet> {
        int ele;
        int row;
        int col;
        Triplet(int ele, int row, int col) {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(Triplet t) {
            return this.ele - t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans  = {0,Integer.MAX_VALUE};
        //MINHEAP
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        // Add first element of each list to the min heap
        for(int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            pq.add(new Triplet(ele, i, 0));
            max = Math.max(max, ele);
        }

        while (true) { 
            Triplet top = pq.remove();
            int ele = top.ele;
            int row = top.row;  
            int col = top.col;
            // update the minimum range
            if (max - ele < ans[1] - ans[0]) {
                ans[0] = ele;
                ans[1] = max;
            }
            if(col == nums.get(row).size() - 1) {
                break;
            }
            int next = nums.get(row).get(col + 1);
            
            pq.add(new Triplet(next, row, col + 1));
            max = Math.max(max, next);
            // If we reach the end of any list, we break . . ...
           
        }
        return ans;
        
    }

    // Example usage
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));

        SmallestRangeFinder obj = new SmallestRangeFinder();
        int[] result = obj.smallestRange(nums);
        System.out.println("Smallest range: [" + result[0] + ", " + result[1] + "]");
    }
}