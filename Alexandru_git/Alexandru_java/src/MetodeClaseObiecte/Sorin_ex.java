package MetodeClaseObiecte;

import java.util.Scanner;
public class Sorin_ex {
    public static void main(String[] args) {
        alexandru();
    }
    public static int alexandru() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i<b; i++) {
            System.out.print(i+" ");
        }
        return 0;
    }
}
