package sort.repeat;

public class BubbleSort2 {

    public static void main(String[] args){

        int[] arr = new int[]{1,4,56,1,31,5,13};

        for(int i=0; i <arr.length -1; i++){
            boolean isSort = true;
            for(int j=0; j<arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
        for(int i=0;i<arr.length - 1; i++) {
            System.out.print(arr[i]+",");
        }

    }
}
