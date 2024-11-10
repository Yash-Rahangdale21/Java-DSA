public class ProductofNonZero {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);  // a is the root 
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(0);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(0);
        TreeNode f = new TreeNode(5);
        a.left =b;  a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        display(a);
        System.out.println();
        System.out.println(product2(a));
       

    }
     //product of non zero  elements of nodes
     private static int product2(TreeNode root){
        if(root == null) return 1;
        int left = product2(root.left);
        int right = product2(root.right);

        if(root.val != 0){
            return root.val * left*right;
        }
        else{
            return left *right;
        }
    }
    private static void display(TreeNode root){
        if(root == null) return;  //base case
        System.out.print(root.val + " ");
        display(root.left); // left subtree
        display(root.right); // right subtree
    }
}
