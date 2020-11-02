package hua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Supplument {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while( (str = reader.readLine() ) != null){
            StringBuffer buffer = new StringBuffer(str);
            while (buffer.length() >= 8){
                System.out.println(buffer.substring(0,8));
                buffer.delete(0,8);
            }
            while (buffer.length() <8 && buffer.length() >0){
                buffer.append("00000000");
                System.out.println(buffer.substring(0,8));
            }
        }
    }
}
