package animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {

    public static void main(String[] args) throws Exception{
        // oof - can not make a new instance of Animal itself
        // Animal is abstract!
        // Animal animal = new Animal()
        doAnimalThings();
    }

    private static void doAnimalThings() {
        List<Animal> animals = getAnimals();

        for(Animal animal : animals){
            System.out.println(animal.getAnimalInfo());
            //System.out.println("\n");

            try{
                animal.makePassiveSound();
                animal.makeHappySound();
                animal.makeAggressiveSound();
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
//        System.out.println(animal2.getAnimalInfo());
//        animal2.makeAggressiveSound();
//
//        System.out.println(animal3.getAnimalInfo());
//        animal3.makeHappySound();
    }

    private static List<Animal> getAnimals() {
        int numLegs = 4;
        String prefClimate = "In the house";

        Animal animal1 = new Dog(numLegs, prefClimate);
        Animal animal2 = new Cat(4, prefClimate);
        Animal animal3= new Fish("Sub-Tropical", true);

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        return animals;
    }
}
