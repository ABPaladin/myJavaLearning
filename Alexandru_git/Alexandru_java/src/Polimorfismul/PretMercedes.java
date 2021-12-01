package Polimorfismul;

public class PretMercedes extends Masini{
    void suma1(int a){
        System.out.println("Viteza:"+a);
    }
    void suma1(int a, int b){
        System.out.println("Calitate si pret "+a+" "+b);
    }
    double suma1(double a){
        System.out.println("dublu pretului: "+a);
        return a*a;
    }
    public static void main(String[] args) {
        PretMercedes obj2 = new PretMercedes();
        PretToyota obiect = new PretToyota();
        Toyota obj = new Toyota();
        Mercedes obj1 = new Mercedes();
        double result;
        obiect.suma(60);
        obiect.suma(10,9);
        result= obiect.suma(5.5);
        System.out.println(result);

        double result1;
        obj2.suma1(120);
        obj2.suma1(10,8);
        result1= obj2.suma1(5.7);
        System.out.println(result1);
        obj.clacton();
        obj1.clacton();
    }
}
