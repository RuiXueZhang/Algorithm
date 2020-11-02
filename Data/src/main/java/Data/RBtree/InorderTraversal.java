package Data.RBtree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {

    public static void main(String[] args){

        Integer[] array = {3, 9, 20, null, null, 15, 7};
        int index = 0;
        TreeNode node = arrayToTree(array, 0);
        List<Integer> list = traversal(node);
        list.forEach(System.out::println);

    }

    public static List<Integer> traversal(TreeNode node){

        List<Integer>  result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        while(node != null){

            while (node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node = node.right;
        }
        return result;

    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static TreeNode arrayToTree(Integer[] array, int index){
        TreeNode root = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            root = new TreeNode(value);
            root.left = arrayToTree(array, 2*index+1);
            root.right = arrayToTree(array, 2*index+2);
            return root;
        }
        return root;
    }
    //得到树的深度
    private int getDepth(ArrayToTree.TreeNode root){
        if (root == null) return 0;
        int ld = getDepth(root.left);
        int rd = getDepth(root.right);
        return ld>rd?(ld+1):(rd+1);
    }
}
