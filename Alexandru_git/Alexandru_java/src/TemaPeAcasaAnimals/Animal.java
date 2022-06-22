package TemaPeAcasaAnimals;

public class Animal {
    String food;
    String location;
    public void makeNoise(){
        System.out.println("Animal make sounds");
    }
    public void eat(){
        System.out.println("Food");
    }
    public void sleep(){
        System.out.println("hours");
    }
    public static void main(String[] args) {
        Caine dog = new Caine();
        Pisica cat = new Pisica();
        Cal horse = new Cal();
        Veterenar vet = new Veterenar().TreatAnimal();
        String[] animals = {"Caine", "Pisica", "Call"};
        System.out.println(animals);
        System.out.println(dog.food+" "+dog.location);
        System.out.println(cat.food+" "+cat.location);
        System.out.println(horse.food+" "+horse.location);
        System.out.println(vet.TreatAnimal());
    }
}
