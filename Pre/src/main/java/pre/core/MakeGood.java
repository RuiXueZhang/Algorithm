package pre.core;


public class MakeGood {

    public static void main(String[] args){
        String s = "abBAcC";
        System.out.println(goodString(s+","));
    }


    private static  String goodString(String s) {

        StringBuilder strings = new StringBuilder(s);
        int length = -1;
        while (length != strings.length()) {
            length = strings.length();
            for (int i = 0; i < length - 1; i++) {
                if (Math.abs(strings.charAt(i) -strings.charAt(i+1)) == 'a' -'A') {
                    strings.delete(i, i + 2);
                    break;
                }
            }
        }
      return strings.toString();
    }


}
