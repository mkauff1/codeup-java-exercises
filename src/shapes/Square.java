package shapes;

public class Square extends Rectangle{

    //    PROPERTIES

    //    CONSTRUCTORS
    public Square(int side){
        super(side, side);

    }

    //    CUSTOM METHODS
    public int getArea() {
        return (int) Math.pow(this.length, 2);
    }

    public int getPerimeter() {
        return (4 * this.length);
    }
}
