package dynamic.fibonacci;

/**
 * level  3
 * 备忘录 方法是记录每一次的结果，但是我们最终的结果 只与最后两个值有关
 * 因此，此次我们只记录 目前 和上一个的值，然后向上迭代， 这种技巧成为状态压缩
 */
public class DPTable {

    private static int helper(int n){
        int current = 0;
        int pre = 0;
        if(n == 1 || n == 2){
            current = 1 ;
            return current;
        }
        current = 1;
        pre = 1;
        for (int i = 3; i < n + 1; i++){
            int temp = current + pre;
            pre = current;
            current = temp;
        }
        return current;
    }

    public static void main(String[] args){
        System.out.println(helper(20));
    }
}
