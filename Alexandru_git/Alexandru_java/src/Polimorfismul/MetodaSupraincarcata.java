package Polimorfismul;

public class MetodaSupraincarcata {
    public static void main(String[] args) {
        Supraincarcare obiect = new Supraincarcare();
        double result;
        obiect.demo(10);
        obiect.demo(10,20);
        result= obiect.demo(5.5);
        System.out.println("5.5*5.5= "+result);
    }
}
