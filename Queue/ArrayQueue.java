import java.util.*;
public class ArrayQueue {

    public static class queue {
        int f = -1, r = -1;
        int arr[] = new int[100];
        int size = 0;

        public void add(int val) {

            if (r == arr.length) {
                System.out.println("Queue is full!");
                return;
            }

            if (f == -1) {
                f = r = 0;
                arr[r++] = val;
            }
            else {
                arr[r++] = val;
            }

            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }

            f++;
            size--;
            return arr[f-1];
        }

        public int peek() {
            if (f != -1) return arr[f];
            else {
                System.out.println("Queue is empty!");
                return -1;
            }
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }

        public int size() {
            return size;
        }

        public void display() {
            if (size == 0) {
                System.out.println("[]");
            } else {
                System.out.print("[");
                for (int i=f; i<r; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String args[]) {
        queue q = new queue();
        q.display();
        System.out.println(q.size());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        q.display();
        q.remove();
        q.display();
        // System.out.println(q.peek());
        // System.out.println(q.isEmpty());
        System.out.println(q.size());

    }
}