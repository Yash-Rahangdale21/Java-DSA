class S{
    Node head;
    Node tail;
   
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
        
    }
    int solve(){
    Node temp = head;  // nothing is created 
    int len = 0;
    while(temp != null){
        temp = temp.next;
        len++;
    }
    int mid = len/2+1;
    temp = head;
    for(int i  = 1;i<=mid-1;i++){
        temp = temp.next;
    }
    return temp.val;   
       
   }

}
public class MiddleNode {
    public static void main(String[] args) {
        S list = new S();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
       
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.insertAtEnd(24);

        
       System.out.println( list.solve());
    }
}
