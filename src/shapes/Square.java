package shapes;

public class Square{


    //    PROPERTIES
    private int side;

    //    CONSTRUCTORS
    //public class Square extends Rectangle {

    //}

    //    CUSTOM METHODS
    public static void getArea(int side) {
        System.out.println(side ^ 2);
    }

    public static void getPerimeter(int side) {
        System.out.println(4 * side);
    }
}
