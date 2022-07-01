package MandatoryReplits;

public class Repl215 {
    public static void main(String[] args) {

        Repl215 obj = new Repl215();
        System.out.println(obj.isBalanced("((()))"));
    }
    public boolean isBalanced(String s){
        String openBr =s.replace("(","");
        String closeBr = s.replace("(","");
        if(openBr.length()==closeBr.length()){
            return true;
        }else {
            return false;
        }
    }
}
