package tree.basic;

public class TreeDepth {


    public int getDepth(TreeNode node){
        if(node == null){
            return 0;
        }

        int ld = getDepth(node.left);
        int rd = getDepth(node.right);
        return ld > rd ? ld +1 : rd +1;

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
