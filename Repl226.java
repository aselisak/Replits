package MandatoryReplits;

public class Repl226 {
    public static String reverse(String strToRev){
        String revString ="";
        char c;
        for (int i=0; i<strToRev.length(); i++){
            c= strToRev.charAt(i);
            revString= c+revString;

        }
        return revString;
    }
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(reverse(s));
    }
}
