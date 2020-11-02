package dynamic.bag;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class basic {

    public static void main(String[] args){
        List<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(1);
        result.add(3);
        result = result.stream().sorted().collect(Collectors.toList());
        System.out.println(StringUtils.join(result, ","));
     }
}
