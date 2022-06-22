package Tablouri;

public class Exercitii_tablouri {
    public static void main(String[] args) {
        int myNumbers[][] = {{10, 20, 30, 40, 50}, {100, 200, 300, 400, 500}, {1000, 2000, 3000, 4000, 5000}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + " ");
            }
        }
    }
}