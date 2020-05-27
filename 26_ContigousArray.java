class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++)
            nums[i]=nums[i]*2-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        int max=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(map.containsKey(sum))
            {
                max=Math.max(max,i-map.get(sum));
            }
            else
                map.put(sum,i);
        }
        return max;
    }
}
