package MetodeClaseObiecte;

public class masini {
    public static void main(String[] args) {
        Vehicle masina = new Vehicle();
        masina.passengers = 2;
        masina.wheels = 4;
        masina.maxspeed = 130;
        masina.burnup = 30;

        //alt exemplu al clasei Vehicle
        Vehicle autobuz = new Vehicle();
        autobuz.passengers = 45;
        autobuz.wheels = 4;
        autobuz.maxspeed = 100;
        autobuz.burnup = 25;

        //calcularea traseului parcurs in 0.5 ore
        double time = 0.5;

        System.out.println("Automobilul cu "+masina.passengers + "pasageri");
        autobuz.distance(time);
    }
}
