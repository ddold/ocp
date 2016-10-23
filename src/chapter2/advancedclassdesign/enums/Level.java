package chapter2.advancedclassdesign.enums;

/**
 * Created by dan on 10/23/16.
 *
 * Best practice to name enums in capitals
 * separated by ,
 * Does not need ; at end unless more commands follow, if so then add ;
 *
 * Enum can't extend another class
 * It can implement interfaces
 */
public enum Level {
    BEGINNER,
    INTERMEDIATE,
    EXPERT;

    static {
        System.out.println("static init block");
    }

    Level() {
        System.out.println("constructor");
    }

    public static void main(String [] args){
        System.out.println(Level.EXPERT);
        /**
         * With enums the constructor is always called for each enum type
         * e.g for this class the constructor is called 3 times
         * Then followed by the static initializer and then the enum value
         *  constructor
         *  constructor
         *  constructor
         *  static init block
         *  EXPERT
         */
    }
}

class Game {
    // Instance variable of type Level
    Level gameLevel;
}

class GameApp {
    Game game = null;

    public void startGame() {
        game = new Game();
        game.gameLevel = Level.BEGINNER;
        /**
         * Because gameLevel is of type Level, you can assign
         * only one of the constants defined in the enum Level
         */
    }
}

/**
 *  Partial code from java.lang.Enum
 *  --------------------------------
 *      public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable {
 *          private final String name;
 *          private final int ordinal;
 *          // Position of enum constant
 *
 *          protected Enum(String name, int ordinal){
 *              this.name = name;
 *              this.ordinal = ordinal;
 *          }
 *
 *          public String toString() {
 *              return name;
 *          }
 *
 *          public final String name() {
 *              return name;
 *              // This returns enum constant name
 *          }
 *          // toString() and name() return same value
 *      }
 */