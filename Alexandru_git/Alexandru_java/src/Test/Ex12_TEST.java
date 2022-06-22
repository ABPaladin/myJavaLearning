import java.util.Scanner;
public class Ex12_TEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        if(s<12){
            System.out.println("Copil");
        }
        else if (s<18){
            System.out.println("Adolescent");
        }
        else {
            System.out.println("Adult");
        }
    }
}
