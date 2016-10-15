package chapter1.javaclassdesign.overloadedmethods;

/**
 * Created by dan on 10/15/16.
 */
public class NotOverloaded {
    /**
     * If the return type is different, they are not overloaded
     * even if the method names are the same
     * The following 2 methods are 2 individual methods that are not overloaded
     */
    double calcAvg(int a, double b){
        return (a + b)/2;
    }
    int calcAvg(int a, int b){
        return (a + b)/2;
    }

    /**
     * Methods are not overloaded if they only differ in access modifiers
     * The following are not overloaded methods
     */
    private double calcAverage(int a, int b) {
        return (a + b)/2;
    }
    protected double calcAverage(int a, double b) {
        return (a + b)/2;
    }

    /**
     * Methods can't be overloaded if their non access modifiers are different
     * The following are not overloaded methods
     */
    public synchronized double calculateAverage(int a, int b){
        return (a + b)/2;
    }
    public final double calculateAverage(double a, int b){
        return (a + b)/2;
    }
}
