package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Measurable myShape1 = new Rectangle(5,4);
        Measurable myShape2 = new Square(5);

        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
