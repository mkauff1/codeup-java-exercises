package shapes;

public class Square extends Quadrilateral{

    //    CONSTRUCTORS
    public Square(double side){
        super(side, side);

    }

    //    CUSTOM METHODS
    @Override
    public double getArea() {
        return (int) Math.pow(super.length, 2);
    }
    @Override
    public double getPerimeter() {
        return (4 * super.length);
    }

    @Override
    protected void setLength(double length) {
        this.length = length;
    }

    @Override
    protected void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected void getWidth(double width) {

    }

    @Override
    protected void getLength(double length) {
    }
}
