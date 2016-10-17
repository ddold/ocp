package chapter1.javaclassdesign.overridingmethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dan on 10/17/16.
 *
 * hashCode() returns a hashcode value for an object which is used to efficiently
 * store and retrieve values in collection classes that use hashing algorithms - HashMap
 * Hashing algorithms identify the buckets in which they would store the objects
 * and from which they would retrieve them
 */
public class HashCode {
    public static void main(String [] args){
        Map<MyNumber, String> map = new HashMap<>();
        MyNumber num1 = new MyNumber(1200);
        MyNumber num2 = new MyNumber(2500);
        MyNumber num3 = new MyNumber(57123);
        map.put(num1, "John");
        map.put(num2, "Mary");
        map.put(num3, "Sam");

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }


        Map<Number, String> map2 = new HashMap<>();
        Number num4 = new Number(2500, 100);
        Number num5 = new Number(2500, 200);
        System.out.println(num4.equals(num5));
        map2.put(num4, "Dan");
        System.out.println(map2.get(num5));
        // Prints null because the hashCode doesnt return the same values for its equals objects
    }
}

class MyNumber {
    long number;

    MyNumber(long number){
        this.number = number;
    }

    public int hashCode() {
        int sum = 0;
        long num = number;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        return sum;
    }

    public String toString() {
        return Integer.toHexString(hashCode());
    }
}

// Inapropriate use of using hashCode()
class Number {
    int primary;
    int secondary;

    Number(int primary, int secondary){
        this.primary = primary;
        this.secondary = secondary;
    }

    public int hashCode(){
        return secondary;
    }

    public boolean equals(Object o){
        if(o != null && o instanceof Number){
            return (primary == ((Number)o).primary);
        } else {
            return false;
        }
    }
}

/**
 * Contract for overriding hashCode() correctly
 * --------------------------------------------
 * 1. If 2 objects are equal according to equals(), then calling hashCode()
 *    on each object would return the same integer result
 * 2. Its not required that if 2 objects are unequal that calling hashCode() would
 *    return distinct integer results
 */