class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums); //sort the array at first
       int n = nums.length;
       List<List<Integer>> answer = new ArrayList<>();
       for(int i = 0; i<n; i++)
       {
        if( i>0 && nums[i] == nums[i-1])
        {
            continue; //if the values are same increment value of i
        }
        int j = i+1; //start j pointer after i
        int k = n-1; //start k pointer at the end
        while(j<k) //stopping condition
        {
            int sum = nums[i] + nums[j] + nums[k]; //sum of all
            if(sum < 0) 
            {
                j++; //we need bigger value so increase j
            }
            else if(sum > 0)
            {
                k--; //we need smaller value so reduce k
            }
            else
            {
                answer.add(Arrays.asList(nums[i] , nums[j] , nums[k])); //add the asnwer in list
                j++;
                k--;
                while(j<k && nums[j] == nums[j-1])
                {
                    j++;
                }
                while(j<k && nums[k] == nums[k+1])
                {
                    k--; //update the pointers
                }
            }
        }
       }
       return answer;
    }
}
