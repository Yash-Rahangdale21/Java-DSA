import java.util.Stack;


public class MoveStackinSameOrder {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(50);
        st.push(80);
        st.push(30);
        System.out.println(st);

        // reverse order 
        Stack <Integer> gt = new Stack <>();
        while(st.size()>0){
            int  y = st.pop();
            gt.push(y);
           
        }
        Stack <Integer> rt = new  Stack <>();
        while(gt.size()>0){
            int  y = gt.pop();
            rt.push(y);
           
        }
        System.out.println(rt);

        
    }
}
