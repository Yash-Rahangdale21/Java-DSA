import java.util.Stack;

public class display {
        // Method -3
        public static void printReursive(Stack <Integer> st){
            if(st.size() == 0) return ;
            int top = st.pop();
            printReursive(st);
            System.out.print(top +" ");
            st.push(top);

        }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
       
        // Method 1
        // Stack <Integer> rt= new Stack<>();
        // while(st.size() > 0){
        //     rt.push(st.pop());

        // }
        // while(rt.size()>0){
        //     int x = rt.pop();
        //     System.out.print(x+ " ");
        //     st.push(x);
        // }

        // Method 2
        // int n = st.size();
        // int []arr= new int [n];

        // for(int i =n-1;i>=0;i--){
        //     int x = st.pop();
        //     arr[i] = x;
        // }
        // for(int i =0;i<n;i++){
        //     int x = arr[i];
        //     System.out.print(x+" ");
        //    st.push(x);
        // }
        printReursive(st);
    }
}
