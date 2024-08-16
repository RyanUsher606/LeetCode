class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        boolean isPalindrome = false;
        String reverseNum = "";

        for(int i = number.length() - 1; i >= 0; i--)
        {
            reverseNum += number.charAt(i);
        }

        if(reverseNum.equals(number))
        {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}