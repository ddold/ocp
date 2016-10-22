package chapter2.advancedclassdesign.abstractclass;

/**
 * Created by dan on 10/22/16.
 */
abstract class Animal {
    /**
     * Abstract classes can define instance variables
     * and a constructor
     */
    protected String food;
    protected double avgLife;

    Animal(String food, double avgLife){
        this.food = food;
        this.avgLife = avgLife;
    }

    // abstract method stops after parenthesis. No {} needed
    abstract void eat();

    void live(){
        System.out.println("Natural habitat : forest");
    }
}

class Lion extends Animal {
    /**
     * Because there is no default constructor in
     * class Animal, every class that extends Animal
     * must define a constructor
     */
    Lion(String food, double avgLife){
        super(food, avgLife);
    }
    void eat(){
        System.out.println("Lion-hunt " + food);
    }
    /**
     * Only method eat() needs to be used from class Animal
     * method live() does not need to be
     */
}

class Elephant extends Animal {
    Elephant(String food, double avgLife){
        super(food, avgLife);
    }
    void eat(){
        System.out.println("Elephant-eat " + food);
    }

    void moveTrunk() {
        System.out.println("Elephant-method moveTrunk");
    }
}

public class GeoAnimals {
    Animal[] animals = new Animal[2];

    GeoAnimals(){
        animals[0] = new Lion("Antelope", 20);
        animals[1] = new Elephant("Bananas", 60);
    }

    void flashcards() {
        for(Animal animal: animals){
            animal.eat();
            animal.live();
        }
    }

    public static void main(String [] args){
        GeoAnimals geo = new GeoAnimals();
        geo.flashcards();
    }
}
