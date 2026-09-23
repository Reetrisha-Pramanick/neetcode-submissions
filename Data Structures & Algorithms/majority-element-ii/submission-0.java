class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int n = nums.length;
      int cnt1 = 0, cnt2 = 0;
      int el1= 0 , el2 = 0;
      for(int i = 0; i<n; i++) //traverse the array
      {
        if(cnt1 == 0 && el2 != nums[i])
        {
            cnt1++;
            el1 = nums[i];
        }
        else if(cnt2 == 0 && el1 != nums[i])
        {
            cnt2++;
            el2 = nums[i]; 
        }
        else if(el1 == nums[i]) cnt1++;
        else if(el2 == nums[i]) cnt2++;
        else
        {
            cnt1--;
            cnt2--;
        }
      }  
      List<Integer> answer = new ArrayList<>(); //resulting answer array
      cnt1 = 0; 
      cnt2 = 0;
      //manual check
      for(int i = 0; i<n; i++)
      {
        if(nums[i] == el1)
        {
            cnt1++;
        }
        else if(nums[i] == el2)
        {
            cnt2++;
        }
      }
      int mini = (n/3) + 1;
      if(cnt1 >= mini) answer.add(el1);
      if(cnt2 >= mini) answer.add(el2);
      Collections.sort(answer);
      return answer;
    }
}