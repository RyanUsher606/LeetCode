class Solution {
    public boolean digitCount(String num) {
       HashMap<Character, Integer> frequency = new HashMap<>();

       for(char c: num.toCharArray())
       {
            frequency.compute(c, (key, val) -> val == null ? 1 : val + 1);
       }

       boolean isEqualDigit = true;

        for (int i = 0; i < num.length(); i++) {
            if (Character.getNumericValue(num.charAt(i)) != frequency.getOrDefault((char) ('0' + i), 0)) {
                isEqualDigit = false;
                break;
            }
        }
       return isEqualDigit;
    }
}