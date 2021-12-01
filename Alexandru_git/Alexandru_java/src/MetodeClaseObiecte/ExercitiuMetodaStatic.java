package MetodeClaseObiecte;

public class ExercitiuMetodaStatic {
    public static void metodaMeaStatica() {
        System.out.println("Sunte executat de o metoda statica.");
    }

    public static void main(String[] args) {
        int j = 5, v = 2, p = 1;
        int rezultat = AiciCreamMetStat.suma(j, v, p);
        System.out.println("Suma este egala cu " + rezultat);
    }
}
