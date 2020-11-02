package sort.basic;

import java.util.Arrays;

public class QuickSortPointer {

    public static void main(String[] args){

        int[] arr = new int[]{7,6,5,4,3,2,1};

        sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int startIndex, int endIndex){

        if(startIndex >= endIndex){
            return;
        }

        int pivot =  postition(arr, startIndex, endIndex);

        sort(arr, startIndex, pivot - 1);
        sort(arr, pivot + 1, endIndex);
    }

    private static int postition(int[] arr, int startIndex, int endIndex) {

        int pivot = arr[startIndex];

        int left = startIndex;

        int right = endIndex;

        while (left != right) {

            while (left < right && arr[left] <= pivot) {
                left++;
            }

            while (left < right && arr[right]> pivot){
                right--;
            }

            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[startIndex];
        arr[startIndex] = temp;

        return left;
    }
}
