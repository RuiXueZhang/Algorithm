package pre.core;


public class NumWaterBottles {

    public static void main(String[] args){
        System.out.println(numWaterBottles(15,8));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {

        int result = numBottles, nullBottlesExchange, preNullBottlesExchange = numBottles;
        int nullBottles = 0;
        do{
            nullBottlesExchange = preNullBottlesExchange / numExchange;
            nullBottles = preNullBottlesExchange % numExchange + nullBottlesExchange;
            result = nullBottlesExchange + result;
            preNullBottlesExchange = nullBottles;

        }while (preNullBottlesExchange >= numExchange);
       return result;
    }
}
