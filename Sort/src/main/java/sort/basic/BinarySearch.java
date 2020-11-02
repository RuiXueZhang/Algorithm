package sort.basic;

public class BinarySearch {
    public static void main(String[] args){

        int[] array = new int[]{3,24,56,67,76,88,89,90,90,92,345};

        int target = 90;
        boolean flag = true;
        int start = 0;
        int end = array.length-1;
        int result = 0;
        while(flag){
            int mindle = start + (end -start) >> 1;

            if(target > array[mindle]){
                start = mindle + 1;
            }else if( target == array[mindle]){
                result = mindle;
                flag = false;
            }else {
                end = mindle -1;
            }
        }
        System.out.println(result);

    }
}
