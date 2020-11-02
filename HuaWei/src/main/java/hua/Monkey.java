package hua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monkey {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        System.out.println(times(num));
    }

    private static Integer times(int time) {
          if (time == 1 || time == 2) {
              return 1;
          }

          if(time == 3){
              return 2;
          }

          return times(time - 1) + times(time - 3);

    }
}
