package MandatoryReplits;

import java.util.ArrayList;
import java.util.List;

public class Repl219 {
    public static List<Integer>
    countOnlyPrefixes(List<String> names,List<String> query){

        List <Integer> countPrefixes=new ArrayList<>();
        int count = 0;
        for (int i = 0; i < query.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                if (names.get(j).startsWith(query.get(i)) && !names.get(j).equals(query.get(i))) {
                    count++;
                }
            }
            countPrefixes.add(count);
            count=0;
        }
        return countPrefixes;
    }

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("steve");
        namesList.add("stevens");
        namesList.add("danny");
        namesList.add("steves");
        namesList.add("dan");
        namesList.add("john");
        namesList.add("johny");
        namesList.add("joe");
        namesList.add("alex");
        namesList.add("alexander");
        namesList.add("jordan");

        List<String> queryList = new ArrayList<>();
        queryList.add("steve");
        queryList.add("alex");
        queryList.add("joe");
        queryList.add("john");
        queryList.add("dan");

        System.out.println(countOnlyPrefixes(namesList,queryList));
    }
}

