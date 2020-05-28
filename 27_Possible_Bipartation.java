class Solution {
    public boolean possibleBipartition(int N, int[][] dislike) {
        int[] grp=new int[N];
        Arrays.fill(grp,-1);
        ArrayList<Integer>[] adjList=new ArrayList[N];
        for(int i=0;i<N;i++)
            adjList[i]=new ArrayList();
        for(int i=0;i<dislike.length;i++)
        {
            adjList[dislike[i][0]-1].add(dislike[i][1]-1);
            adjList[dislike[i][1]-1].add(dislike[i][0]-1);
        }
        for(int i=0;i<N;i++)
            if(grp[i]==-1 && !dfs(adjList,grp,i,0))
                return false;
        return true;
    }
    boolean dfs(ArrayList<Integer>[] adjList,int[] grp,int v,int group)
    {
        if(grp[v]==-1) grp[v]=group;
        else return(group==grp[v]);
        for(int i:adjList[v])
            if(!dfs(adjList,grp,i,1-group))
                return false;
        return true;
                
    }
}
