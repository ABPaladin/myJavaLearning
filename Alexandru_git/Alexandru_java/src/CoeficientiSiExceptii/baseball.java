package CoeficientiSiExceptii;
import java.util.Scanner;
public class baseball {
    public static int mingea (int greutate, int viteza){
    if(viteza == 0)
            throw  new ArithmeticException("Greutatea/viteza nu poate sa fie zero");

        return greutate/viteza;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce datele mingei:");
        int greutate = input.nextInt();
        int viteza = input.nextInt();

        try {
            int rezultat = mingea(greutate,viteza);
            System.out.println(greutate+" / "+viteza+" este"+ rezultat);
        }
        catch (ArithmeticException ex){
            System.out.println("Greutate si Viteza"+ "nu poate fi impatit la zero.");
        }
        System.out.println("Zborul mingi continnua ...");
    }

}
