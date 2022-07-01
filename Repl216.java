package MandatoryReplits;
import java.util.Arrays;
public class Repl216 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arraySumToZero(6)));
    }
    public static int[] arraySumToZero(int n) {
        int[] intArr = new int[n];
        for (int i = 0; i < n / 2; i++) {
            intArr[i] = n - i;
            intArr[intArr.length - 1 - i] = (n - i) * -1;
        }
        return intArr;
    }
}
