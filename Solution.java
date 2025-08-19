// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = (num << 1) | head.val; // shift left and add current bit
            head = head.next;
        }
        return num;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example: Linked list = [1,0,1] → binary 101 → decimal 5
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));

        Solution sol = new Solution();
        int result = sol.getDecimalValue(head);

        System.out.println("Decimal value: " + result); // Output: 5
    }
}
