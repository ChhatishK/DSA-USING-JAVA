import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class STLDeque {
    public static void main(String args[]) {
        Deque<Integer> d = new ArrayDeque<>();
        Deque<String> dq = new LinkedList<>();

        // d.add(1);
        // d.add(2);
        // d.addLast(3);
        // d.addFirst(0);
        // d.remove();
        // d.removeLast();
        // d.removeFirst();
        // System.out.println(d.peek());
        // System.out.println(d.remove());
        // System.out.println(d.getLast());
        // System.out.println(d.getFirst());
        // System.out.println(d);

        dq.add("Chhatish");
        dq.addFirst("Radhe");
        System.out.println(dq);
    }
}