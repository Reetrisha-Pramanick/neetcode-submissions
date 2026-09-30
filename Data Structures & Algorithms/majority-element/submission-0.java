class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       int count = 0 , el =0;
       for(int i =0; i<n; i++)
       {
        if(count == 0)
        {
            count++;
            el = nums[i];
        }
        else if(nums[i] == el) count++; //if the element we thinking is majority element
        else
        {
            count--;
        }
       } //now we have our element but we need to be sure 
       //manual checking
       for(int i = 0; i<n; i++)
       {
        if(nums[i] == el)
        {
            count++;
        }
       }
       if(count > (n/2))
       {
        return el;
       }
       return -1;
    }
}