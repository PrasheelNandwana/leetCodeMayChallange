class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int curMax=0;
        int curMin=0;
        int total=0;
        int MaxSum=Integer.MIN_VALUE,MinSum=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            curMax=Math.max(curMax+A[i],A[i]);
            MaxSum=Math.max(curMax,MaxSum);
            curMin=Math.min(curMin+A[i],A[i]);
            MinSum=Math.min(curMin,MinSum);
            total+=A[i];
        }
        return MaxSum>0 ? Math.max(total-MinSum,MaxSum) : MaxSum;
    }
}
