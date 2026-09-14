class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> freq = new HashSet<>();
        for(int i = 0; i<n; i++)
        {
            if(!freq.contains(nums[i]))
            {
                freq.add(nums[i]);
            }
            else
            {
                return true; //duplicate element exists
            }
        }
        return false;
    }
}