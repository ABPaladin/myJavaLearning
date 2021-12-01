package MetodeClaseObiecte;

public class CalculOre {
    public static void main(String[] args) {
        calculareBrut(13, 14);}
    public static void calculareBrut(double ore, double rata) {
        double brut;
        brut = ore * rata;
        System.out.println(ore + " ore cu achitarea in dolari " + rata + " pe ora iese $" + brut);}
}
