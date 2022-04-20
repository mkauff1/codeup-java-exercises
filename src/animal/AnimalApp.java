package animal;

public class AnimalApp {

    public static void main(String[] args) {
        // oof - can not make a new instance of Animal itself
        // Animal is abstract!
        // Animal animal = new Animal()

        int numLegs = 4;
        String prefClimate = "In the house";
        Animal animal = new Dog(numLegs, prefClimate);

        System.out.println(animal.getAnimalInfo());
    }
}
