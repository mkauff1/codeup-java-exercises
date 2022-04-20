package animal;

public class Cat extends Animal{
    //needsAttention is a unique field to Cat
    private boolean cleansItself = true;

    //add constructor to immediately set the super class field
    public Cat(int numberOfLegs, String preferredClimate){
        super(numberOfLegs, preferredClimate);
    }

    public boolean isCleansItself() {
        return cleansItself;
    }

    public void setCleansItself(boolean cleansItself) {
        this.cleansItself = cleansItself;
    }

    @Override //Dont need the override
    public String getAnimalInfo() {
        return "Cat details: " + "\n" +
                "Number of Legs: " + numberOfLegs + "\n" +
                "Preferred Climate: " + preferredClimate + "\n" +
                "Cleans Itself: " + cleansItself + "\n";
    }
}
