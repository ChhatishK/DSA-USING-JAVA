
public class CircularQueue {

    public static class CQueue {
        int f = -1, r = -1, size = 0;
        private int arr[] = new int[8];

        public void add(int val) throws Exception {
            if (size == arr.length) throw new Exception("Queue is Full!");
            else if (size == 0) {
                f = r = 0;
                arr[0] = val;
            } else if(r < arr.length-1) {
                arr[++r] = val;
            } else if (r == arr.length-1) {
                r = 0;
                arr[0] = val;
            }

            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else if (f == arr.length-1) {
                int val = arr[f];
                f = 0;
                size--;
                return val;
            }

            f++;
            size--;
            return arr[f-1];
            
        }

        public int peek() throws Exception {
            if (size == 0) throw new Exception("Queue is Empty!");
            else {
                return arr[f];
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            } else if (f <= r) {
                for (int i=f; i<=r; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            } else {
                for (int i=f; i<arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i=0; i<=r; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) throws Exception {
        CQueue cq = new CQueue();
        cq.display();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);
        cq.add(7);
        cq.add(8);
        cq.remove();
        cq.add(9);
        cq.display();
        cq.remove();
        cq.display();
        System.out.println(cq.size());
    }
}