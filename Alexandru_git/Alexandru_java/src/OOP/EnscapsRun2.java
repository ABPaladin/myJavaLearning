package OOP;

public class EnscapsRun2 {
    public static void main(String[] args){
        Encaps2 obj = new Encaps2();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: "+ obj.getEmpName());
        System.out.println("Employee SSN: "+ obj.getEmpSSN());
        System.out.println("Employee Age: "+ obj.getEmpAge());
    }
}