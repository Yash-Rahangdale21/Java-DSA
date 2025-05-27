class Node{
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        
    }
}
public class IsBtMaxHeap {
    public  boolean isMaxHeap(Node root) {
        int size = size(root);
        return isHOP(root) && isCompleteBinaryTree(root,0,size);
       
    }
    private int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);}
   
     private boolean isHOP(Node root) {
        if (root == null) return true;
        if (root.left != null && root.left.val > root.val) return false;
        if (root.right != null && root.right.val > root.val) return false;
        return isHOP(root.left) && isHOP(root.right);
    }
    private boolean isCompleteBinaryTree(Node root,int i,int size) {
        
    }
    public static void main(String[] args) {
        Node a = new Node(10);  // a is the root 
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(4);
        Node f = new Node(5);

        a.left =b;  a.right = c;
        b.left = d; b.right = e;
       
        System.out.println(isMaxHeap(a)); 
    }

    
}