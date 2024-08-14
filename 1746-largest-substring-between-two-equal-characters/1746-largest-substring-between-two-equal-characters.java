class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxDistance = -1;

        for(int i = 0; i < s.length(); i++)
        {
            for(int j = s.length() -1; j > i; j--)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    int distance = j-(i+1);
                    if(distance > maxDistance) {
                        maxDistance = distance;
                    }   
                    break;
                }
            }
        }

        return maxDistance;
}
}