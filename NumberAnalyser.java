import java.util.Scanner;

public class NumberAnalyser {
    public static void main(String[] args) {
        System.out.println("ENTER THE CHOICE");
        System.out.println("COUNT FACTORS : 1");
        System.out.println("SUM OF FACTORS : 2");
        System.out.println("IS PERFECT : 3");
        System.out.println("POWER : 4");
        System.out.println("GCD : 5");
        System.out.println("LCM : 6");
        System.out.println("STRONG : 7");
        System.out.println("AUTOMORPHIC : 8");
        System.out.println("NEON : 9");
        Scanner scm = new Scanner(System.in);
        int input = scm.nextInt();
        int number = 0;

        switch (input) {
            case 1:
                System.out.println("ENTER THE NUMBER");
                number = scm.nextInt();
                System.out.println(counting(number));
                break;

            case 2:
                System.out.println("ENTER THE NUMBER");
                number = scm.nextInt();
                System.out.println(sumOfFactor(number));
                break;

            case 3:
                System.out.println("ENTER THE NUMBER");
                number = scm.nextInt();
                System.out.println(perfect(number));
                break;

            case 4:
                System.out.println("ENTER THE BASE");
                number = scm.nextInt();
                System.out.println("ENTER THE POWER");
                int power = scm.nextInt();
                System.out.println(pow(number, power));
                break;

            case 5:
                System.out.println("ENTER THE NUMBER 1");
                number = scm.nextInt();
                System.out.println("ENTER THE NUMBER 2");
                int numberb = scm.nextInt();
                System.out.println(gc(number, numberb));
                break;

            case 6:
                System.out.println("ENTER THE NUMBER 1");
                number = scm.nextInt();
                System.out.println("ENTER THE NUMBER 2");
                int numberc = scm.nextInt();
                System.out.println(lc(number, numberc));
                break;

            case 7:
                System.out.println("ENTER THE NUMBER");
                number = scm.nextInt();
                System.out.println(str(number));
                break;
            
            case 8:
                System.out.println("ENTER THE NUMBER");
                number = scm.nextInt();
                System.out.println(auto(number));
                break;

            case 9:
                System.out.println("ENTER THE NUMBER");
                number = scm.nextInt();
                System.out.println(neo(number));
                break;
            default:
                break;
        }
    }

    // COUNT FACTORS
    public static int counting(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    // SUM OF FACTORS
    public static int sumOfFactor(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // PERFECT NUMBER
    public static boolean perfect(int n){
        int sum = 0;
        if(n < 1) return false;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return  sum == n;
    }

    // POWER
    public static int pow(int base , int expo){
        int result = 1; // it set as 1 because if it 0 , then 0 * base = 0
        for (int i = 1; i <= expo; i++) {
            result = result * base;
        }
        return result;
    }

    // GCD
    public static int gc(int a , int b){
        int gcd = 0;
        int n = a < b ? a : b;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return  gcd;
    }

    // LCM
    public static int lc(int a , int b){
        int gcd = 0;
        int n = a < b ? a : b;
        for (int i = 1; i <= n ; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        int leastCommonMultiple = (a * b) / gcd;
        return  leastCommonMultiple;
    }

    // STRONG NUMBER
    public static boolean str(int n){
        int sum = 0;
        int num = n;
        while (n > 0) {
            int temp = n % 10;
            int fact = 1;
            for (int i = 1; i <= temp; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        return sum == num;
    }

    // AUTOMORPHIC
    public static boolean auto(int n){
        int square = n * n;
        //int temp = n;
        while (n > 0) {
            if ( n % 10 != square % 10 ) {
            return false;
            }
            n = n / 10;
            square = square / 10;
        }
        return true;
    }

    // NEON NUMBER
    public static boolean neo(int n){
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int temp = square % 10;
            sum = sum + temp;
            square = square / 10;
        }
        return sum == n;
    }
}
