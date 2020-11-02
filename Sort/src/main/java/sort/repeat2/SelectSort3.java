package sort.repeat2;

public class SelectSort3 {

    public static void main(String[] args){
        sort();
    }
    public static void sort(){
        int[] arr = new int[]{34,45,12,78,34,56,76,23};

        for(int i=0; i<arr.length; i++){
            int min = i;
            for (int j=i;  j<arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }

}
