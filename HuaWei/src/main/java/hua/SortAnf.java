package hua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortAnf {

    public static void main(String[] args) throws IOException {

       System.out.println(addInNum());

    }

    public static Integer addInNum() throws IOException {
        int result = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String size = bufferedReader.readLine();

        String s = bufferedReader.readLine();
        String[] nums = s.split(" ");
        int addNum = Integer.parseInt(bufferedReader.readLine());
        IntStream arrayStream = Stream.of(nums).mapToInt(Integer::parseInt);
        int[] array = arrayStream.toArray();
        if (sort(array)) {
          for(int i = 0; i< addNum; i++){
              result = result + array[i] + array[array.length - i -1];
          }
        } else {
            result = -1;
        }
        return result;

    }

     public static boolean sort(int[] array){
          boolean flag = true;
         for(int i = 0; i < array.length -1; i++){
             int min = i;
             for(int j = i+1; j< array.length; j++){

                 if(array[min] == array[j]){
                     flag = false;
                     break;
                 }

                 if(array[min] > array[j]){
                     min = j;
                 }


             }

             if(!flag){
                 break;
             }

             if( i != min){
                 int temp = array[min];
                 array[min] = array[i];
                 array[i] = temp;
             }
         }

         return flag;
     }
}
