/**
 * Created by chris on 8/3/16.
 */
public class FizzBuzz {
    void doIt(int start, int finish) {
        for (int x = start; x < finish; x++) {
            if ((x % 3 == 0) && (x % 5 ==0)) {
                System.out.print("FizzBuzz ");
            } else if (x % 3 == 0) {
                System.out.print("Fizz ");
            } else if (x % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(x + " ");
            }
        }
    }
}
