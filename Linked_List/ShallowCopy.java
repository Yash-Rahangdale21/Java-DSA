
public class ShallowCopy { 
    // shallow copy of node
    public static void main(String[] args) {
        Node a = new Node(10);  //head  node 
        
        Node temp = a;  // a is shallow copy hai temp me
        System.out.println(a);
       // System.out.println(temp);
       // Node  temp = new Node (25);  //deep copy quki new keyword ke isse humne new object create kiya
       
        temp.val = 21;
        System.out.println(a.val);

    }
}
