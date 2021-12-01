package JavaExerciti;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int primul = input.nextInt();
        System.out.println("Introduceti doilea numar:");
        int doilea = input.nextInt();
        System.out.println("Introduceti treilea numar:");
        int treilea = input.nextInt();
        System.out.println("Rezultat:"+smallest(primul, doilea, treilea)+"\n" );
    }
    public static double smallest(double primul, double doilea, double treilea)
    {
        return Math.min(Math.min(primul, doilea), treilea);
    }
}

