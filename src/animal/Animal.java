package animal;

public abstract class Animal {

    // Typically, we do NOT add any main methods or static methods to the POJO

    //fields
    protected int numberOfLegs;
    protected String preferredClimate;

    //constructor(s)
    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }

    public Animal(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    public Animal (){
    }



    //properties
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    abstract String getAnimalInfo();
}
