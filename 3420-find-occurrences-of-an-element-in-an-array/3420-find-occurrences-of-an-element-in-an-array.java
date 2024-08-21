class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap <Integer, Integer> occurenceIndex = new HashMap <Integer, Integer>();
        List<Integer> occurenceList = new ArrayList<Integer>();
        int key = 1;

        for(int i = 0; i < nums.length; i++)
        {
            if(x == nums[i])
            {
                occurenceIndex.put(key++, i);
            }
        }

        if(occurenceIndex.size() == 0 && queries.length == 1)
        {
            return new int[] {-1};
        }

        for(int i = 0; i < queries.length; i++)
        {
            if(queries[i] > occurenceIndex.size())
            {
                occurenceList.add(-1);
            }
            else if(queries[i] <= occurenceIndex.size())
            {
                occurenceList.add(occurenceIndex.get(queries[i]));
            }
        }

        int[] arr = occurenceList.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}