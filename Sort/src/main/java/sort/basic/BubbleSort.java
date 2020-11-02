package sort.basic;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){

        int[] array = new int[]{45,23,13,1,24,13,24,56,23,67,24,67};

        for(int i = 0; i < array.length-1; i++){
            boolean flag = true;
            for(int j = 0;j <array.length -1; j ++){
               if(array[j] > array[j +1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                   flag = false;
               }
            }
            if(flag){
                break;
            }
        }

        Arrays.stream(array).forEach(System.out::println);

    }
}
