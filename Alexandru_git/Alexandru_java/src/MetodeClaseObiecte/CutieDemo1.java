package MetodeClaseObiecte;

public class CutieDemo1 {
    public static void main(String[] args) {
        Cutie1 cutiaMea1 = new Cutie1(10,20,15);
        Cutie1 cutiaMea2 = new Cutie1(3,6,9);

        double vol;

        vol= cutiaMea1.volumul();
        System.out.println("Volumul este egal cu "+vol);
        vol = cutiaMea2.volumul();
        System.out.println("Volumul este egal cu "+vol);
    }
}
