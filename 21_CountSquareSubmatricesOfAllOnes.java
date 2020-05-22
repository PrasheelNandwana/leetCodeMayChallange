class Solution {
    public int countSquares(int[][] matrix) {
        //int noOfRows=matrix.length;
        //int noOfCols=matrix[0].length;
        //int [][] dp= new int[noOfRows][noOfCols];
        int total=0;
        // for(int i=0;i<noOfRows;i++)
        // {
        //     dp[i][0]=matrix[i][0];
        //     total+=dp[i][0];
        // }
        // for(int i=1;i<noOfCols;i++)
        // {
        //     dp[0][i]=matrix[0][i];
        //     total+=dp[0][i];
        // }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==1 && i>0  && j>0)
                {
                    matrix[i][j]=1+Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                    
                }
                total+=matrix[i][j];
            }
        }
        return total;

    }
}
