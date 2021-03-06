package dynamic.dib;

/**
 * 凑零钱问题
 * 给你 k 种面值的硬币，面值分别为 c1, c2 ... ck，每种硬币的数量无限，再给一个总金额 amount，问你最少需要几枚硬币凑出这个金额，如果不可能凑出，算法返回 -1
 *
 *
 */
public class Recursion {

    private static int coinChange(int[] coins, int amount){

        int result = Integer.MAX_VALUE;
        //确定base
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return -1;
        }

       for(int coin : coins){
           int subPriblems = coinChange(coins, amount - coin);
           if(subPriblems == -1){
               continue;
           }
           result = Math.min(result, subPriblems +1 );
       }

        return result;
    }

    public static void main(String[] args){
        int[] coins = {1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }

}
