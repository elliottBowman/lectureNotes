package finalExamMaterial.week15_Dec3_tues;

public class Termination {
    /*@
        requires y >= 0;
        ensures \result == x*y;
    */
    public static int mult(int x, int y) {
        int sum = 0;
        int count = 0;

        //measure of work? (how many more iterations left?)
        //initially?
        //after 1 iteration?

        while (count < y) {

            sum = sum + x;
            count = count + 1;

            //measure should decrease with each iteration

            //when I have no work left, then my loop should be done
        }

        return sum;
    }

    /*@
        requires n > 0;
        ensures \result == 1;
    */
    public static int collatz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("parameter should be positive");
        }

        //what if n is 52?

        int cur = n;
        while (cur > 1) {
            if (cur % 2 == 0) {
                cur = cur / 2;
            }
            else {
                cur = 3 * cur + 1;
            }
        }

        return cur;
    }
}