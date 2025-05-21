
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {


    /// this is uselesss method for solve this question min heap is not needed
    // public static void main(String[] args) {
    //     int[] arr = {7, 10, 4, 3, 20, 15};
    //     int k = 4;
    //     //MinHeap
    //     PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         minHeap.add(arr[i]);
    //     }

    //     for(int i=1;i<=k-1;i++){
    //         minHeap.remove();
    //     }
    //     System.out.println(minHeap.peek());
    // }

    public static void main(String[] args) {
        int [] arr={10,2,3,8,-4,-2,6};
        int  k= 3;
        //MaxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            maxHeap.add(ele);
            if(maxHeap.size()>k){
                maxHeap.remove();
            }
        }
        System.out.println(maxHeap.peek());
    }

    
}