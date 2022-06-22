package Tablouri;

import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        /*
        int multiArr[][] = new int[4][5];

        int i,j,k = 0;

        for (i = 0; i < 4 ; i++)
            for (j=0; j<5; j++){
                multiArr[i][j] = k;
                k++;
            }
            for (i = 0; i < 4 ; i++){
                for (j = 0;j < 5 ; j++)
                    System.out.println(multiArr[i][j] + " ");
                System.out.println();
            }*/
          /*
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i*10;
        }
            for (int i = 0; i < numbers.length ; i++) {
                System.out.println(numbers[i]);
        }*/

        /*String[] cuvinte = new  String[3];
        System.out.println(cuvinte[0]+" "+cuvinte[1]+" "+cuvinte[2]);
        cuvinte[0] = "One";
        cuvinte[1] = "Two";
        cuvinte[2] = "Three";
        String x = cuvinte[0] +" "+cuvinte[1]+" "+cuvinte[2];
        System.out.println(x);
        for (int i = 0; i <cuvinte.length ; i++) {
            System.out.println(cuvinte[i]);
        }
        for(String x : cuvinte){
            System.out.println(x);
        String[]
        }*/
        int[ ] aryNums = { 24, 6, 47, 35, 2, 14 };

        int i;
        int arrayTotal = 0;
        int media = 0;
        int max = 0;

        for (i = 0; i < aryNums.length ; i++) {
            arrayTotal = arrayTotal + aryNums[ i ];
        }
        media = arrayTotal / aryNums.length;
        System.out.println("total:"+ media);
        Arrays.sort(aryNums);
        System.out.println(aryNums[aryNums.length-1]);
        }
    }