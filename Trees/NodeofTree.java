
class TreeNode{
    int val ; 
    TreeNode left;
    TreeNode right;
    TreeNode (int val){
        this.val = val;
    }
}
public class NodeofTree{
    private static void display(TreeNode root){
        if(root == null) return;  //base case
        System.out.print(root.val + " ");
        display(root.left); // left subtree
        display(root.right); // right subtree
    }

    // linked list = add->head,tail
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);  // a is the root 
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);


        // System.out.println(a);
        // System.out.println(a.val);
        // System.out.println(a.left);
        // System.out.println(a.right);

        a.left =b;  a.right = c;
        b.left = d; b.right = e;
        c.right = f;


        // System.out.println(a.left.val);
        // System.out.println(e.val);
        // System.out.println(a.left.right.val);


        display(a);
        System.out.println();
        System.out.println("Sum of all nodes " + sum(a));
        System.out.println("Product of all the nodes = "+ product(a));
       
        

    }
    private static int sum(TreeNode root ){
        if(root == null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

    private static int product(TreeNode root){
        if(root == null ) return 1;
        return root.val*product(root.left)*product(root.right);
    }

   
}