package MetodeClaseObiecte;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a word start or stop");
        String startType = input.nextLine();
        System.out.println("the thing you chose was " + startType);
//        String stopType = input.nextLine();
//        System.out.println("the thing you chose was " + stopType);
        if(input.equals(startType))
            for (int i = 50; i > 45; i++) {
                System.out.println();
            }
    }
}