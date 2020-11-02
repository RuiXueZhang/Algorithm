package offer.simple;

/**
 * 查找 0-n-1 范围内的数在
 */
public class FindRepeatNumber {

    public static void main(String[] args){
        System.out.println(findRepeatNumber(new int[7]));
    }


    public static int findRepeatNumber(int[] nums) {
      // nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        for(int i=0; i< nums.length ;i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }

        return 0;
    }
}
