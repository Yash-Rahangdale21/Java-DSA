
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
}
public class DoubleLinkedListImplement {
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void printRandom(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        // Now temp is at head
        print(temp);
        
    } 
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
    }

}
