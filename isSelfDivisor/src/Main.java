/* Brian Podolskiy
 * 10/21/2024
 * Self Divisor Program
 * Check if an integer is a Self Divisor (if it can be evenly divided by each of it's digits)
 */

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        selfDivisor sd = new selfDivisor();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ansArray = new ArrayList<Integer>();
        int selfDivisorInput = 1;

        while (selfDivisorInput != 0){
            System.out.print("enter int (0 to exit): ");
            selfDivisorInput = in.nextInt();

            System.out.println(sd.isSelfDivisor(selfDivisorInput));
            ansArray = sd.firstNumSelfDivisors(selfDivisorInput, 3);

            for (int i = 0; i < ansArray.size(); i++){
                System.out.println("in arr: " + ansArray.get(i));
            }
        }
    }
  }