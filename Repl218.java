package MandatoryReplits;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repl218 {
    public static List<String> countDeviceNames(List<String> deviceNames) {

       Map<String,Integer> newMap = new LinkedHashMap<>();
       for(int i=0; i<deviceNames.size(); i++){
           try {
               newMap.put(deviceNames.get(i),newMap.get(deviceNames.get(i))+1);
               deviceNames.set(i,(deviceNames.get(i)+(newMap.get(deviceNames.get(i))).toString()));
           }catch (Exception e){
               newMap.put(deviceNames.get(i),0);
           }
       }
       return deviceNames;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add ("tv");
        list.add("fridge");
        list.add("microwave");
        list.add("tv");
        list.add("car");
        list.add("car");

        System.out.println(Repl218.countDeviceNames(list));
    }
}
