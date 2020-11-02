package hua;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeastKey {

    public static Integer[] getLeastK(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 > o2) {
                    return 1;
                } else if(o1 < o2){
                    return -1;
                }else {
                    return 0;
                }
            }
        });

        for(int num : nums){

            if( queue.size() < k || num < queue.peek()){
                queue.offer(num);
            }

            if(queue.size() > k){
                queue.poll();
            }
        }


        return queue.toArray(new Integer[0]);


    }

    public static void main(String[] args){
        int[] nums = {45, 23, 23 ,12 , 56, 67, 23, 67, 78};
       Arrays.stream(getLeastK(nums, 3)).forEach(System.out::println);
    }
}
