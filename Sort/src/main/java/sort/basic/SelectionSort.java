package sort.basic;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){

        int[] array = new int[]{45,23,13,1,24,13,24,56,23,67,24,67};

        for(int i = 0; i < array.length -1; i++){
            int min = i;
            for(int j = i+1; j< array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }

            if( i != min){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }

        }
        Arrays.stream(array).forEach(System.out::println);

    }
}
