import java.util.Scanner;
public class Ex7_TEST {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        int a = nr.nextInt();
        if (a % 2 == 0) {
            System.out.println("Număr par");
        } else {
            System.out.println("Număr impar");
        }
    }
}
