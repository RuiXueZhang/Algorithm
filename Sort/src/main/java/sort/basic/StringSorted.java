package sort.basic;



import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

import java.util.List;

public class StringSorted {

    public static void main(String[] args) {

       List<String> queueName = Arrays.asList("1&1", "1&2", "1&3", "2&2", "2&3", "3&1", "3&2");

       queueName = Arrays.asList("1","2","3");
      //  queueName.sort(Comparator.comparing(o -> Integer.valueOf(o.replaceAll("&", ""))));

        /*
        Collections.sort(queueName, new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return new Integer(o1.replaceAll("&", ""))
                        .compareTo(new Integer(o2.replaceAll("&", "")));
            }

        });

         */
        String[] arr = {"1","2","3&1","3&2", "3&3"};
        //StringUtils.sortStringArray(arr);
        //Arrays.stream(arr).forEach(System.out::print);

        System.out.println(StringUtils.join(queueName,","));

       // System.out.println(U.objectFieldOffset(queueName));

        final int MAXIMUM_CAPACITY = 1 << 30;

        System.out.println(MAXIMUM_CAPACITY);
    }


}
