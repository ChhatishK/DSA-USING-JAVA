
public class LinkedListStack {
    
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class Stack {
        private static Node head;

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }

        int peek() {
            if (head == null) {
                System.out.println("Error: Stack is Empty!");
                return -1;
            }

            return head.val;
        }

        int pop() {
            if (head == null) {
                System.out.println("Error: Stack is Empty!");
                return -1;
            }

            int x = head.val;
            head = head.next;
            return x;
        }

        boolean isEmpty() {
            return head == null;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void stackReverse(Node head) {
            if (head == null) return;

            stackReverse(head.next);
            System.out.print(head.val+" ");
        }

        void reverse() {
            stackReverse(head);
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.isEmpty());
        // st.display();
        // System.out.println(st.size());

        st.reverse();
        st.display();
    }
}