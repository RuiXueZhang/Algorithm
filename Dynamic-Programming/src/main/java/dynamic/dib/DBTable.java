package dynamic.dib;

import java.util.Arrays;

public class DBTable {

    private  static int coinsCahnge(int[] coins, int amount){

        int max= amount + 1 ;
        int[] count = new int[max];
        Arrays.fill(count, max);
        count[0] = 0;
        for(int i = 1; i<= amount ; i++){
            for(int coin : coins){
                if(coin <= i){
                    count[i] = Math.min(count[i], count[i -coin]+1);
                }

            }
        }

        return count[amount] > amount ? -1 : count[amount];

    }
    public static void main(String[] args){

        int[] coins ={2,2,3};
        System.out.println(coinsCahnge(coins, 11));

    }
}
