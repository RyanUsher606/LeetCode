class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        while(left < right)
        {
            int mid = left + (right - left) /2;
            int hoursNeeded = 0;

            for(int pile : piles)
            {
                hoursNeeded += (pile + mid - 1) / mid;
            }

            if(hoursNeeded <= h)
            {
                right = mid;
            } else {
                left = mid + 1;
            } 
        }

        return left;
    }

}