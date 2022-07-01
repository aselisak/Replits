package MandatoryReplits;

import java.util.*;

public class Repl217 {
    static int countDuplicates(List<Integer> numbers) {
    Map<Integer, Integer> map = new HashMap<>();
        for(Integer n: numbers){
        if(map.containsKey(n)){
            map.put(n, map.get(n)+1);
        } else {
            map.put(n,1);
        }
    }
    //checking if the value appears more than once, we count it
    int count = 0;
    Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entrySet){
        if(entry.getValue()>1){
            count++;
        }
    }
        return count;
}

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(6);
        list.add(10);
        list.add(6);
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(10);


        System.out.println(Repl217.countDuplicates(list));

    }
    }
