class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class Creation {
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
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // jab only a aka use karke baki element print karna ho to
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
    }
}
