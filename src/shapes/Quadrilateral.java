package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        //super();
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    void setLength(double length) {
    }

    public double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
    }

    protected abstract void getWidth(double width);

    protected abstract void getLength(double length);
}
