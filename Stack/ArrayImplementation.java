
public class ArrayImplementation {
    public static class Stack {
        int[] arr = new int[10];
        int idx = 0;  // Index for the top of the stack

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Could also throw an exception
            }
            return arr[idx - 1];
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Could also throw an exception
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0; // Optional: Clear the value
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return idx == arr.length;
        }

        int capacity() {
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.display();
        System.out.println("Is empty: " + st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(31);
        st.push(4);
        st.display();
        st.push(50);
        st.display();
        System.out.println("Capacity: " + st.capacity());
        System.out.println("Is full: " + st.isFull());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
