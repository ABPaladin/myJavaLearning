package TemaPeAcasa;
public class Cal extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Calul face: Mi-Ha-Ha");
    }
    public void eat() {
        System.out.println(food="Calul maninca: Fan");
    }
    public void sleep(){
        System.out.println(location="Calul este la sat");
    }
}
