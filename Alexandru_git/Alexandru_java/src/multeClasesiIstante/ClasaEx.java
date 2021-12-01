package multeClasesiIstante;

public class ClasaEx {
    public static void main(String[] args) {
        Clasa4 object = new Clasa4();

        object.objClasa3.objClasa2.objClasa1.number1 = 100;
        object.objClasa3.objClasa2.zarplatamuja=10000;
        object.obj2Casa3.obj2Casa2.obj2Casa1.number2 = 400;
        object.obj2Casa3.obj2Casa2.zarplatajeni=7000;
        System.out.println(object.objClasa3.objClasa2.objClasa1.number1 + " " + object.obj2Casa3.obj2Casa2.obj2Casa1.number2);
        System.out.println(object.objClasa3.objClasa2.zarplatamuja+" "+object.obj2Casa3.obj2Casa2.zarplatajeni);
    }
}
