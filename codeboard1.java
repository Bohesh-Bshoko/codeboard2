/**
 * NOTICE >>> you MUST select "SAVE CHANGES" on the menu <<<
 */
 
class StudentTask {
    
    static DummySol tmp = new DummySol(); // used for UT


    /**
     * Example: Separate DIGITS, using of FOR, WHILE
     */
    public static int sumDigits_WHILE(int a) {
        a = Math.abs(a);
        int sum = 0;
        while (a>0) {
            int ahadot = a%10;
            sum += ahadot;
            a /= 10;    //same as:  a = a/10
        }
        return sum;
    }

    public static int sumDigits_FOR(int a) {
        int sum=0;
        for (a = Math.abs(a);  a>0;  a /= 10) {
            int ahadot = a%10;
            sum += ahadot;
        }
        return sum;
    }



    /*--------------------*
     * Loop Digit Lookup1 *
     *--------------------*/

    /**
     * Finds the maximum digit.
     * Works also for negative numbers.   Example:
     *   findMax(1423) --> 4
     *   findMax(-327) --> 7
     *   findMax(0)    --> 0
     * @param input the number to search in
     * @return the max digit
     */
    public static int findMax(int a) {
        a = Math.abs(a);
        int max = -1;
        while(a > 0){
            if(a%10 > max){
                max = a%10;
            }
            a/=10;
        }
        return max;
    }

    /**
     * Sum of all even digits.  Example:
     *   sumOfEven(1423) --> 6
     *   sumOfEven(-327) --> 2
     *   sumOfEven(0)    --> 0
     * @param input the array to search in
     * @return the sum of all even elements of input
     */
    public static int sumOfEven(int a) {
        a = Math.abs(a);
        int sum = 0;
        while(a > 0){
            if((a%10) % 2 == 0){
                sum += a%10;
            }
            a/=10;
        }
        return sum;
    }

    /**
     * Return a count of all odd digits.  Example:
     *   countOfOdd(1725) --> 3
     *   countOfOdd(-277) --> 2
     *   countOfOdd(0)    --> 0
     * 
     * >>> Optional Challenge: can be done without "if" command.
     * 
     * @param input the number to search in
     * @return count of odd values
     */
    public static int countOfOdd(int a) {
        //a = Math.abs(a);
        int counter = 0;
        while(a > 0){
            if((a%10) % 2 != 0){
                counter++;
            }
            a/=10;
        }
        return counter; // Your code here
    }

    /**
     * Return exact average of all even digits.
     * Example:
     *   averageOfEven(1424) --> 3.3333
     *   averageOfEven(3733) --> 0
     *   averageOfEven(0)    --> 0
     * 
     * >>> Optional Challenge: can be done without loop command: just call other functions.
     * 
     * @param input number to search in
     * @return average of even values
     */
    public static double averageOfEven(int a) {
        a = Math.abs(a);
        int sum = 0, counter = 0;
        while(a > 0){
            if((a%10) % 2 == 0){
                sum += a%10;
                counter++;
            }
            a/=10;
        }
        return counter == 0 ? 0 : ((double)sum)/counter; // Your code here
    }
    
    /**
     * How many times the value X appears in the array.
     *   countX(1424, 4) --> 2
     *   countX(3733, 2) --> 0
     *   countX(3033, 0) --> 1
     *   countX(0, 0) --> 0
     * 
     * >>> Optional Challenge: use "ternary operator" without "if" command.
     * 
     * @param array to search in
     * @param the X to lookup
     * @return count of X
     */
    public static int countX(int a, int digit) {
        a = Math.abs(a);
        int counter = 0;
        while(a > 0){
            if((a%10) == digit){
                counter++;
            }
            a/=10;
        }
        return counter; // Your code here
    }
}
