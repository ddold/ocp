package chapter1.javaclassdesign.instanceinitializers;

/**
 * Created by dan on 10/15/16.
 */
public class Pencil {
    public Pencil() {
        System.out.println("Pencil:constructor");
    }
    public Pencil(String a){
        System.out.println("Pencil:constructor2");
    }
    {
        System.out.println("Pencil:init1");
    }
    {
        System.out.println("Pencil:init2");
    }
    public static void main(String [] args){
        new Pencil();
        new Pencil("aValue");
    }
}

/**
 * Result;
 *----------------
 * Pencil:init1
 * Pencil:init2
 * Pencil:constructor
 * Pencil:init1
 * Pencil:init2
 * Pencil:constructor2
 */
