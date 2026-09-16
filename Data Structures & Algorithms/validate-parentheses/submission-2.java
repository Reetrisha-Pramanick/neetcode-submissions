class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch = st.peek();
                st.pop();
                if (!((ch == '(' && s.charAt(i) == ')') || (ch == '{' && s.charAt(i) == '}')
                        || (ch == '[' && s.charAt(i) == ']'))) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
