package Tablouri;

import java.util.Scanner;
public class tablou_numeric {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        int[] tablouNumeric = new int[10];
        for(int i =0;i<tablouNumeric.length;i++){
            System.out.println("Introduceti valoarea pentru teblouNumeric["+i+"]");
            tablouNumeric[i] = tastatura.nextInt();
        }

        int largest = tablouNumeric[0];
        int smallest = tablouNumeric[0];

        for(int i = 0;i<tablouNumeric.length;i++){
            if(tablouNumeric[i]>largest)
                largest = tablouNumeric[i];
            if(tablouNumeric[i]<smallest)
                smallest = tablouNumeric[i];
        }

        System.out.println("Cea mai mica valoare a tablouluiNumeric este "+smallest+".");
        System.out.println("Cea mai mare valoare a tablouluiNumeric este "+largest+".");
    }
}
