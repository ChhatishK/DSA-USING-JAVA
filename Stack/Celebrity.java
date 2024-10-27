import java.util.*;

public class Celebrity {

    // brute force approach TC - O(n^2)
    // public static int identifyCelebrity(int mat[][], int n) {
    //     boolean chance;
    //     for (int i=0; i<n; i++) {
    //         chance = true;
    //         for (int j=0; j<n; j++) {
    //             if (mat[i][j] == 1) {
    //                 chance = false;
    //                 break;
    //             }
    //         }

    //         if (chance) {
    //             for (int k=0; k<n; k++) {
    //                 if (i == k) continue;
    //                 if (mat[k][i] == 0) {
    //                     chance = false;
    //                     break;
    //                 }
    //             }
    //         }

    //         if (chance) return i;
    //     }

    //     return -1;
    // }

    // Optimized approach using stack TC - O(n)
    public static int identifyCelebrity(int mat[][], int n) {
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<n; i++) st.push(i);

        while (st.size() > 1) {
            int c1 = st.pop();
            int c2 = st.pop();

            if (mat[c1][c2] == 0) st.push(c1);
            else if (mat[c2][c1] == 0) st.push(c2);
        }

        if (st.size() == 0) return -1;
        int candidate = st.pop();
        for (int j=0; j<n; j++) {
            if (mat[candidate][j] == 1) return -1;
        }

        for (int i=0; i<n; i++) {
            if (i == candidate) continue;
            if (mat[i][candidate] == 0) return -1; 
        }

        return candidate;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mat[][] = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println(identifyCelebrity(mat, n));
    }
}