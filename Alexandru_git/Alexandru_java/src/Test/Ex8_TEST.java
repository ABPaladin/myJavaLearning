import java.time.Period;
import java.util.Scanner;
public class Ex8_TEST {
    public static void main(String[] args) {
        Scanner ora = new Scanner(System.in);
        int a = ora.nextInt();
            if(a<=6)
            System.out.println("Dimineata");
        else if (a<=12)
                System.out.println("Ziua");
        else if (a<=18)
                System.out.println("Seara");
        else System.out.println("Noapte");
        }
    }
