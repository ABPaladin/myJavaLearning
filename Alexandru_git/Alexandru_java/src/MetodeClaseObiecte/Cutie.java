package MetodeClaseObiecte;

public class Cutie {
    double latime;
    double inaltime;
    double adancime;
    //Constructorul pentru Cutie
    Cutie(){
        System.out.println("Contrucia obiectului Cutie");
        latime = 10;
        inaltime = 10;
        adancime = 10;
    }
    //calculam si returneaza volumul cutiei
    double volumul(){
        return latime*inaltime*adancime;
    }
}
