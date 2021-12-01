package CoeficientiSiExceptii;
import java.util.*;
public class InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Introduceti un numar intrg:");
                int number = input.nextInt();
                System.out.println("Numarul intrudus ete " + number);
                continueInput = false;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Incercati din nou. (" + "Introducuere incorecta: este necesar" + " un numar intreg)");
                input.nextLine();
            }
        }while (continueInput) ;
    }
}