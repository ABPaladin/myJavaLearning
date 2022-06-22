package MetodeClaseObiecte;

import java.util.Scanner;
public class IntrareaSiAlegerea {
    public static IntrareaSiAlegerea alegerea(){
        System.out.println("Intrare in program");
        Scanner in = new Scanner(System.in);
        System.out.println("Doriti sa continuati?(Y/N)");
        String input = in.nextLine();
        if(input.equalsIgnoreCase("y")){
            aFostImportantaClasa1 intr = new aFostImportantaClasa1().d().literaA().literaB().literaC();
            aFostImportantaClasa2 introd = new aFostImportantaClasa2().g().literaD().literaE().literaF();
            aFostimportantClasa3 chem = new aFostimportantClasa3().a();
            aFostimportantClasa4 chema = new aFostimportantClasa4().b();
        }
        else{
            System.out.println("Clasele primare sunt suplinite.");
            System.out.println("Iesire din program");
        }
        return null;
    }
}
