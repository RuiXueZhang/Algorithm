package sort.repeat;

public class CeilSort {

    public static void main(String[] args){

      int[] arr = new int[]{12,23,12,45,54,12,4,1,4,6,12};

      sort(arr, new int[arr.length], 0, arr.length-1);

      for(int i=0;i< arr.length-1; i++){
          System.out.print(arr[i]+",");
      }

    }

    public static void sort(int[] arr, int[] tempArr, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }

        int middleIndex = startIndex + (endIndex- startIndex)/2;

        sort(arr, tempArr, startIndex, middleIndex);
        sort(arr, tempArr, middleIndex+1, endIndex);

       merge(arr, tempArr, startIndex, middleIndex, endIndex);
    }

    public static void merge(int[] arr, int[] temp, int startIndex, int middleIndex, int endIndex){

       //赋值要合并的数据
        for(int s = startIndex; s <= endIndex; s++){
            temp[s] = arr[s];
        }

        int left = startIndex; //最左边
        int right = middleIndex+1; //最右边

        for(int k = startIndex; k <= endIndex; k++){
            if(left > middleIndex){
                arr[k] = temp[right++];
            }else if(right > middleIndex){
                arr[k] = temp[left++];
            }else if(temp[right] > temp[left]){
                arr[k] = temp[right++];
            }else {
                arr[k] = temp[left++];
            }
        }

    }
}
