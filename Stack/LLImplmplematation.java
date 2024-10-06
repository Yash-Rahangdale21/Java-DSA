
public class LLImplmplematation {
    public static class Node { // user define data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack { // user define data structure
        Node head = null;
        int size = 0;

        void push(int val) {
            Node temp = new Node(val);

            temp.next = head;
            head = temp;

            size++;
        }

        void displayReverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();

        }
         void displayRec(Node h){
           if(h == null) return ;
           displayRec(h.next);
           System.out.print(h.val + " ");
        }
        void display(){
         displayRec(head);
         System.out.println();
        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;

            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.val;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.display(); // Initially empty
        System.out.println("Is empty: " + st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display(); // Display stack after pushes
        st.push(5);
        st.display(); // Display stack after another push
        System.out.println("Popped value: " + st.pop()); // Pop and display value
        st.display(); // Display stack after pop
        System.out.println("Peek value: " + st.peek()); // Peek at top value
        System.out.println("Size of stack: " + st.size()); // Display size of stack
        st.displayReverse();
    }
}
