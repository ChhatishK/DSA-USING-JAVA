
public class ArrayDeque {

    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static class Deque {
        private int size = 0;
        private Node head = null;
        private Node tail = null;

        void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.prev = tail;
                tail.next = temp;
                tail = tail.next;
            }

            size++;
        }

        void addFirst(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = head.prev;
            }

            size++;
        }

        void addLast(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.prev = tail;
                tail.next = temp;
                tail = tail.next;
            }

            size++;
        }

        int remove() throws Exception {
            if (head == null) throw new Exception("Deque is Empty!");
            int val = head.val;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        int removeFirst() throws Exception {
            if (head == null) throw new Exception("Deque is Empty!");
            int val = head.val;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        int removeLast() throws Exception {
            if (head == null) throw new Exception("Deque is Empty!");
            int val = tail.val;
            tail = tail.prev;
            tail.next = null;
            size--;
            return val;
        }

        int removeFirstOccurance(int val) throws Exception {
            if (head == null) throw new Exception("Deque is Empty!");

            Node temp = head;
            if (temp.val == val) {
                head = head.next;
                size--;
                return 0;
            }
            int idx = 0;
            while (temp != null && temp.val != val) {
                temp = temp.next;
                idx++;
            }

            if (temp == null) throw new Exception("Value not in Deque!");

            if (temp.next == null) {
                tail = tail.prev;
            }
            temp.prev.next = temp.next;
            size--;
            return idx;
        }

        int removeLastOccurance(int val) throws Exception {
            if (head == null) throw new Exception("Deque is Empty!");

            Node temp = tail;
            if (temp.val == val) {
                tail = tail.prev;
                size--;
                return size;
            }
            int idx = 0;

            while (temp != null && temp.val != val) {
                temp = temp.prev;
                idx++;
            }

            if (temp == null) throw new Exception("Value not in Deque!");

            if (temp.prev == null) {
                head = head.next;
            }

            temp.next.prev = temp.prev;
            size--;
            return size-idx;
        }

        int size() {
            return size;
        }

        void display() {
            if (head == null) System.out.println("[]");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }  
    }

    public static void main(String args[]) throws Exception {
        Deque q = new Deque();
        // q.display();
        q.addFirst(1);
        q.add(2);
        q.add(2);
        q.add(5);
        // q.add(6);
        System.out.println(q.removeLastOccurance(1));
        // q.addFirst(2);
        // q.add(3);
        // q.removeLast();
        // q.addLast(4);
        q.display();
        System.out.println(q.size());
    }
}