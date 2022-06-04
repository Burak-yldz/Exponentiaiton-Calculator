import java.util.Scanner;

public class Exponentiation {
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
            System.out.print("Please enter a first number : ");
            int a = input.nextInt();
            System.out.print("Please enter a second number : ");
            int b = input.nextInt();
            System.out.println("RESULT : " + power(a,b));

    }
}