package animal;

public class Dog extends Animal{
    //needsAttention is a unique field to Dog
    private boolean needsAttention = true;

    //add constructor to immediately set the super class field
    public Dog(int numberOfLegs, String preferredClimate){
        super(numberOfLegs, preferredClimate);
    }

    public boolean isNeedsAttention() {
        return needsAttention;
    }

    public void setNeedsAttention(boolean needsAttention) {
        this.needsAttention = needsAttention;
    }

    public void makePassiveSound(){
        System.out.println("Zzzzzzzz");
    }

    public void makeAggressiveSound(){
        System.out.println("BARK!");
    }

    @Override
    public void makeHappySound() {
        System.out.println("BORK BORK");
    }

    @Override //Dont need the override
    public String getAnimalInfo() {
        return "Dog details: " + "\n" +
                "Number of Legs: " + numberOfLegs + "\n" +
                "Preferred Climate: " + preferredClimate + "\n" +
                "Needs Attention: " + needsAttention + "\n";
    }
}
