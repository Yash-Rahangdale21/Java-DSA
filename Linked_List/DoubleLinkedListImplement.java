
// user define data type
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}

// user defined data structres
class DLL{
   dNode head = null;
   dNode tail = null;
   int size;
   void display(){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode (val);
        if(size == 0 ) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;  //extra and imp
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode (val);
        if(size == 0 ) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;  //extra and imp
            head = temp;
        }
        size++;
    }
    void InsertAtAnyIdx(int idx,int val){
        //Base Case 
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size) {
            insertAtTail(val);
            return;
        }
        if(idx>size || idx < 0){
            System.out.println("Invaid idx");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for(int i = 1;i<=idx-1;i++){
            x = x.next;
        }
        dNode y = x.next;

        x.next=temp; temp.prev=x;
        y.prev=temp; temp.next=y;
        
        size++;
    }
    void deleteAtHead() throws Error{
        if(head == null ) throw new Error("List s empty");
        head = head.next;
        head.prev = null; //extra
        size--;
    }
    void deleteAtTail() throws Error{
        if(head == null ) throw new Error("List s empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size-1){
            deleteAtTail();
            return;
        }
       
        if(idx <0 || idx>=size) throw new Error("Invalid Index");

        dNode temp = head;
        for(int i = 1 ;i<=idx-1;i++){
            temp = temp.next;

        }
        
        temp.next = temp.next.next;
        temp = temp.next; //extra 
        temp.prev = temp.prev.prev;  //extra
        size--;
    }

}
public class DoubleLinkedListImplement {
    // public static void print(dNode head){
    //     dNode temp = head;
    //     while(temp!=null){
    //         System.out.print(temp.val + " ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    // }
    // public static void printReverse(dNode tail){
    //     dNode temp = tail;
    //     while(temp!=null){
    //         System.out.print(temp.val + " ");
    //         temp = temp.prev;
    //     }
    //     System.out.println();
    // }
    // public static void printRandom(dNode node){
    //     dNode temp = node;
    //     while(temp.prev!=null){
    //         temp = temp.prev;
    //     }
    //     // Now temp is at head
    //     print(temp);
        
    // } 
    public static void main(String[] args) {
        // dNode a = new dNode(10);
        // dNode b = new dNode(20);
        // dNode c = new dNode(30);
        // dNode d = new dNode(40);
        // a.next = b;  b.prev = a;
        // b.next = c;  c.prev = b;
        // c.next = d ; d.prev = c;
        // print(a);
        // printReverse(d);
        // printRandom(c);
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(50);
        list.display();
        list.InsertAtAnyIdx(1, 60);
        list.display();
        list.InsertAtAnyIdx(5, 500);
        list.display();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
        list.delete(2);
        list.display();
    }

    

}
