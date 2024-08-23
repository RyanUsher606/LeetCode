class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> numStack = new Stack<>();
        StringBuilder smallNum = new StringBuilder();
        boolean ZeroFound = false;

        for (int i = 0; i < num.length(); i++)
        {
            while(!numStack.isEmpty() && Character.getNumericValue(numStack.peek()) > Character.getNumericValue(num.charAt(i)) && k > 0)
            {
                numStack.pop();
                --k;
            }

            numStack.push(num.charAt(i));
        }

        while (k > 0 && !numStack.isEmpty()) {
            numStack.pop();
            --k;
        }



        for (Character c : numStack) {
            if (c != '0' || ZeroFound) {
                smallNum.append(c);
                ZeroFound = true;
            }
        }

        if (smallNum.isEmpty()) {
            return "0";
        }

        return smallNum.toString();
    }
}