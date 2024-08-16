class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String reverseNum = "";

        for(int i = Integer.toString(x).length() - 1; i >= 0; i--)
        {
            reverseNum += Integer.toString(x).charAt(i);
        }

        if(reverseNum.equals(Integer.toString(x)))
        {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}