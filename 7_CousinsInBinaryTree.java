class Solution {
    int parent=0;
    int height=0;
    //public static int parentY=0;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        searchTree(root,x,0);
        int temp=this.parent;
        int dep=this.height;
        if(x==root.val ||y==root.val)
            return false;
        searchTree(root,y,0);
        if(this.parent!=temp)
        {
            if(dep==this.height)
                return true;
        }
            return false;
    }
    private void searchTree(TreeNode key,int val,int dep)
    {
        if(key==null)
            return;
        if(key.left!=null)
        {
            if(key.left.val==val)
            {
                this.parent= key.val;
                this.height=dep;
            }
            searchTree(key.left,val,dep+1);
        }
        if(key.right!=null)
        {
            if(key.right.val==val)
            {
                this.parent=key.val;
                this.height=dep;
            }
            searchTree(key.right,val,dep+1);
        }
        return;
    }
    
}
