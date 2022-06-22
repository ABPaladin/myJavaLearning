package InvatamSQL;
enum Enums
{
    A,B,C;
    private Enums(){
        System.out.println(1);
    }
}
public class MainClass
{
    public static void main(String[] args) {
        Enums en = Enums.B;
    }
}
