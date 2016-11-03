package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/3/16.
 *
 * Type parameter can extend a class and multiple interfaces at once
 * Type parameter extends interfaces, not implements
 * Type parameter can extend final classes
 */
abstract class Gift{
    abstract double getWeight();
}

class Toy extends Gift {
    @Override
    double getWeight() {
        return 1.1;
    }
}

class Game extends Gift {
    @Override
    double getWeight() {
        return 2.2;
    }
}

class PostParcel<T extends Gift> {
    private T t;
    public void set(T t){
        this.t = t;
    }
    public void shipParcel() {
        // to run t.getWeight() generic type has to extend Gift
        if(t.getWeight() > 20){
            System.out.println("Use ABC shipping");
        } else {
            System.out.println("Use XYZ shipping");
        }
    }
}

interface Wrappable{}
interface Exchangeable{}

public class BoundedTypeParams<T extends Gift, Wrappable, Exchangeable> {
    // can extend 1 class and multiple interfaces simultaneously
}


