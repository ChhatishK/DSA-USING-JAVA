
public class LinkedListQueue {
    
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class queue {

        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }

            size++;
        }

        public int remove() {

            if (head == null) {
                System.out.println("Queue is empty!");
                return -1;
            }
            size--;
            int x = head.val;
            head = head.next;
            return x;
        }

        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty!");
                return -1;
            }

            return head.val;
        }

        public int size() {
            return size;
        }

        public void display() {

            if (head == null) {
                System.out.println("Queue is empty!");
                return;
            }   

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String args[]) {
        queue q = new queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.size());
        q.remove();
        q.display();
        System.out.println(q.size());
        System.out.println(q.peek());
        q.add(4);
        q.display();
    }
}