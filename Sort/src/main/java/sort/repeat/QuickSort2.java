package sort.repeat;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args){
        int[] arr = new int[]{23,23,12,4,3,53,56,78,54};

        sort(arr, 0 ,arr.length-1);

        System.out.print(Arrays.toString(arr));
    }


    public static  void sort(int[] arr, int startIndex, int endIndex){

        if(startIndex >= endIndex){
            return;
        }

        int pivot = postition(arr, startIndex, endIndex);

        sort(arr, startIndex, pivot-1 );
        sort(arr, pivot+1, endIndex);
    }

    private static int postition(int[] arr, int startIndex, int endIndex) {

        int pivot = arr[startIndex];

        int left = startIndex;

        int right  = endIndex;

        int index = startIndex;

        while (right >= left){

            while (right >= left){
                if(arr[right] < pivot){
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }

            while (right >= left){
              if(arr[left] > pivot){
                  arr[right] = arr[left];
                  index = left;
                  right--;
              }
              left++;
            }


        }

        arr[index] = pivot;
        return index;


    }
}
