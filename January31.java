import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1041();
        ex1042();
    }

    private static void ex1042() {
        Scanner scan = new Scanner(System.in);
        int[] sratim = new int[6];
        int[][] codim = new int[6][99];
        int[] otakim = new int[6];
        while (true) {
            System.out.println("enter mhlaka");
            int mhlaka = scan.nextInt();
            if(mhlaka==0){
                break;
            }
            System.out.println("enter the code [1-99]: ");
            int code = scan.nextInt();
            if (codim[mhlaka-1][code-1] == 0 ){
                codim[mhlaka-1][code-1] = 1;
                sratim[mhlaka-1] += 1;
            }
            System.out.println("enter the otakim [1-9]: ");
            int otek = scan.nextInt();
            otakim[mhlaka-1] += otek;
        }
        int maxOtek = Math.max(otakim[2],Math.max(Math.max(Math.max(Math.max(otakim[0], otakim[3]), otakim[5]), otakim[4]), otakim[1]));
        int maxSratim = Math.max(sratim[2],Math.max(Math.max(Math.max(Math.max(sratim[0], sratim[3]), sratim[5]), sratim[4]), sratim[1]));
        int maxSratimPlayer = 0;
        for (int index = 0; index < sratim.length; index++) {
            if (sratim[index] == maxSratim) {
                maxSratimPlayer = index;
            }
        }
        int maxOtekPlayer = 0;
        for (int index = 0; index < otakim.length; index++) {
            if (otakim[index] == maxOtek) {
                maxOtekPlayer = index;
            }
        }
        System.out.println("the mhlaka with the most sratim is " + (maxSratimPlayer+1) + " and the mhlaka with the most otakim of sratim is " + (maxOtekPlayer+1));
    }    

    public static void ex1041(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of svavim: ");
        int svavim = scan.nextInt();
        int[] counter = new int [4];
        while (svavim!=0){
            for (int i =0; i<4; i++){
                System.out.println("enter the "+ (i+1) + " place");
                int res = scan.nextInt();
                if (i == 0){
                    counter[res-1] +=7;
                } else if (i == 1){
                    counter[res-1] +=3;
                } else if (i == 2){
                    counter[res-1] +=0;
                } else {
                    counter[res-1] -=4;
                }
            }
            svavim--;
        }
        int max = Math.max(counter[2],Math.max(Math.max(counter[0], counter[3]), counter[1]));
        int player = 0;
        for (int index = 0; index < counter.length; index++) {
            if (counter[index] == max) {
                player = index;
            }
        }
        System.out.println("The winner is"+ (player+1)+ "with" + max +"points");
    }
}
