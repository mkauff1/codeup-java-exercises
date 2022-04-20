package animal;

public class AnimalApp {

    public static void main(String[] args) {
        // oof - can not make a new instance of Animal itself
        // Animal is abstract!
        // Animal animal = new Animal()

        int numLegs = 4;
        String prefClimate = "In the house";

        Animal animal1 = new Dog(numLegs, prefClimate);
        System.out.println(animal1.getAnimalInfo());

        Animal animal2 = new Cat(4, prefClimate);
        System.out.println(animal2.getAnimalInfo());

        Animal animal3= new Fish("Sub-Tropical", true);
        System.out.println(animal3.getAnimalInfo());
    }
}
