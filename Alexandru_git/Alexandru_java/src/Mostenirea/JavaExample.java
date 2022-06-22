package Mostenirea;

public class JavaExample extends Teacher1{
    String mainSubject = "Physics";
    public static void main(String[] args) {
        JavaExample obj = new JavaExample();
        System.out.println(obj.getColeggeName());
        System.out.println(obj.getDesifnation());
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
