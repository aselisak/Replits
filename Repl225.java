package MandatoryReplits;

public class Repl225 {
    public  static int reverseInteger(int N){
        int num = 0;
        while (N > 0) {
            num = num * 10 + N % 10;
            N = N / 10;
        }
        return num;
    }

    public static void main(String[] args) {

        int num = 3258;
        System.out.println(reverseInteger(num));
    }

}
