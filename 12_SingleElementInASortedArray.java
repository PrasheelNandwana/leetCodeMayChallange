class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length, low=0, hi=n/2;
        while (low < hi) {
            int m = (low + hi) / 2;
            if (nums[2*m]!=nums[2*m+1]) hi = m;
            else low = m+1;
        }
        return nums[2*low];
    }
}
