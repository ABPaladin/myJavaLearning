package Tablouri;
import java.util.Arrays;
import java.util.Collections;
public class ArrayEx {
public static void main(String[] args) {
    int[] list  = {1,2,3,4,5,6,7};
    int index =-1;
    int ind =-1;
    for (int i = 0; (i < list.length) && (index == -1); i++) {
        if (list[i] == 1) {
            index = i;
        }
    }
    for (int i = 0; (i < list.length) && (ind == -1); i++) {
        if (list[i] == 7) {
            ind = i;
        }
    }
    int min = Arrays.stream(list).min().getAsInt();
    int max = Arrays.stream(list).max().getAsInt();
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
    System.out.println("First element index:"+index);
    System.out.println("Last element index:"+ind);
    System.out.println("List have:"+list.length+" elements");
}
}
