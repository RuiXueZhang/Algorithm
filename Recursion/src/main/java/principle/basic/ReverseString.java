package principle.basic;


public class ReverseString {

    public static void main(String[] args){

        char[] strings = new char[]{'a','o','e','i','u','v'};
        StringBuilder stringBuilder = reverse(0, strings, new StringBuilder());
        System.out.println(stringBuilder.toString());


    }

    public static StringBuilder reverse(int index, char[] strings, StringBuilder builder){

        if(strings == null || index > strings.length -1){
            return builder;
        }

        reverse(index +1, strings, builder);
          builder.append(strings[index]);
        return builder;

    }
}
