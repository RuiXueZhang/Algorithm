package principle.basic;

public class PrintReverse {

    public static void main(String[] args){
        char[] chars = new char[]{'a','o','e','i','u','v'};
        hepler(0, chars);
    }

    public static void hepler(int index, char[] chars){
       if(chars == null || index > chars.length -1){
           return;
       }

       hepler(index+1, chars);
       System.out.println(chars[index]);
    }
}
