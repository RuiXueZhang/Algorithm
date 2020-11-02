package hua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortAndDistinct {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = reader.readLine()) != null){
            boolean[] input  = new boolean[1001];
            StringBuffer buffer = new StringBuffer();
            Integer n = Integer.valueOf(str);
            for(int i = 0; i< n ; i++){
                input[Integer.parseInt(reader.readLine())] = true;
            }

            for(int i =0; i < 1001; i++){
                if(input[i]){
                    buffer.append(i).append('\n');
                }
            }
            buffer.deleteCharAt(buffer.length()-1);
           System.out.println(buffer.toString());
        }
    }
}
