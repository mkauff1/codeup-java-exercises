package Warmups;

public class RollingChair {

    public static void main(String[] args) {
        RollingChair rc = new RollingChair();
        rc.setNoOfWheels(5);
        rc.setHasArms(true);
        rc.setStyle("Mid Century Modern");

        rc.roll();
    }

//    PROPERTIES
    private int noOfWheels;
    private String style;
    private boolean hasArms;

//    CONSTRUCTORS
    public RollingChair() {
    }

    public RollingChair(int noOfWheels, String style, boolean hasArms) {
        this.noOfWheels = noOfWheels;
        this.style = style;
        this.hasArms = hasArms;
    }

//    GETTERS AND SETTERS
    public int getNoOfWheels() {
        return this.noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isHasArms() {
        return hasArms;
    }

    public void setHasArms(boolean hasArms) {
        this.hasArms = hasArms;
    }

//    CUSTOM METHODS
    public void roll() {
        System.out.println("Rollin rollin rollin");
    }
}