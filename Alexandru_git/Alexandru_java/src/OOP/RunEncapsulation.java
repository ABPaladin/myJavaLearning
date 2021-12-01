package OOP;

public class RunEncapsulation {
    public static void main(String[] args) {
        Encapsulation encap = new Encapsulation();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");
        System.out.println("Name: "+ encap.getName() + " Age : " + encap.getAge()+" Idnum: "+encap.getIdNume());
    }
}
