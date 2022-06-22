package TemaPeAcasa;

public class Veterenar extends Animal{
    public static Veterenar TreatAnimal(){
        Caine animal1 = new Caine();
        Pisica animal2 = new Pisica();
        Cal animal3= new Cal();
        Animal animals = new Animal();
        System.out.println("La Veterenar au ajuns:"+animals);
        System.out.println(animal1.food);
        System.out.println(animal1.location);
        System.out.println(animal2.food);
        System.out.println(animal2.location);
        System.out.println(animal3.food);
        System.out.println(animal3.location);
        return null;
    }
}
