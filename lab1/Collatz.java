/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /**
     * Calculates the next number in the Collatz sequence based on the current number.
     * If the current number is even, the next number is n/2. If it's odd, the next number is 3n + 1.
     * If the current number is 1, the sequence is over.
     *
     * @param n the current number in the Collatz sequence
     * @return the next number in the sequence
     */
    public static int nextNumber(int n) {
        if (n  == 1) {
            return 1;
        } else if (n % 2 == 1) {
            return 3 * n + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

