package MandatoryReplits;

public class Repl228 {
    public static int countLastWordChar(String str){
        int len=0;
        String x=str.trim();
        for (int i=0; i<x.length(); i++){
            if(x.charAt(i)==' ')
                len=0;
            else len++;
        }

        return len;
    }
    public static void main(String[] args) {

        String str="I love Java";

        System.out.println(countLastWordChar(str));


    }

}
