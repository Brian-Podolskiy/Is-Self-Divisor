import java.util.ArrayList;

public class selfDivisor {
    public selfDivisor() {
    }
  
    public static boolean isSelfDivisor(int number) {
        int number2 = number;
        int divisor;
        boolean isDivisor = true;
  
        for (int i = String.valueOf(number).length(); i > 0; i--) {
            divisor = number2 % 10;
            if (divisor == 0 || number % divisor != 0) {
                isDivisor = false;
            }
            number2 /= 10;
        }
  
        return isDivisor;
    }
  
    public static ArrayList<Integer> firstNumSelfDivisors(int start, int num) {
        ArrayList<Integer> outArray = new ArrayList<Integer>();
        int result = start;
        for (int i = 0; i < num; i++) {
            if (isSelfDivisor(result)){
                outArray.add(result);
            }
            else{
                i--;
            }
            result++;
        }
        return outArray;
    }
}
  