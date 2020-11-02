package Data.RBtree;

public class ArrayToTree {

    public static void main(String[] args) {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode node = arrayToTree(array, 0);
        System.out.println(node.left.val);
    }

    private static TreeNode arrayToTree(Integer[] array, int index) {
        TreeNode root = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            root = new TreeNode(value);
            root.left = arrayToTree(array, 2 * index + 1);
            root.right = arrayToTree(array, 2 * index + 2);
            return root;
        }
        return root;
    }

    //得到树的深度
    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        int ld = getDepth(root.left);
        int rd = getDepth(root.right);
        return ld > rd ? (ld + 1) : (rd + 1);
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
