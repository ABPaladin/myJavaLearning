package Polimorfismul;

public class PretToyota extends Masini{
    void suma(int a){
        System.out.println("Viteza:"+a);
    }
    void suma(int a, int b){
        System.out.println("Calitate si pret "+a+" "+b);
    }
    double suma(double a){
        System.out.println("dublu pretului: "+a);
        return a*a;
    }
}
