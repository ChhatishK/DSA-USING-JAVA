import java.util.*;

public class ArrayStack {

    public static class Stack {
        private int[] arr = new int[50];

        private int idx = 0;

        void push(int val) {
            if (idx == 50) {
                System.out.println("Error: StackOverFlow!");
                return;
            }

            arr[idx] = val;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Error : Stack is Empty!");
                return -1;
            }

            return arr[idx-1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Error: Stack is Empty!");
                return -1;
            }

            int x = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return x;
        }

        void display() {
            for (int i=0; i<idx; i++) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isFull() {
            return idx == 50;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        int capacity() {
            return arr.length;
        }
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        // System.out.println(st.isEmpty()); 
        // System.out.println(st.isFull()); 
        System.out.println(st.capacity());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // st.push(6);
        System.out.println(st.isEmpty()); 
        System.out.println(st.isFull()); 
        // System.out.println(st.size());
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.peek());
        // st.display();
        // System.out.println(st.size());
    }
}