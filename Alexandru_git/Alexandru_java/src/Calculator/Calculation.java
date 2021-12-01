package Calculator;

public class Calculation {
    public int plus(int x, int y) {
        return x + y;
    }
    public int minus(int x, int y) {
        return x - y;
    }

    public int inmultit(int x, int y) {
        return x * y;
    }

    public int impartire(int x, int y) {
        return x / y;
    }
    public void text(){
        System.out.println("Select operation.");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
    }
}