import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        //ex729();
        //ex730();
        //ex732();
        //ex743();
    }

    public static void ex729() {
        Scanner scan = new Scanner(System.in);
        char letter = 0;
        int countA = 0;
        int countB = 0;
        while (letter != '#') {
            System.out.print("Enter a letter [A || B] : ");
            letter = scan.next().charAt(0);
            if(letter == 'A') {
                countA++;
            }
            if(letter == 'B') {
                countA++;
            }
        }
        if(countA > countB) {
            System.out.println("Alon win!");
        } else {
            System.out.println("Alon lose!");
        }
    }

    public static void ex730(){
        Scanner scan = new Scanner(System.in);
        int num = 5;
        int countNemala = 0;
        int countLion = 0;
        int countMouse = 0;
        while (num != 0) {
            System.out.print("Enter a number [1 || 2 || 3] : ");
            num = scan.nextInt();
            if(num == 1) {
                countMouse++;
            }
            if(num == 2) {
                countLion++;
            }
            if(num == 3){
                countNemala++;
            }
        }
        double count2 = (double) countLion /(countNemala+countMouse);
        if((0.3 > count2)) {
            System.out.println("אתם בבעיה חמורה");
            System.out.println(count2);
        } else if( 0.31 < count2 && 0.71> count2) {
            System.out.println("אתם בבעיה לא חמורה");
            System.out.println(count2);
        } else if (count2 > 0.70){
            System.out.println("אתם בטוחים");
            System.out.println(count2);
        }
    }

    public static void ex732(){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int num1 = 0;
        int num2 = 0;
        while (true){
            System.out.println("Enter 2 numbers: ");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            count++;
            if ((num1 == 5 && num2 == 6) || (num1 == 6 && num2 == 5)){
                System.out.println("שש-בש");
                System.out.println(count);
                break;
            }
        }
    }

    /*ex7.38
     * a) 2, 120
     * b) 4
     * c) מטרת התוכנית להחזיר את המספר הקודם כפול המספר שהוכנס
     */

    public static void ex743(){
        int length;
        int winner = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = in.nextInt();
        while (true)
        {
            length = length / 2;
            if (length<1){
                break;
            }
            if (winner == 2){
                winner = 1;
            } else {
                winner = 2;
            }
        }
        System.out.println("The winner is player " + winner);
    }

    public static void ex747(){
        /*a
        for (int i = 1; i <= 20; i++) {
            System.out.print(i * 5 + " ");
        }
         */
        /*b
        for (int i = 1; i <= 50; i++) {
            System.out.print(i * 10 + " ");
        }
         */
        /*c
        int k = 1;
        while (k <= 20) {
            System.out.print(k * 5 + " ");
            k++;
        }
         */
    }

    /*ex7.49
     a) for
     b) for
     c) while
     d) while
     e) בסעיף ג מחפשים את האות הגדולה וסעיף ד את האות הקטנה
     */

    public static void ex739(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int n = scan.nextInt();
        int out = 2;

        while(n>=out){
            out = out *2;
        }
        System.out.println(out);
    }

    public static void ex745(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the starting num of bacteria ");
        int startingNum = scan.nextInt();

        System.out.println("Enter the limit ");
        int limit = scan.nextInt();

        while(startingNum < limit){
            startingNum = startingNum * 5;
        }

        System.out.println(startingNum);
    }

    public static void ex750(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of letters and in the end place * ");
        String list = scan.next();
        char highestChar = ' ';
        int index = 0;
        while(list.charAt(index) != '*'){
            if(highestChar < list.charAt(index) && (list.charAt(index) > 'A' && list.charAt(index)<= 'I')){
                highestChar = list.charAt(index);
            }
            index++;
        }
        System.out.println(highestChar);
    }
}
