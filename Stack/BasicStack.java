
import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(50);
        st.push(30);
        st.push(70);
        st.push(90);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());  // top element of stack
        System.out.println(st.size());  // size of stack

        st.push(90);
        System.out.println(st);
        // to access first element
        while(st.size()>1){
            st.pop();
        }
        /// size  has become one 
        System.out.println(st.peek());
        
    }

}
