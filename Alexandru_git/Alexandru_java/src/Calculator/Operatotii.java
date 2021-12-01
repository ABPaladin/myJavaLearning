package Calculator;
import java.util.Scanner;
public class Operatotii extends numbers{
    Scanner in = new Scanner(System.in);
    char op = in.next().charAt(0);
    public float operatori(char op) {
        switch (this.op) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + num1 + num2);
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + num1 + -num2);
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
            default:
                System.out.println("Error");
        }
        return 0;
    }
}

