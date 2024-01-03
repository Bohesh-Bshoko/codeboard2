import java.util.Random;
import java.util.Scanner;

public class loops101 {
    public static void ex45(){
        Scanner scan = new Scanner(System.in);
        int sum =0;

        for (int i = 0; i<20; i++){
            System.out.println("enter numebr "+i+" ");
            sum += scan.nextInt();
        }
        System.out.println("the sum is "+sum);
    }
    public static void ex76(){
        final int LIMIT = 50;
        int length;
        double num;
        double sum = 0; //צובר
        double average; //ממוצע
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of input list: ");
        length = in.nextInt();

        for (int i = 1; i <= length; i++)
        {
            System.out.print("Enter a number: ");
            num = in.nextDouble();

            if (num > LIMIT) {
                sum +=num;
            }
        }// for
        average = sum / length;
        System.out.println("Average is " + average);

    }

    /*
    * ex 7.7
    * System.out.println(length - counterLarge)
    * */

    /*
    * ex 7.8
    * a) true
    * b) true
    * c) true
    * d) false
    * e) true
    *
    * */

    public static void ex79(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter list size ");
        int listSize = scan.nextInt();

        int countCapitalLetter = 0;
        for(int i =0; i < listSize; i++){
            System.out.println("enter a Letter");
            if(scan.next().charAt(0) >= 'A' && scan.next().charAt(0) <= 'Z')
                countCapitalLetter++;
        }
        System.out.println("the counter of capital letters is: "+ countCapitalLetter);
    }
    public static void ex713(){
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int evenCounter = 0;
        for(int i =0; i<num;i++){
            if( (10+rnd.nextInt(41)) %2 == 0)
                evenCounter++;
        }
        System.out.println(evenCounter);
    }
    public static void ex714(){
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for(int i =0; i<10;i++){
            int num = 100+rnd.nextInt(900);
            if( num %2 == 1)
                sum += num;
        }
        System.out.println(sum);
    }

    public static void ex717() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void ex718(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;

        for (int i = 1; i<=n; i++){
            sum += (double)1/n;
        }
        System.out.println(sum);
    }

    public static void ex724() {
        int max = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 40; i++) {
            System.out.print("Enter grade: ");
            int grade = scan.nextInt();
            if (grade > max && grade < 55) {
                max = grade;
            }
        }

        System.out.println("Maximum grade entered: " + max);
    }

    public static void ex725(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numberOfPlayers = scanner.nextInt();

        int maxPoints = 0;
        int maxPointsPlayer = 0;

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.print("Enter player number (shirt number) for player " + i + ": ");
            int playerNumber = scanner.nextInt();
            System.out.print("Enter the number of points scored this season for player " + i + ": ");
            int playerPoints = scanner.nextInt();

            if (playerPoints > maxPoints) {
                maxPoints = playerPoints;
                maxPointsPlayer = playerNumber;
            }
        }

        if (maxPointsPlayer != 0) {
            System.out.println("Player number with the most points this season: " + maxPointsPlayer);
            System.out.println("Total points: " + maxPoints);
        } else {
            System.out.println("No player data provided.");
        }
    }
}
