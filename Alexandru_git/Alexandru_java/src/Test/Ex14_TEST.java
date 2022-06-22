public class Ex14_TEST {
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
                    if(i == 14){
                        break;
                    }
                    System.out.println(i+1);
                }
        for (int i = 0; i <20 ; i++) {
                    if(i == 14){
                        continue;
                    }
                    System.out.println(i+1);
        }
    }
}