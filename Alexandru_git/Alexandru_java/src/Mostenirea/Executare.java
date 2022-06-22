package Mostenirea;

public class Executare {
    public static void main(String[] args) {
        System.out.println("Numele:");
        System.out.println("Email:");
        System.out.println("Doresti sa modifici mail?(Y/N)");
        System.out.println("Scrieti un email nou:");
        DateDeIntrare intrare = new DateDeIntrare();
        System.out.println("Numele:"+intrare.x);
        System.out.println("Email:"+intrare.y);
        System.out.println(" ");
        System.out.println("Doresti sa modifici mail?(Y/N)");
        System.out.println(intrare.z);
        if(intrare.z.equals("Y")){
            System.out.println("Scrieti un email nou:");
            System.out.println("Email nou: "+intrare.v);
        }
        else if(intrare.z.equals("N")){
            System.out.println("Terminare Program");
        }
        else {
            System.out.println("Error");
        }
    }
}
