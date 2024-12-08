//import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LevelOrderTraversal {
    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node =node;
            this.level = level;
        }
    }
    public static void main(String[] args) {
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
        // System.out.println("Level order :");
        // levelorderleft(a);

        // System.out.println("");
        // levelorderright(a);

        //levelorder(a);
        System.out.println();
        System.out.println("PostOrder traversal");
        postOrder(a);

       

    }
    // left to right in a tree 
    // private static void levelorderleft(TreeNode root){
    //     Queue<TreeNode> q = new ArrayDeque<>();
    //     if(root != null) q.add(root);
    //     while(q.size()>0){
    //         TreeNode front = q.remove();
    //         System.out.print(front.val + " ");
    //         if(front.left != null ) q.add(front.left);
    //         if(front.right != null) q.add(front.right);
    //     }
    // }

    // right to left  in a tree 
    // private static void levelorderright(TreeNode root){
    //     Queue<TreeNode> q = new ArrayDeque<>();
    //     if(root != null) q.add(root);
    //     while(q.size()>0){
    //         TreeNode front = q.remove();
    //         System.out.print(front.val + " ");
    //         if(front.right != null) q.add(front.right);
    //         if(front.left != null ) q.add(front.left);
    //     }
    // } 


    //  using queue
    // private static void levelorder(TreeNode root){
    //     int prevlevel  = 0;
    //     Queue<Pair> q = new LinkedList<>();
    //     if(root != null) q.add(new Pair(root,0));
    //     while(q.size()>0){
    //         Pair front = q.remove();
    //         TreeNode temp = front.node;
    //         int lvl = front.level;
    //         if(lvl != prevlevel){
    //             System.out.println();
    //             prevlevel++;
    //         }
    //         System.out.print(temp.val + " ");
    //         if(temp.left != null ) q.add(new Pair(temp.left,lvl+1));
    //         if(temp.right != null) q.add(new Pair(temp.right,lvl+1));
    //     }
    // }


    // via iterative method
    public static void postOrder(TreeNode root){
        
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root != null) st.push(root);
      
        while(st.size()>0){
            TreeNode top = st.pop();
            ans.add(top.val);
          
           
            if(top.left !=null) st.push(top.left);
             if(top.right != null )st.push(top.right);


        }
        Collections.reverse(ans);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }


}
