package chapter3.objectorienteddesignprinciples.isahasarelationship;

/**
 * Created by dan on 10/30/16.
 */
class Engine{}

class Statistics{
    static Engine engine;
}

class Car{
    Engine engine;
}

class PartsFactory{
    Object createEngine(){
        Engine engine = new Engine();
        return engine;
    }
}

class TestCar{
    boolean testEngine(Engine engine){
        return false;
    }
}

public class HasA {
    /**
     * Only class Car shares a HAS-A relationship with class Engine
     * Because class Car defines an instance variable of type Engine
     */
}
