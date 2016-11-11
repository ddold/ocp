package chapter4.genericsandcollections.creating_generic_entities;

import java.util.Stack;

/**
 * Created by dan on 11/11/16.
 */
public class RawGenericMix {
    public static void main(String [] args){
        // Following is allowed but lose type information
        ParcelGen parcel = new ParcelGen<String>();
        // Because you lose type information you can assign other values to it
        parcel.set(new Integer(2));
        // Generates compiler warning

        // Can set any value that its untyped
        parcel.set(new String("Hello"));
        // But you cant assign any String value using get() method
        //String val = parcel.get();


        // Following generates a compiler warning
        ParcelGen<String> parcel2 = new ParcelGen();
        // No compiler warning
        parcel2.set("Hello");
        // Compiles Successfully
        String val = parcel2.get();
        // Following wont compile as ref var knows its params type
        //parcel2.set(new Integer(2));
    }
}

class Interoperability {
    // pushItems() defines parameter of raw type
    public static void pushItems(Stack stackParam, Object item){
        // Generates warning: unchecked call to push(E) as member of raw stack type
        stackParam.push(item);
    }
    public static void main(String [] args){
        // Instantiates Stack of String objects
        Stack<String> stackObj = new Stack<String>();
        // Push String object
        stackObj.push("Dan");
        // Calls pushItem() which pushes Integer to stackObj
        pushItems(stackObj, new Integer(20));
        // Throws ClassCastException at runtime
        String val = stackObj.pop();
        System.out.println(val);
    }
}