package sort.repeat;

public class SelectSort2 {

    public  static void main(String[] args){

        int[] arr = new int[]{1,34,23,12,44,23,13};

        for(int i =0; i< arr.length-1; i++){

            int min = i;

            for(int j=i+1; j<arr.length-1;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
    }
}
