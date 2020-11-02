package sort.basic;

public class QuickSort {

    public static  void main(String[] args){
        int[] arr = new int[]{23,12,4,23,12,56,76,3,4};

        quickSort(arr, 0 ,arr.length-1);

        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex){

        if (startIndex >= endIndex) {
            return;
        }

        //得到基准元素
        int pivot = partition(arr, startIndex, endIndex);

        quickSort(arr, startIndex, pivot-1);
        quickSort(arr, pivot+1, endIndex);


    }

    private static int partition(int[] arr, int startIndex, int endIndex) {

        //取第一个位置的元素
        int pivot = arr[startIndex];

        int left = startIndex;

        int right = endIndex;

        //坑的位置
        int index = startIndex;

        while (right >= left){
            while (right >= left){
                if(arr[right] < pivot){
                    arr[left] = arr[right];
                    index = right;
                    left ++;
                    break;
                }
                right--;
            }

            while (right >= left){
                if(arr[left] > pivot){
                    arr[right] = arr[left];
                    index = left;
                    right --;
                    break;
                }
                left++;
            }

        }

        arr[index] = pivot;

        return index;
    }
}
