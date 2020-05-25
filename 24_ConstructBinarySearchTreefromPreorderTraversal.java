class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
           root=bst(root,preorder[i]);
        return root;
    }
    
    TreeNode bst(TreeNode root,int val)
    {
        if(root==null)
        {
            root=new TreeNode(val);
            return root;
        }
        if(val>root.val)
            root.right=bst(root.right,val);
        else
            root.left=bst(root.left,val);
        return root;
    }
}
