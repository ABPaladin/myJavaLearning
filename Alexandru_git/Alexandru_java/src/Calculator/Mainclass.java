package Calculator;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Calculation ca = new Calculation();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter choice(1/2/3/4):  ");
        int choice = scan.nextInt();
        if (choice ('1','2','3','4')){
        System.out.println("Enter first number:");
        float num1 = scan.nextInt();
        System.out.println("Enter second number:");
        float num2 = scan.nextInt();
        }
    }

    private static boolean choice(char c, char c1, char c2, char c3) {
        return false;
    }
}
