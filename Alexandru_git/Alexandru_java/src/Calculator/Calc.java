package Calculator;

public class Calc extends Operatotii {
    public static void main(String[] args) {
        System.out.println ("numarul1 si numarul2:");
        numbers o = new numbers();
        System.out.println(o);
        System.out.println("Alegeti operatia '+','-','*','/':");
        Operatotii ope = new Operatotii();
        System.out.println(ope.operatori(ope.op));
    }
}

