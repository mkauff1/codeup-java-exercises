package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//    }

    //    PROPERTIES (Fields)
//    protected int length;
//    protected int width;

    //    CONSTRUCTORS
    public Rectangle(double lengthToSet, double widthToSet) {
        super(lengthToSet, widthToSet);
//        this.length = lengthToSet;
//        this.width = widthToSet;
    }

    // GETTERS AND SETTERS
    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected void getWidth(double width) {

    }

    @Override
    protected void getLength(double length) {

    }

    //    CUSTOM METHODS
    public double getArea() {
        return (this.length * this.width);
    }

    public double getPerimeter() {
        return ((2 * this.length) + (2 * this.width));
    }

}
