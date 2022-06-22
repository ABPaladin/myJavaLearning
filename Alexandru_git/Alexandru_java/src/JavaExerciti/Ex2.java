package JavaExerciti;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numar:");
        int zile = input.nextInt();
        if (zile==1){
                System.out.println("Rezultat:Luni");
        }
        else if (zile==2){
            System.out.println("Rezultat:Marti");
        }
        else if (zile==3){
            System.out.println("Rezultat:Mercuri");
        }
        else if (zile==4){
            System.out.println("Rezultat:Joi");
        }
        else if (zile==5){
            System.out.println("Rezultat:Vineri");
        }
        else if (zile==6){
            System.out.println("Rezultat:Sambata");
        }
        else if (zile==7){
            System.out.println("Rezultat:Duminica");
        }
        else {
            System.out.println("Error");
        }
    }
}
