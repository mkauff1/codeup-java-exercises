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

    public void makePassiveSound(){
        System.out.println("Meowwwww");
    }

    public void makeAggressiveSound(){
        System.out.println("Hisssssssss");
    }

    @Override
    public void makeHappySound() {
        System.out.println("Purrrrrrrrr");
    }

    @Override //Dont need the override
    public String getAnimalInfo() {
        return "Cat details: " + "\n" +
                "Number of Legs: " + numberOfLegs + "\n" +
                "Preferred Climate: " + preferredClimate + "\n" +
                "Cleans Itself: " + cleansItself + "\n";
    }
}
