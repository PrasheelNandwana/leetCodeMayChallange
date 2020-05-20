class Solution {
    static int count=0;
    static int key=0;
    public int kthSmallest(TreeNode root, int k) {
        recur(root,k);
        // count=0;
        return key;
    }
    
    static void recur(TreeNode root,int k)
    {
        if(root==null)
            return;
        recur(root.left,k);
           ++count;
        if(count==k)
            key=root.val;
        recur(root.right,k);       
    }
}
