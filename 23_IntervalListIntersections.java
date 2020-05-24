class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i=0,j=0;
        int max=0,min=0;
        ArrayList <int[]> arr= new ArrayList<>();
        while(i<A.length && j<B.length)
        {
            max=Math.min(A[i][1],B[j][1]);
            min=Math.max(A[i][0],B[j][0]);
            if(max>=min)
            {
                arr.add(new int[]{min,max});
            }            
            if(A[i][1]>B[j][1])
                ++j;
            else if(A[i][1]==B[j][1])
            {
                ++i;++j;
            }
            else
                ++i;
           
       }
        int[][] ret = new int[arr.size()][2];
        for(i=0;i<arr.size();i++)
        {
            ret[i][0]=arr.get(i)[0];
            ret[i][1]=arr.get(i)[1];
        }
            
        return ret;
    }
}
