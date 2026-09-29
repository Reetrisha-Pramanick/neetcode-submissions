class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, maxlen = 0;
        int[] hash = new int[256]; // hash array to store the input characters frequency
        for (int i = 0; i < 255; i++) {
            hash[i] = -1; // pre computation
        }
        while (r < n) // stopping condition
        {
            if (hash[s.charAt(r)] != -1) // if character already exists in hash array
            {
                if (hash[s.charAt(r)] >= l) // if the substring is in range
                {
                    l = hash[s.charAt(r)] + 1; // update the left pointer
                }
            } // for repeat characters
            int len = r - l + 1; // calculate the length
            maxlen = Math.max(len, maxlen); // calculate the max length
            hash[s.charAt(r)] = r; // update the right pointer in hash array
            r++; // update the right pointer
        }
        return maxlen;
    }
}
