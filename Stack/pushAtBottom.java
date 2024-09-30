import java.util.Stack;

public class pushAtBottom {
    public static void pushbottom(Stack <Integer> st,int x){
        if(st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushbottom(st, x);
        st.push(top);
    }
    public static void main(String[] args) {
         Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        int x = 5;
       pushbottom(st,x);
       System.out.println(st);


       // iterative
       int idx = 2;
       int y = 7;
       Stack <Integer> rt = new Stack<>();
       while(st.size()>idx){
           rt.push(st.pop());
       }
       st.push(y);
       while(rt.size()>0){
           st.push(rt.pop());
       }
       System.out.println(st);
   }
    }

