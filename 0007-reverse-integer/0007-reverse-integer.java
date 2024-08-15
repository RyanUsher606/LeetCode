class Solution {
    public int reverse(int x) {
        String number = Integer.toString(x);
        String reversed = "";
        
        int startIndex = 0;
        if (number.charAt(0) == '-') {
            reversed += '-';
            startIndex = 1;
        }
        
        for(int i = number.length() - 1; i >= startIndex; i--)
        {
            reversed += number.charAt(i);
        }
        
        long reversedint = Long.parseLong(reversed);
        
        if(reversedint < Integer.MIN_VALUE || reversedint > Integer.MAX_VALUE)
        {
            return 0;
        }

        return (int)reversedint; 
    }
}