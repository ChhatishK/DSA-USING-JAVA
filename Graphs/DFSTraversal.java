import java.util.Queue;

/**
 * DFSTraversal
 */
public class DFSTraversal {
    public static void bfTraversal(int adjMatrix[][]) {
        Queue<Integer> pendingVertices = new LinkedList<>();

        boolean visited[] = new boolean[adjMatrix.length];
        visited[0] = true;
        pendingVertices.add(0);

        while (!pendingVertices.isEmpty()) {
            int currVertex = pendingVertices.poll();
            System.out.println(currVertex+" ");
            for (int i=0; i<adjMatrix.length; i++) {
                if (adjMatrix[currVertex][i] == 1 && !visited[i]) {
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }

        
    }
    public static void main(String[] args) {
        
    }
}