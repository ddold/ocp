package chapter2.advancedclassdesign.anonymousinnerclass;

/**
 * Created by dan on 10/27/16.
 */
public interface Flyable {
    void fly();
}

/**
 * An interface can't be instantiated, so you can't use new keyword with an interface
 * bird refers to an object of an anon inner class which implements the interface Flyable
 */
class BirdSanctuary {
    Flyable bird = new Flyable() {
        @Override
        public void fly() {
            System.out.println("Flying high in the sky");
        }

        // variable bird can't access method hungry
        public void hungry() {
            System.out.println("eat");
        }
    };

    public static void main(String [] args){
        BirdSanctuary birdObj = new BirdSanctuary();
        birdObj.bird.fly();

        // Won't compile as bird can't access hungry
        //birdObj.bird.hungry();
    }
}
