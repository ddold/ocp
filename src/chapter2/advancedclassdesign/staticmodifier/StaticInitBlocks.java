package chapter2.advancedclassdesign.staticmodifier;

/**
 * Created by dan on 10/23/16.
 *
 *                  Static initializers
 *                  -------------------
 * Static variables can't be initialized using a constructor, a static initializer is used for
 * that. The initializer block executes when a class is loaded by JVM into memory
 * Multiple static inits can be defined which execute in the order of their appearence
 *
 * Static inits are only used once no matter how many instances of the objects are used
 * Order of inits and constructors called are;
 * - Static inits
 * - inits
 * - constructor
 */
class AssignManipulateStaticVariable {
    static {
        rate = 10;
    }
    static int rate = 0;
    static {
        ++rate;
    }
    public AssignManipulateStaticVariable() {
        System.out.println(rate);
        /**
         * 1 is printed
         * The compiler rearranges the code in the following
         *  static int rate
         *  static {
         *      rate = 10;
         *      rate = 0;
         *      ++rate;
         *  }
         */
    }
}

class AffiliateProgram {
    private static int accountOpenBonus;

    static {
        accountOpenBonus = 5;
    }

    static {
        System.out.println("Parent class : static init");
        StaticInitBlocks.staticVar++;
    }

    {
        System.out.println("Parent class : init");
        StaticInitBlocks.staticVar++;
    }

    AffiliateProgram() {
        System.out.println("Parent class : constructor " + StaticInitBlocks.staticVar);
    }
}

public class StaticInitBlocks extends AffiliateProgram {
    static int staticVar = 10;

    static {
        System.out.println("base class : static init");
        staticVar++;
    }

    static {
        System.out.println("base class (2) : static init");
        staticVar++;
    }

    {
        System.out.println("base class : init");
        staticVar++;
    }

    StaticInitBlocks(){
        System.out.println("base class : constructor " + staticVar);
    }

    public static void main(String [] args){
        new StaticInitBlocks();
        new AssignManipulateStaticVariable();
    }
}
/**
 * When a class extends another and there are static inits, inits and constructors defined in both,
 * the order they are called in are;
 * static init | parent class
 * static init | base class
 * init        | parent class
 * constructor | parent class
 * init        | base class
 * constructor | base class
 *
 * If the following is defined it will fail to compile
 * class Example{
 *     static {
 *         var++
 *     }
 *     static int var;
 * }
 * static init is called first before variable is defined
 */
