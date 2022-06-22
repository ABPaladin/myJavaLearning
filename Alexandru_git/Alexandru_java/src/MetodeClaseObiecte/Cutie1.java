package MetodeClaseObiecte;

public class Cutie1 {
    double latime;
    double inaltime;
    double adancime;
        Cutie1(double l, double i, double a){
        latime =l;
        inaltime =i;
        adancime =a;
    }
    //calculam si returneaza volumul cutiei
    double volumul(){
        return latime*inaltime*adancime;
    }
}
