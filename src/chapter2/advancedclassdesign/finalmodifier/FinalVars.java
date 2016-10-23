package chapter2.advancedclassdesign.finalmodifier;

/**
 * Created by dan on 10/23/16.
 */
public class FinalVars {
    // static final class variable can be initialized with declaration or static init block
    // static init block is guaranteed to be execute only once for a class
    static final int staticFinal = 10;
    static final int staticFinal2;

    final int finalVar = 2;
    final int finalVar2;

    static {
        staticFinal2 = 2;
    }

    static void setStaticFinal(int value){
        //staticFinal = value;
        // Previous line won't compile because the method can be called multiple times
    }

    void setFinalVar(int a){
        //finalVar2 = a;
        // Won't compile as the method can be executed multiple times

        final int finalLocalVar1;
        finalLocalVar1 = a;
        // Can declare and initialize final local vars on separate lines

        final int finalLocalVar2;
        // Compiles as long as this is never called

        //System.out.print(finalLocalVar2);
        // Won't compile
    }

    void setValue(final int val){
        /**
         * If a method param is marked as final no other value
         * can be assigned to it
         */
    }

    FinalVars(){
        //staticFinal = 2;
        // Won't compile because it executes on creation of every instance

        finalVar2 = 10;
        // This compiles because finalVar2 is not static
    }
}

/**
 * Final Primitive Variables
 * -------------------------
 * Can't change
 *
 * Final Reference Variables
 * -------------------------
 * Object referred to by the final object reference
 * variables can be changed. Only the final reference
 * itself can't be changed
 *
 * void addCondition(final StringBuilder query){
 *     query.append("WHERE id > 500");  => compiles
 *     query = new StringBuilder("SELECT name FROM emp");   => won't compile
 * }
 *
 *
 *
 *
 * Conditional Statements
 * ----------------------
 * The following won't compile as variables are used in the condition
 * There is a possibility all options wont be reached
 * Replace the 'else if' with just an 'else' to compile
 *  final int var
 *  void method(int a, int b){
 *     if(a > b){
 *         var = 10;
 *     } else if(b <= a){
 *         var = 20;
 *     }
 *  }
 *
 * The following will compile because constant values are use in the conditions
 * instead of variables, t==========he compiler can determine that all of the code can execute
 *  final int var
 *  void method(int a, int b){
 *     if(1 > 2){
 *         var = 10;
 *     } else if(2 <= 5){
 *         var = 20;
 *     }
 *  }
 */