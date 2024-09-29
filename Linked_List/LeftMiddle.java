class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
     }
}
class Fll{
    Node head;
    Node tail;
   
    void insertAtTail(int val){
       Node temp = new Node (val);
       if(head == null) {
        head = temp;
        tail=temp;
       }
       else{
        tail.next = temp;
        tail=temp;
       }
       
    }
    void display(){
        Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                 temp = temp.next;
    
            }
            System.out.println();
    }

    /// find the left middle of the linked list
    void leftmid(){
        Node temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int mid = len/2;
        temp = head;
        for(int i = 0;i<mid-1;i++){
           
           temp = temp.next;
        }
        System.out.println(temp.val);
    }

    
}
public class LeftMiddle {
    public static void main(String[] args) {
        Fll list = new Fll();
        list.insertAtTail(10);  //head
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        //System.out.println(lis);
        list.leftmid();
       
        //list.display();
    }

   

}
