package MetodeClaseObiecte;

public class seaBatle {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3};
        System.out.println("min = "+min(arr));
        System.out.println("max = "+max(arr));
    }
    public static int max(int[] arr) {
        int x = arr[0];
        for (int i = 0; i <arr.length; i++){
            if (x < arr[i]) x = arr[i];
        }
        return x;
    }
    public static int min(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (x > arr[i]) x = arr[i];
        }
        return x;
    }
}
