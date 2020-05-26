class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int ALen=A.length;
        int BLen=B.length;
        int[][] arr= new int[ALen+1][BLen+1];
        for(int i=1;i<=ALen;i++)
        {
            for(int j=1;j<=BLen;j++)
            {
                if(A[i-1]==B[j-1])
                    arr[i][j]=1+arr[i-1][j-1];
                else
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        return arr[ALen][BLen];
    }
}
