class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> letterKey = new HashMap<>();
        List<String> letterComb = new ArrayList<>();

        letterKey.put(2, "abc");
        letterKey.put(3, "def");
        letterKey.put(4, "ghi");
        letterKey.put(5, "jkl");
        letterKey.put(6, "mno");
        letterKey.put(7, "pqrs");
        letterKey.put(8, "tuv");
        letterKey.put(9, "wxyz"); 

        if (digits.length() == 0) {
            return letterComb;
        }

        letterComb.add("");

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            String letters = letterKey.get(digit);
            List<String> newComb = new ArrayList<>();

            for (String combination : letterComb) {
                for (int j = 0; j < letters.length(); j++) {
                    newComb.add(combination + letters.charAt(j));
                }
            }

            letterComb = newComb;
        }

        return letterComb;
    }
}