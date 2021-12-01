import java.util.Scanner;
public class Ex9_TEST {
    public static void main(String[] args) {
        Scanner luna = new Scanner(System.in);
        String season;
        int month = luna.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Nu a fost gasita nici o asociere.";
        }
        System.out.println("Luna " + month + " este in " + season + ".");
    }
}

