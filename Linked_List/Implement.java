class SLL{  //user defined data structure
    Node head ;
    Node tail;
    int size;

    // insert a element in ending 
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

    //insert a element at staring 
    void InsertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) {
            head =tail =  temp;
            
        }
        else{
            temp.next =head;
            head = temp;
        }
        size++;

    }

    // print the list 
    void display(){
        Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                 temp = temp.next;
    
            }
            System.out.println();
    }
    

    // Known the size of list
    void size(){
        System.out.println("length of list is " + size);
    }


    //insert at any index
    void InsertAtAnyIdx(int idx,int val){
        //Base Case 
        if(idx == 0){
            InsertAtHead(val);
            return;
        }
        if(idx == size) {
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invaid idx");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i = 1;i<=idx;i++){
            x = x.next;
        }

        //insertion 
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    // to get any idx element 
    int get(int idx){
        //Base Cases 
        if(idx == size-1) return tail.val; 
        if(idx>=size || idx < 0) {
            System.out.println("Invalid Idx");
            return -1;
        }
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    // to set any idx elemnt 
    void set(int idx,int val){
     //Base Cases 
     if(idx == size-1)  tail.val = val;
     if(idx>=size || idx < 0) {
         System.out.println("Invalid Idx");
         
     }
     Node temp = head;
     for(int i=0;i<idx;i++){
         temp=temp.next;
     }
      temp.val = val;
           
    }

    //delete 
    void deleteAtHead() throws Error{
        if(head == null ) throw new Error("List s empty");
        head = head.next;
        size--;
    }

    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }
       
        if(idx <0 || idx>=size) throw new Error("Invalid Index");

        Node temp = head;
        for(int i = 1 ;i<=idx-1;i++){
            temp = temp.next;

        }
        if(temp.next == tail)
        {
            tail =temp;
        }
        temp.next = temp.next.next;
        size--;
    }


    // void deleteAtTail() throws Error{
    //     if(head == null ) throw new Error("List s empty");
    //     tail = tail.next;
    //     size--;
    // }

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
        list.InsertAtHead(500);
        list.InsertAtHead(5000);
        list.display();

        list.InsertAtAnyIdx(2, 21);
       
        list.display();
        list.size();
        list.InsertAtAnyIdx(8, 212);
        list.display();
        list.size();

        System.out.println(list.get(3));
        System.out.println(list.get(0));

        list.display();
        list.set(4,90);
        list.display();

        list.deleteAtHead();
        list.display();
        list.size();

        list.delete(7);
        list.display();
        list.size();

        list.delete(2);
        list.display();
        list.size();
        System.out.println(list.tail.val);
        


    }
}
