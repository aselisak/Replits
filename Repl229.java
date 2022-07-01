package MandatoryReplits;

import java.util.HashMap;
import java.util.Map;

public class Repl229 {
    public static int countMaxChar(String str) {
        char [] charArr=str.toCharArray();
        Map<Character, Integer> charMap=new HashMap<>();
        for (char c : charArr){
            if (charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else {
                charMap.put(c,1);
            }
        }
        int maxCharRepetition=0;
        for (Map.Entry<Character,Integer> entrySet : charMap.entrySet()){
            if (entrySet.getValue()>maxCharRepetition){
                maxCharRepetition= entrySet.getValue();
            }
        }
        return maxCharRepetition;
    }


    public static void main(String[] args) {
        String letters="jahshhhhcncccklllhhhh";
        System.out.println(Repl229.countMaxChar(letters));
    }
}