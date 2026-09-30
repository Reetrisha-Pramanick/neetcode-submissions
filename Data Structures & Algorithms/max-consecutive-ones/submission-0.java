class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int n = nums.length;
      int count = 0 , maxi = 0;
      for(int i=0; i<n; i++)
      {
        if(nums[i] == 1)
        {
            count++; //update count 
            maxi = Math.max(maxi , count); //take the max count
        }
        else
        {
            count = 0; //for other number make count 0
        }
      }
      return maxi;  
    }
}