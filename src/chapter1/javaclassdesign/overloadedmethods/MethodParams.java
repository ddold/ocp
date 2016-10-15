package chapter1.javaclassdesign.overloadedmethods;

/**
 * Created by dan on 10/15/16.
 */
public class MethodParams {

    double calcAvg(int marks1, int marks2){
        return (marks1 + marks2)/2;
    }

    double calcAvg(int marks1, int marks2, int marks3){
        return (marks1 + marks2 + marks3)/3;
    }

    double calcAvg(int marks1, double marks2){
        return (marks1 + marks2)/2;
    }

    double calcAvg(double marks1, int marks2){
        return (marks1 + marks2)/2;
    }

    double calcAvg(double marks1, double marks2){
        return (marks1 + marks2)/2;
    }

    /**
     * Overloaded methods can define diff number of method params
     * They can also define diff param types and change the param positions
     */

    public static void main(String [] args) {
        MethodParams params = new MethodParams();
        System.out.println(params.calcAvg(1, 2));
    }
    /**
     * If method calcAvg(int a, int b) was commented out the preceding code wont compile
     * as the compiler is not sure what overloaded method to take
     */
}
