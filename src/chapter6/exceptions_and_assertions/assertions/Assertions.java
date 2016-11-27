package chapter6.exceptions_and_assertions.assertions;

import java.util.List;

/**
 * Created by dan on 11/27/16.
 */
public class Assertions {
    static void printReport(){
        int pages = 100;

        while(true){
            ++pages;
            break;
        }

        // Can replace if with an assert
        if(pages < 200){
            System.out.println("Error: Pages should not be less than 200");
        }
    }

    static void printReportAssert(){
        int pages = 100;

        while(true){
            ++pages;
            break;
        }

        // long form of assertion - second part is a statement that returns something
        assert (pages > 200) : "Error: Pages should not be more than 200";
    }

    /**
     * The following tests for internal invariants
     * This means that the variables should be set and know and if there are any new ones they should throw an assertions error
     */
    private static void machineState (State state) {
        switch(state){
            case ON:
                System.out.println("state is ON");
                break;
            case OFF:
                System.out.println("state is OFF");
                break;
            default:
                assert false;
        }
    }

    /**
     * The following is control flow invariants
     * There is 2 if statements, one the check if the value is less than 10 or greater than or equal to 10
     * There should always be a return and the code should not go beyond the if elseif statement
     * but if it does, the code will throw an assertion error
     */
    private static void controlFlow(int n){
        if(n < 10){
            return;
        } else if(n >= 10){
            return;
        }
        assert false;
    }

    /**
     * The following is class invariants
     * These are methods used to validate the state of the object
     */
    List<Student> students = null;
    private boolean sorted(){
        return false;
    }

    public void addStudent(Student newStudent){
        assert sorted();
    }

    // Dont use assertions to check params of public method
    public void runTest(int a, int b){
        // bad practice
        assert (a > 10 && b < 3);

        // Use if statement for that
        if(a > 10 && b < 3){
            a++;
            b--;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Use assertions for checking params of a private method
    private void anotherTest(int a, int b){
        // This is fine
        assert (a > 10 && b < 3);
    }

    // Don't depend on assertions to make your code run correctly
    // Assertions are off by default

    // Use assertions for situations that can never occur - even in public methods
    // Look at controlFlow() method for an example

    public static void main(String [] args){
//        printReport();
//        System.out.println();
//        printReportAssert();

        machineState(State.NEITHER);
    }
}

enum State {
    ON,
    OFF,
    NEITHER
}

class Student {}