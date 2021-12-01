import java.util.Scanner;
public class Ex15_TEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(c>b && c>a){
            System.out.println("c e cel mai mare");
        }
        if(b>a && b>c){
            System.out.println("b e cel mai mare");
        }
        if(a>c && a>b){
            System.out.println("a e cel mai mare");
        }
    }
}
