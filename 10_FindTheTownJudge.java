class Solution {
    public int findJudge(int N, int[][] trust) {
     int[] prop2= new int[N];
        for(int i=0;i<trust.length;i++)
        {
            ++prop2[trust[i][0]-1];
        }
        int key=-1;
        for(int i=0;i<N;i++)
        {
            if(prop2[i]==0)
            {
                key=i+1;
                break;
            }
        }
        if(key==-1)
            return -1;
        
    int[] prop1=new int[N];
        for(int i=0;i<trust.length;i++)
        {
            if(trust[i][1]==key)
                ++prop1[trust[i][0]-1];
        }
        for(int i=0;i<N;i++)
        {
            if(prop1[i]==0 && i!=key-1)
                return -1;
        }
        return key;
    }
}
