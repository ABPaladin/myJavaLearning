package TemaPeAcasa;
public class Caine extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Cainele face: gaf-gaf");
    }
    public void eat() {
        System.out.println(food="Cainele maninca: Carne de porc");
    }
    public void sleep(){
        System.out.println(location="Cainele este la sat");
    }
}
