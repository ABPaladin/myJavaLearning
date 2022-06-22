package Polimorfismul;

import java.util.Scanner;

public class Phone {
    static Scanner in = new Scanner(System.in);

    static int number;
    String model;
    float weight;

    Phone obj = new Phone();
    Phone obj1 = new Phone();
    Phone obj2 = new Phone();

    public static void receiveCall(String nume) {
        System.out.println(nume + " is calling");
        getNumber();
    }

    private static void getNumber() {
        System.out.println(number = 69677787);
    }
    public static String Constructor (int number, String model, float weight) {
        Constructor2(69677787, "Samsung");
        receiveCall("Alexandru");
        return model;
    }
    public static Object sendMesage(int number, String mesaj){
        System.out.println(number);
        System.out.println(mesaj);
        return null;
    }

    public static void Constructor2(int number, String model) {
    }
    public static void Constructor3() {
    }
}
