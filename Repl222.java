package MandatoryReplits;

import java.util.ArrayList;
import java.util.List;

public class Repl222 {
    public static int findMaxSum(List<Integer> list) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }
        return largest + secLargest;
    }


    public static void main(String[] args) {
        List<Integer> numslist = new ArrayList<>();
        numslist.add(100);
        numslist.add(17);
        numslist.add(30);
        numslist.add(22);
        numslist.add(10);
        numslist.add(22);


        System.out.println(Repl222.findMaxSum(numslist));
    }
    }

