package MetodeClaseObiecte;

public class Cutie3 {
    double latime;
    double inaltime;
    double adancime;
    //Constructorul pentru Cutie
    Cutie3(){
        System.out.println("Contrucia obiectului Cutie");
        latime = 2;
        inaltime = 40;
        adancime = 10;
    }
    //calculam si returneaza volumul cutiei
    double volumul(){
        return latime*inaltime*adancime;
    }
}
