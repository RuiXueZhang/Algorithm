package hua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexToDecimal {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = reader.readLine()) != null){

            char[] hex= {'0','1','2','3','4','5','6', '7','8','9','A','B','C','D','E','F'};
            int[] decimal = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

            char[] input = s.toCharArray();
            int result = 0;
            for(int i = input.length ; i >=1 ; i--){
                for(int j= 0; j< decimal.length-1; j++){
                    if(input[i-1] == hex[j]){
                        result += 16 ^ (i-1) * decimal[j];

                    }
                }
            }
            System.out.println(result);

        }
    }
}
