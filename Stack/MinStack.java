// Simple Method using O(n) space.

import java.util.*;

class Minstack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    Minstack(){}

    public void push(int val) {
        if (st.size() == 0) {
            min.push(val);
        } else {
            if (min.peek() > val) min.push(val);
            else min.push(min.peek());
        }

        st.push(val);
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int peek() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

// Optimize approach without extra space.

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MinStack {
    Node head = null;
    int min = -1;
    MinStack(){};

    public void push(int val) {
        if (head == null) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            min = val;
        } else if (val >= min) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        } else {
            Node temp = new Node(2*val-min);
            temp.next = head;
            head = temp;
            min = val;
        }
    }

    public void pop() {
        if (head.val >= min) head = head.next;
        else {
            min = 2 * min - head.val;
            head = head.next;
        }
    }

    public int peek() {
        if (head == null) return -1;
        else if (head.val >= min) return head.val;
        else return min;
    }

    public int getMin() {
        return min;
    }
}


public class MinStack {
    public static void main(String args[]) {

    }
}
