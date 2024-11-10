import java.util.Scanner;


public class NthlevelTraversal {
    static int n ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         TreeNode a = new TreeNode(1);  // a is the root 
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);


        

        a.left =b;  a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.left = h;
        System.out.println("Enter the level which you are find element : ");
        n = sc.nextInt();
        Nthlevel(a,0);
    }
    public  static void  Nthlevel(TreeNode root,int level){
        if(root == null) return;
        if(level == n) System.out.print(root.val + " ");
        Nthlevel(root.left,level+1);
        Nthlevel(root.right,level+1);

    }
}
