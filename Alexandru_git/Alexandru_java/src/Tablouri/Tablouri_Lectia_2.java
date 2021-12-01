package Tablouri;

public class Tablouri_Lectia_2 {
    public static void main(String[] args) {
        String[][] animals = new String[3][5];
        animals[1][2] = new String("Tiger");
        System.out.println(animals);
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                System.out.println(animals[i][j]);
            }
            int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        }
    }
}
