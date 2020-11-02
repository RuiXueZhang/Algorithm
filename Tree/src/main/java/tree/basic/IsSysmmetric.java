package tree.basic;

public class IsSysmmetric {

    public boolean isSysmmetric(TreeNode root){

        return check(root, root);
    }


     public boolean check(TreeNode left, TreeNode right){

        if(left ==  null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
