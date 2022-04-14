package shapes;

public class Rectangle {

    public static void main(String[] args) {
        //Rectangle box1 = new Rectangle();
        //Rectangle box2 = new Square();

    }

    //    PROPERTIES
    private int length;
    private int width;

    //    CONSTRUCTORS
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    //    GETTERS AND SETTERS
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //    CUSTOM METHODS
    public static int getArea(int length, int width) {
        return (length * width);
    }

    public static int getPerimeter(int length, int width) {
        return ((2 * width) + (2 * length));
    }

}
