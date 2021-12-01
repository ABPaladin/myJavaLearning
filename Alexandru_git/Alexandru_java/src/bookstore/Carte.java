package bookstore;

public class Carte {
    String nume;
    String autor;
    Tip tipulCartii;
    int anul;
    Carte(String nume,String autor, int anul,Tip tipulCartii){
        this.nume=nume;
        this.autor=autor;
        this.anul=anul;
        this.tipulCartii=tipulCartii;
    }
}
enum Tip{
    DRAMA,
    COMEDIE,
    ACTIUNE,
    ROMAN
}
