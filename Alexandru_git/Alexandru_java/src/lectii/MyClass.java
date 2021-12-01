package lectii;

public class MyClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.topLeft.x = 0;
        rect.topLeft.y = 0;
        rect.bottemRight.x = 100;
        rect.bottemRight.y = 100;
        System.out.println(rect.topLeft.x + " " + rect.topLeft.y + " " + rect.bottemRight.y);


        Point p = new Point();
        Point obiectulMeu = new Point();

        p.x = 10;
        p.y = 20;
        System.out.println(p.x + " " + p.y + " ");

        obiectulMeu.x = 12;
        obiectulMeu.y = 10;
        System.out.println(obiectulMeu.x + " " + obiectulMeu.y);

    }
}
