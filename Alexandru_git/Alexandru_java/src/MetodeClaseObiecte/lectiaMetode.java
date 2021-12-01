package MetodeClaseObiecte;

class Vehicle {

    int passengers, wheels, maxspeed, burnup;

    //declaram metoda, care calculeaza distanta parcursa
     // metoda primeste parametrul interval, care steaza timpil
     // si nu returneaza nici o valoare (void)
     void distance(double interval){
         double value = maxspeed * interval;
         System.out.println(":va parcurege o distanta egala cu "+ value +" km.h" );
     } //distance(double interval)
}       //Vehicle class



