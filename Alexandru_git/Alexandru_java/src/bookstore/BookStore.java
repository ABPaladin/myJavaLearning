package bookstore;
import java.util.Scanner;
public class BookStore {
    public static void main(String[] args) {

        Carte c1 = new Carte("Crima si pedeapsa","Dostoevski",1866,Tip.ROMAN);
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti tipul cartii dupa numar:");
        int id = input.nextInt();
        Tip tip =Tip.values()[id];
        System.out.println("A fost ales tipul: "+Tip.ROMAN);
        if(c1.tipulCartii == tip){
            System.out.println("Cartea "+c1.nume+" corespunde tipul ales.");
        }
    }
}
