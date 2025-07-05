/** Class that prints the Collatz sequence starting from a given number.
 *  @author Ian Chen
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n <= 0){
            /* for those n smaller or equal to 0 */
            return 1;
        }

        /* to check whether n to reach the stop number 1*/
        if (n == 1 ){
            return 1;
        }
        /* to check whether n odd or even */
        else if ( n % 2 == 0) {
            return n/2; /* when n is even, return n/2 */
        } else {
            return 3 * n + 1; /* when n is odd, return 3*n+1 */
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n !=1 ){
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

