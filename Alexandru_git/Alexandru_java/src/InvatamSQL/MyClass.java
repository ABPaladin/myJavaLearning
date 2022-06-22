package InvatamSQL;
 class Message{
        //Mesajul ce trebuie printat
        String text = "Republica Moldova";
    }
    class MySuperClass{
        Message mesaj = new Message();
    }
    class Myclass extends MySuperClass{
        public static void main(String[] args) {
            Myclass obiect = new Myclass();
            obiect.printeza();
        }
        public void printeza(){
            System.out.println(mesaj.text);
        }
    }
