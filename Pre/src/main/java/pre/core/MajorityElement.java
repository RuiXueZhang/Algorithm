package pre.core;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElement {


    //  摩尔投票法
    //  拥有最多投票的那个人，可以用自己的票抵消其他人的票（大于n/2)，不论他一直被与他所有不同的抵消，还是其他元素之间会相会抵消，他都是最后留下的
    public static  int majorityElement(int[] nums) {

        int major = nums[0];
        int count = 0;
        for (int num : nums) {
            if (major == num) {
                ++count;
            } else {
                if (count == 0) {
                    major = num;
                    count = 1;
                } else {
                    --count;
                }
            }
        }

        return major;
    }

    public static void main(String[] args){
     System.out.println(majorityElement(new int[]{6,5,5}));
    }

}
