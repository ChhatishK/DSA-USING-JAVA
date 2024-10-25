import java.util.*;

class LargestRectangleHistogram {

    public static int largestAreaHistogram(int heights[]) {
        int n = heights.length;
        // Next Smaller Element
        int nse[] = new int[n];
        // Previous smaller element
        int pse[] = new int[n];

        Stack<Integer> st = new Stack<>();
        // filling nse[]
        st.push(n-1);
        nse[n-1] = n;

        for (int i=n-2; i>=0; i--) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();

            st.push(i);
        }

        // Empting stack for pse
        while (st.size() > 0) st.pop();

        // Filling pse[]
        st.push(0);
        pse[0] = -1;

        for (int i=1; i<n; i++) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) st.pop();

            if (st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();

            st.push(i);
        }

        int area = -1;
        int width;

        for (int i=0; i<n; i++) {
            width = nse[i] - pse[i] - 1;
            area = Math.max(area, heights[i]*width);
        }

        return area;
    }

    public static void main(String args[]) {
        int heights1[] = {2,1,5,6,2,3};
        System.out.println(largestAreaHistogram(heights1));
        int heights2[] = {2,4};
        System.out.println(largestAreaHistogram(heights2));
        int heights3[] = {1,1};
        System.out.println(largestAreaHistogram(heights3));
    }
}