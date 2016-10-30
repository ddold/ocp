package chapter3.objectorienteddesignprinciples.interfaces;

/**
 * Created by dan on 10/30/16.
 *
 * Top level interface access modifiers can only be public or default
 * private and protected will fail to compile
 * Same goes for variables and methods
 *
 * The only non access modifiers allowed to use for top level interfaces are
 * - abstract
 * - strictfp
 *
 * If you use a nested interface you can also use the static modifier
 */
public interface Runner {
    int speed();
    int time();
    double distance = 70;

    /**
     * int speed() is implicitly declared as public and abstract
     * double distance is implicitly declared as public, static and final
     * so that is why it has to be initialized
     */
}

interface Running {
    int speed();
    int time(int start);
}

// Multiple interfaces can be implemented in a class, separated by a comma
class Jogger implements Runner, Running {
    /**
     * Have to implement interface to a class to use it
     * Must override all the methods from the interface so class can compile
     *
     * Both implemented interfaces define same method signature
     * The class won't fail to compile
     * If the return value in one of the interface is different, the class won't compile
     */
    @Override
    public int speed() {
        return 0;
    }

    /**
     * Will compile successfully as both methods overload correctly
     */
    @Override
    public int time(int start) {
        return 0;
    }

    @Override
    public int time() {
        return 0;
    }
}