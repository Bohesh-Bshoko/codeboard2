public class selfMadeFunctions {
    public static int countDigit(int n){
        n = Math.abs(n);
        int counter = 0;
        while(n > 0){
            n = n/10;
            counter++;
        }
        return counter;
    }

    public static int sumEvenDigits(int n){
        n = Math.abs(n);
        int sumEvens = 0;
        int digit;
        while(n > 0){
            digit = n%10;
            if(digit % 2 == 0){
                sumEvens +=digit;
            }
            n = n/10;
        }
        return sumEvens;
    }

    public static int sumOddDigits(int n){
        n = Math.abs(n);
        int sumOdds = 0;
        while(n > 0){
            if((n%10) % 2 == 1){
                sumOdds += n%10;
            }
            n = n/10;
        }
        return sumOdds;
    }
}
