import java.util.Random;
import java.util.Scanner;

public class loops201 {
    /*
    *   ex 7.56
    *
    *  a) 9
    *  b) 7
    *  c) לבדוק אם המספר שהתקבל נמצא בתוןך
    *  d) לסכום את תוצאות הקוביה במידה והם מתאימים
    * */

    public static void ex758(){
        Scanner scan = new Scanner(System.in);

        String password = scan.next();
        int countC = 0, countS = 0, i = 0;

        while(password.charAt(i) == '*'){
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                countC++;
            }
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                countS++;
            }
            i++;
        }
        if(i>=6 && countC >= 1 && countS >=1){
            System.out.println("the password is ok");
        }
        else{
            System.out.println("password is incorrect");
        }
    }
    public static void ex759(){
        Scanner in = new Scanner(System.in);
        boolean diff;
        int i;
        char let1,let2,let3;

        diff = false;
        i=0;
        while(!diff){
            System.out.println("Enter the first letter of the word: ");
            let1 = in.next().charAt(0);
            System.out.println("Enter the second letter of the word: ");
            let2 = in.next().charAt(0);
            System.out.println("Enter the third letter of the word: ");
            let3 = in.next().charAt(0);

            if(let1 != let2 && let2 != let3){
                System.out.println(let3 +" "+ let2 +" "+ let1);
            }
            else{
                diff = false;
            }
        }
    }

    /*
    *   ex 7.60
    *       true        false
    *   a)  a=1 , b =1  a=1, b =2
    *   b)  a = -1      a = 1
    * */

    /*
    *   ex 7.61
    *       true            false
    *   a)  x = 1           x = 4
    *   b) a=1 b=1 c=true   a=1 b=1 c=false
    *   c) a = 2 b = 2      a = 3 b = 4
    * */

    public static void ex762(){
        Scanner in = new Scanner(System.in);
        int guess;
        Random rnd = new Random();
        int num = 1 + rnd.nextInt(100);
        int numOfGuesses = 0;
        boolean found = false;
        while(!found){
            numOfGuesses++;
            System.out.println("Enter your guess: ");
            guess = in.nextInt();
            if(guess == num){
                System.out.println("Correct!! ");
                found = true;
            }
            else if(guess > num){
                System.out.println("Your guess is too big");
            }
            else{
                System.out.println("your guess is too small");
            }
        }
        System.out.println("It took you "+numOfGuesses+" guesses");
    }

    

}
