// New Solution- Moore's voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int val=nums[0];
        int freq=1;
        for(int i=1;i<nums.length;i++)
        {
            if(val==nums[i])
            {
                ++freq;
            }
            else
            {
                --freq;
                if(freq==0)
                {
                    freq=1;
                    val=nums[i];
                }
            }
        }
        return val;
    }
}


// Old submission
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.containsKey(nums[i]))
            {
                hash.put(nums[i],hash.get(nums[i])+1);
            }
            else
                hash.put(nums[i],1);
        }
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;}}
        return majorityEntry.getKey();
    }
}
