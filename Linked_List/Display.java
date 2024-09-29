public class Display {
    // public static void print(Node head){
    //     Node temp =head;
    //     while(temp != null){
    //         System.out.println(temp.val);
    //          temp = temp.next;

    //     }

    // }

    // using recursion 

    public static void displayRecursive(Node head){
        Node temp = head;
        if(temp == null) return;
        System.out.println(temp.val);
        displayRecursive(temp.next);


    }
    public static void main(String[] args) {
        Node a = new Node(10); //head  node 
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node (40);
        Node e = new Node(50);
        a.next = b; // 10 -> 20
        b.next = c; //10->20->30
        c.next = d; //10->20->30->40
        d.next  = e; //10->20->30->40->50
        
       // Node temp =a;
        // for(int i = 0;i<5;i++){
        //     System.out.println(temp.val);
        //     temp = temp.next;
        // }
        // while(temp != null){
        //     System.out.println(temp.val);
        //      temp = temp.next;

        // }
        //print(a);

        displayRecursive(a);

    }
}
