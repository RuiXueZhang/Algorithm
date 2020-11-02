package sort.repeat;

public class InsertSort {

    public static void main(String[] args){

        int[] arr = new int[]{34,1,23,1,23,7,9,2,5,7};

        for(int i=1; i<arr.length; i++){
            int value = arr[i];
            int j=0;
            for ( j= i-1; j>=0; j--){
                if(arr[j] > value){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = value;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
}
