package tree;

public class PathSum_112
{
    public boolean hasPathSum(TreeNode root, int targetSum)
    {
        if(root == null) return false;

        if(root.left == null && root.right == null)
        {
            if(targetSum - root.val == 0) return true;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
