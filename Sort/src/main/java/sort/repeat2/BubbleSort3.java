package sort.repeat2;

public class BubbleSort3 {

    public static void main(String[] args){

        sort();
    }


    public static void sort(){

        int[] arr = new int[]{1,34,3,4,21,6,4,3,2,89};

        for(int i=0;i <arr.length-1;i++){
            boolean sort = true;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                    sort = false;
                }
            }
            if(sort){
                break;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
}
