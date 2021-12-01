public class Ex16_TEST {
    public static void main(String[] args) {
        byte[] mynumbers ={1,2,3,4};
        for (byte i : mynumbers) {
            System.out.println(i);
        }
        mynumbers[3] =5;
        System.out.println(mynumbers[3]);
        for (byte i : mynumbers) {
            System.out.println(i);}
    }
}
