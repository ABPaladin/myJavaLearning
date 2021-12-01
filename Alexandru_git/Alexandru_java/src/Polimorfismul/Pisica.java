package Polimorfismul;
public class Pisica extends Animal{
    @Override
    public void sounds(){
        System.out.println("Meau-meau");
    }

    public static void main(String[] args) {
        Animal obj =new Pisica();
        Animal obj1 = new Caine();
        obj1.sounds();
        obj.sounds();
    }
}
