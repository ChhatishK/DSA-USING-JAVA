
public class CircularQueueLL {

    public static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    public static class CQueue {
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                tail.next = head;
            } else {
                tail.next = temp;
                tail = tail.next;
                tail.next = head;
            }

            size++;
        }

        public int remove() throws Exception {
            if (size == 0) throw new Exception("Queue is Empty!");
            else {
                int val = head.val;
                head = head.next;
                tail.next = head;
                size--;
                return val;
            }
            
        }

        public int peek() throws Exception {
            if (size == 0) throw new Exception("Queue is Empty!");
            else return head.val;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {

            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }

            Node temp = head;
            System.out.print(temp.val+" ");
            temp = temp.next;
            while (temp != head) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String args[]) throws Exception {
        CQueue q = new CQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        q.remove();
        q.display();
    }
}