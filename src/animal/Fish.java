package animal;

public class Fish extends Animal{
    //needsAttention is a unique field to Fish
    private boolean glubs = true;
    private boolean isSaltWater;

    //add constructor to immediately set the super class field
    public Fish(String preferredClimate, boolean isSaltWater){
        super(preferredClimate);
        this.isSaltWater = isSaltWater;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public boolean isGlubs() {
        return glubs;
    }

    public void setGlubs(boolean glubs) {
        this.glubs = glubs;
    }

    @Override //Dont need the override
    public String getAnimalInfo() {
        return "Fish details: " + "\n" +
                "Preferred Climate: " + preferredClimate + "\n" +
                "Water Habitat: " + (isSaltWater ? "saltwater" : "freshwater") + "\n" +
                "GLUBS: " + glubs + "\n";
    }
}

