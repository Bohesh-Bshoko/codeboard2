/**
 * NOTICE >>> you MUST select "SAVE CHANGES" on the menu <<<
 * 
 * For all answers, do NOT use String\array (unless stated otherwise).
 */
 
class StudentTask {
    
    static DummySol tmp = new DummySol(); //dummy solution used for UT

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
        a = Math.abs(a);
        int sum=0;
        for (a = Math.abs(a);  a>0;  a /= 10) {
            int ahadot = a%10;
            sum += ahadot;
        }
        return sum;
    }
    
    //helper functions
    public static int getLength (int num){
        return Integer.toString(num).length();
    }
    public static int findMax(int num){
        int max = -1;
        while(num > 0){
            if(num % 10 > max){
                max = num % 10;
            }
            num/=10;
        }
        return max;
    }
    public static int countX(int num , int x){
        int counter = 0;
        while(num > 0){
            if(num % 10 == x){
                counter++;
            }
            num/=10;
        }
        return counter;
    }


    /*-----------------------*
     * Lookup2 : simple loops, but calling HELPER functions,
     *                         and try to AVOID using String.
     *-----------------------*/
    // 
    // Create a mirror of the number. For zero return true.
    //   mirror(154) --> 451
    //   mirror(-67) -->  76
    //   mirror(3)   -->   3
    //   mirror(0)   -->   0
    // 
    public static int mirror(int a) {
        a = Math.abs(a);
        int tmp = 0;
        while(a > 0){
            tmp =tmp*10 + a%10;
            a/=10;
        }
        return tmp; // Your code here
    }

    // 
    // is the LEFT half identical to RIGHT half ?
    // For zero (or non-even length) return false.
    //   isRepeatTwice(134134) --> true
    //   isRepeatTwice( -1313) --> true
    //   isRepeatTwice(  -141) --> false
    //   isRepeatTwice(     3) --> false
    //   isRepeatTwice(     0) --> false
    // 
    // >>> Clue: use helper functions: countDigits & mirror, and "FOR" loop until mid-number.
    // 
    
    public static boolean isRepeatTwice(int a) {
        a = Math.abs(a);
        int len = getLength(a);
        
        if(len % 2 == 1 || len == 0){
            return false;
        }
        int right = a % (int)Math.pow(10,len/2);
        int left = a / (int)Math.pow(10,len/2);
        /*for(int i = 0;i<len/2;i++){
            if(b%10 != a%10){
                return false;
            }
            b/=10;
            a/=10;
        }*/
        return right == left;
    }
     
    // 
    // Does it look the same if reading from LEFT or from RIGHT.
    // For zero, return true.
    //   isPalindrome(14341) --> true
    //   isPalindrome(-1441) --> true
    //   isPalindrome(    3) --> true
    //   isPalindrome(    0) --> true
    //   isPalindrome(  441) --> false
    // 
    // >>> Option1: use "countDigits", do FOR loop until mid-number, check if mirror.
    // >>> Option2: WHILE loop to reverse the number, then compare to original.
    // 
    public static boolean isPalindrome(int a) {
        a = Math.abs(a);
        /*String str = Integer.toString(a);
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1- i)){
                return false;
            }
        }
        return true;*/
        int len = getLength(a);
        int mid = len/2;
        System.out.println(mid);
        int right = a % (int)Math.pow(10,mid);
        int left = a / (int)Math.pow(10,mid);
        System.out.println(right);System.out.println(left);
        return right == mirror(left);
        //return isPalindrome(a, getLength(a));
    }
    //@override
    public static boolean isPalindrome(int a,int diff){
        int divisor = (int)Math.pow(10, diff -1 );
        if(a == 0 || diff <= 1){
            return true;
        }
        if(a % 10 == a / divisor){
            return isPalindrome(a % divisor /10, diff -2);
        }
        return false;
    }
    // 
    // Assume that all MAX values will get GOLD medal together,
    // Find who is the silverMedal ? the value LESS than the best.
    // If none is found, than return -1:
    //   silverMedal(1424) --> 2
    //   silverMedal(-424) --> 2
    //   silverMedal(3333) --> -1
    //   silverMedal(7)    --> -1
    // 
    // >>> Clue: loop on digits, starting with 2 vars: int gold=-1, silver=-1
    // >>>       and/or use "findMax"
    // >>> Challenge: only ONE loop, and don't call findMax().
    // 
    public static int silverMedal(int a) {
        a = Math.abs(a);
        int max = -1, secondToMax = -1;
        while(a > 0){
            if(a % 10 > max){
                secondToMax = max;
                max = a % 10;
            }
            else if(a%10 > secondToMax && a%10 != max){
                secondToMax = a%10;
            }
            a /= 10;
        }
        return secondToMax;
        /*
        int max = findMax(a);
        int silver = -1;
        while (a > 0){
            if(a % 10 > silver && a%10 <max){
                silver = a%10;
            }
            a/=10;
        }
        return silver;
        */
    }

    // 
    // Who is the 2nd element from top: the elemant LESS-or-EQUAL to the best.
    // Only one can be the KING, but 2nd-best is the CROWN-PRINCE.
    // If none is found, than return -1:
    //   secondBest(1424) --> 4
    //   secondBest(-333) --> 3
    //   secondBest(7)    --> -1
    //   secondBest(000)  --> -1
    // 
    // >>> Clue: no loops needed.. just call other functions above.
    // 
    public static int secondBest(int a) {
        a = Math.abs(a);
        int max = findMax(a);
        //System.out.println(max +" "+countX(a, max)+" "+silverMedal(a));
        return countX(a, max) > 1 ? max :silverMedal(a); // Your code here
    }

    // 
    // Who is the mostCommon digit? the one that appears more than others.
    // If more than one is mostCommon, then return the smallest of them.
    // Example:
    //   mostCommon(1494) --> 4
    //   mostCommon(-333) --> 3
    //   mostCommon(0)    --> 0
    // 
    // >>> Clue: use helper function "countX", defined above.
    // 
    public static int mostCommon(int a) {
        a = Math.abs(a);
        
        int max = -1, theNum = -1,count;
        int len = getLength(a);
        
        for(int i = 0; i < len; i++){
            count = countX(a, a%10);
            if(count > max){
                max = count;
                theNum = a%10;
            }
            else if(count == max && theNum > a % 10){
                theNum = a%10;
            }
            a/=10;
        }
        return theNum;
    }
}
