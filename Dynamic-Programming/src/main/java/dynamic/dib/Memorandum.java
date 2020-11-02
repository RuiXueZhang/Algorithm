package dynamic.dib;

import javax.print.DocFlavor;

public class Memorandum {

    private static  int coinsChange(int[] coins, int amount, int[] count){

        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return -1;
        }
        if(count[amount -1] != 0){
            return count[amount -1];
        }

        int min = Integer.MAX_VALUE;
        for(int coin: coins){

           int result = coinsChange(coins, amount - coin, count);

           if(result == -1){
               continue;
           }

           count[amount-1] = Math.min(min, result+1);
           min = count[amount -1];

        }

        return min == Integer.MAX_VALUE ? -1 :count[amount -1];
    }

    public static void main(String[] args){

        int[] coins = {1,2,5};

        System.out.println(coinsChange(coins, 11, new int[11]));

    }
}
