package dynamic.fibonacci;

/**
 * level  1
 * 使用递归解决斐波那契数列  问题
 * 缺陷：
 *     重复计算
 *     例如：
 *         helper(20) = helper(19) + helper(18);
 *         helper(19) = helper(18) + helper(17);
 *
 *        其中 helper(18) 会被重复计算， 根据 斐波那契的 递归树，可以得出 这种算法的时间复杂度O(n^2),
 *                      heper（20）
 *             /                       \
 *        helper（19）               helper(18)
 *         /        \               /         \
 *   helper(18)   helper(17)   helper(17)  helper(16)
 *      /            \             /             \
 *   ...            ...         ...              ...
 *   /                \          /                \
 * helper(n-1)    helper(n-2) helper(n-1)      helper(n-2)
 */
public class Recursion {

    private static int helper(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return helper(n-1) + helper(n-2);
    }

    public static void main(String[] args){
       System.out.println(helper(5) + "");
    }
}
