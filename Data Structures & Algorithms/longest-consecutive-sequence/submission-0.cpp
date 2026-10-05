class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();

        if(n == 0) return 0;

        int longest = 1;

        unordered_set<int> set;

        for(int i = 0; i < n; i++) {
            set.insert(nums[i]);
        }

        for(auto it : set) {

            // it is the starting point of a sequence
            if(set.find(it - 1) == set.end()) {

                int x = it;
                int count = 1;

                while(set.find(x + 1) != set.end()) {
                    x = x + 1;
                    count++;
                }

                longest = max(longest, count);
            }
        }

        return longest;
    }
};