package hua;

import java.io.IOException;
import java.io.InputStream;

public class LastString {
    public static void main(String[] args) throws IOException {
        InputStream in =System.in;
        char s = (char) in.read();
        int length = 0;
        while (s != '\n'){
            if(' ' != s){
                length = ++length;
            }else {
                length = 0;
            }
            s = (char) in.read();
        }
        System.out.println(length);
    }
}
