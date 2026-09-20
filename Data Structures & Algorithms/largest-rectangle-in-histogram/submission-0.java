class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxarea = 0;
        for (int i = 0; i < n; i++) // traverse in array
        {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                int element = st.peek(); // store that element for which we will compute
                st.pop(); // kick that element from stack
                int nse = i; // the nse for that element
                int pse = st.isEmpty() ? -1 : st.peek(); // the pse = top element that in stack
                maxarea =
                    Math.max(maxarea, (nse - pse - 1) * heights[element]); // calculate max area
            }
            st.push(i); //push the index into stack
        }
        // leftover elements -> elements with no pse or nse
        while (!st.isEmpty()) {
            int nse = n; // the hypothetical index
            int element = st.peek(); // the top element to compute
            st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxarea = Math.max(maxarea, (nse - pse - 1) * heights[element]); // calculate maxarea
        }
        return maxarea;
    }
}
