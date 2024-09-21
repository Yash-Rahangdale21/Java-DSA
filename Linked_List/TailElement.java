class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}public class TailElement {
    public static void main(String[] args) {
        Node a = new Node(10);  //head  node 
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node (40);
        Node e = new Node(50);
        a.next = b; // 10 -> 20
        b.next = c; //10->20->30
        c.next = d; //10->20->30->40
        d.next  = e; //10->20->30->40->50
       
    }
}
