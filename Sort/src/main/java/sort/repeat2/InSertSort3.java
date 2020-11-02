package sort.repeat2;

public class InSertSort3 {

    public static void main(String[] args){
        sort();
    }


    public static void sort(){
        int[]  arr = new int[]{12,45,32,1,2,56,7,34};

        for(int i=1;i<arr.length; i++){
            int value =arr[i];
            int j;
            for(j =i-1; j>=0; j--){
                if(arr[j]> value){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = value;

        }

        for (int value : arr) {
            System.out.print(value + ",");
        }
    }
}
