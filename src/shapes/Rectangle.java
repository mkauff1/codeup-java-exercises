package shapes;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }

    //    PROPERTIES (Fields)
    protected int length;
    protected int width;

    //    CONSTRUCTORS
    public Rectangle(int lengthToSet, int widthToSet) {
        this.length = lengthToSet;
        this.width = widthToSet;
    }

    //    GETTERS AND SETTERS

    //    CUSTOM METHODS
    public int getArea() {
        return (this.length * this.width);
    }

    public int getPerimeter() {
        return ((2 * this.length) + (2 * this.width));
    }

}
