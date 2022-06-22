package MetodeClaseObiecte;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] numere= new int[10];
        for (int i = 0; i<numere.length; i++) {
            System.out.println("Introducem valoarea lui " + i );
            numere[i] = s.nextInt();


        }
        for (int i = 0; i<numere.length; i++){
            System.out.println("Valoarea lui " + i );
        }
    }
}
