class Solution {
    //checks whether a letter is number or letter
    public boolean isAlphaNum(char ch)
        {
            return Character.isLetterOrDigit(ch);
        }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0, end = n-1;
        while(start < end)
        {
            //skip non alphanumeric from left
            if(!isAlphaNum(s.charAt(start)))
            {
                start++;
                continue;
            }
            //skip non alphanumeric from right
            if(!isAlphaNum(s.charAt(end)))
            {
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
