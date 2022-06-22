package Test;

import java.util.Scanner;

public class Ex20_TEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if (a.equalsIgnoreCase("R")) {
            System.out.println("Rosu");
        } else if (a.equalsIgnoreCase("G")) {
            System.out.println("Galben");
        } else if (a.equalsIgnoreCase("V")) {
            System.out.println("Verde");
        } else {
            System.out.println("ERROR");
        }
    }
}
