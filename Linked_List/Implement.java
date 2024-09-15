class SLL{  //user defined data structure
    Node head ;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp =new Node(val);
        
        //base case
        if(head == null){
            head =temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail=temp;
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
    void size(){
        System.out.println("length of list is " + size);
    }
}
public class Implement {
    
    public static void main(String[] args) {
        
        SLL list =new SLL();
        System.out.println("list size is " + list.size);

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.size();
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();
        list.insertAtEnd(24);
        list.display();
        System.out.println("list size is " + list.size);

    }
}
