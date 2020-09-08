package hua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChar {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        long count = 0;
        if (s != null){
            char target = reader.readLine().toCharArray()[0];
            for(int i = 0; i< s.length(); i++){
                if(s.charAt(i) == target || s.charAt(i) == target -32 || s.charAt(i) == target+32 ){
                    count+=1;
                }
            }
        }
        System.out.println(count);

    }
}
