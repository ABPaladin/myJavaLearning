package MetodeClaseObiecte;

public class CutieDemo {
    public static void main(String[] args) {
        //declaram alocam si initializam obiecte ale clasei Cutie
        Cutie cutieaMea1 = new Cutie();
        Cutie cutieaMea2 = new Cutie();
        double volum;
        //returnarea volumul primei cutii
        volum = cutieaMea1.volumul();
        System.out.println("Volumul primei cutie este "+volum);
        //volumul la a doua cutiei
        volum = cutieaMea2.volumul();
        System.out.println("Volumul la a doua cutie este "+volum);
    }
}