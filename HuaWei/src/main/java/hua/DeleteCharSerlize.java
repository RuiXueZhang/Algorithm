package hua;

public class DeleteCharSerlize {

    public static void main(String[] args){

        String str = "ecdfgba";

        String result = delete(str);
        System.out.println(result);

    }



    private static String delete(String str) {

        StringBuilder buffer = new StringBuilder(str);
        boolean flag;

        do {
            int index = 0,end = 0;
            flag = false;
            char[] chars = buffer.toString().toCharArray();
            for (int i =0; i < chars.length -1; i++) {

                if (chars[i] + 1 == chars[i+1]) {
                    if(!flag){
                        index = i;
                    }
                    end = i + 2;
                    flag=true;
                }
            }
            buffer.delete(index, end);

        }while (flag);

        return buffer.toString();
    }

    }
