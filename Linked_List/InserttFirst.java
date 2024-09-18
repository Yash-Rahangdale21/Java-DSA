class Sll{
    Node head;
    Node Tail;
    int size;
    void InsertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) {
            head =Tail =  temp;
            
        }
        else{
            temp.next =head;
            head = temp;
        }
        size++;

    }
    void display(){
        Node temp =head;
            while(temp != null){
                System.out.print(temp.val + " ");
                 temp = temp.next;
    
            }
            System.out.println();
    }
}
public class InserttFirst {
    public static void main(String[] args) {
     Sll s = new Sll();
     s.InsertAtHead(25);  
     s.InsertAtHead(50); 
     s.InsertAtHead(150);

     s.display();
    }


}
