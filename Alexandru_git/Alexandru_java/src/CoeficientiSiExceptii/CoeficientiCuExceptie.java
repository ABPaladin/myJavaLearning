package CoeficientiSiExceptii;
import java.util.Scanner;
public class   CoeficientiCuExceptie {
    public static int codeficient (int number1, int number2){
        if(number2 == 0)
            throw  new ArithmeticException("Impartitorul/divizorul nu poate sa fie zero");

        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter to integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int rezultat = codeficient(number1,number2);
            System.out.println(number1+" / "+number2+" este"+ rezultat);
        }
        catch (ArithmeticException ex){
            System.out.println("Exceptie un integer "+
                    "nu poate fi impatit la zero.");
        }
        System.out.println("Executia continnua ...");
    }
}
