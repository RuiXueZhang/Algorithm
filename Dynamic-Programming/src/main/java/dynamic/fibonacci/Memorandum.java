package dynamic.fibonacci;

/**
 * level  2
 * 斐波那契 的备忘录实现
 * 递归实现的缺点： 对一个位置的 结果重复计算
 * 备忘录实现改进： 维护一个数组，数组下标与值 对应 该位置的斐波那契 的值， 如果 该位置的值已存在，直接取值，无需重复计算
 */
public class Memorandum {

    private static int memorandun(int n){
        if(n <1 ){
            return 0;
        }
        int[] memorandum = new int[n+1];
        return helper(n, memorandum);
    }

    private static int helper(int n, int[] memo){
      if(n == 1 || n ==2 ){
          memo[n] = 1;
      }

      if(memo[n] != 0){
          return memo[n];
      }
      memo[n] = helper(n-1, memo) + helper(n-2, memo);
      return memo[n];
    }

    public static void main(String[] args){
        System.out.println(memorandun(20));
    }
}
