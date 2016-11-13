package chapter4.genericsandcollections.wrapper_classes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by dan on 11/13/16.
 */
public class WrapperClass {
    /**
     *
     *      class Object        interface Serializable         interface Comparable
     *           ^                       ^                              ^
     *           |                       |                              |
     *           |                       |                              |
     *           |_______________________|______________________________|
     *                                   ^
     *                                   |
     *           ________________________|_______________________________
     *          |                        |                              |
     *     class Boolean            class Number                   class Character
     *                                   ^
     *                                   |
     *       ____________________________|________________________
     *      ^      ^          ^          ^         ^             ^
     *      |      |          |          |         |             |
     * class Byte  |     class Integer   |    class Float        |
     *             |                     |                       |
     *        class Short           class Long              class Double
     *
     *
     */

    public static void main(String [] args){
        //Autoboxing
        Boolean bool1 = true;
        Character char1 = 'a';
        Byte byte1 = 10;
        Double double1 = 10.98;

        // Using constructor
        Boolean bool2 = new Boolean(true);
        Character char2 = new Character('a');
        Byte byte2 = new Byte((byte)10); // Value needs to be casted to byte
        Double double2 = new Double(10.98);

        // Constructor that accepts String
        Boolean bool3 = new Boolean("true");
        //Character char3 = new Character("a"); - this won't compile
        Byte byte3 = new Byte("10");
        Double double3 = new Double("10.98");

        // Using static method valueOf()
        Boolean bool4 = Boolean.valueOf(true);
        Boolean bool5 = Boolean.valueOf("TrUe"); // Still sets it to true
        Double double4 = Double.valueOf(10.98);


        /**
         * Get string value to primitive type
         * Boolean   - public static boolean parseBoolean(String s)
         * Character - no parsing methods
         * Byte      - public static byte parseByte(String s)
         * Short     - public static short parseShort(String s)
         * Integer   - public static int parseInt(String s)
         * Long      - public static long parseLong(String s)
         * Float     - public static float parseFloat(String s)
         * Double    - public static double parseDouble(String s)
         *
         * Long.parseLong("12.34") throws NumberFormatException
         * Byte.parseByte("1234") throws NumberFormatException
         * Boolean.parseBoolean("true") works fine
         * Boolean.parseBoolean("tRUe") works fine, string arg isn't case sensitive
         */

        Map<Double, String> map = new HashMap<>();
        map.put(6.6, "OCA");
        map.put(7.7, "OCP");
        System.out.println(map.get(6.6));
        // prints null - objects of different wrapper classes with same value are not equal
        System.out.println(map.get(new Float((float) 7.7)));

        TreeSet<Boolean> set = new TreeSet<>();
        set.add(new Boolean(true));
        set.add(new Boolean("FalSE"));
        set.add(Boolean.valueOf("TrUe"));
        for(Boolean b : set){
            System.out.println(b);
        }
        /**
         * output is false, true
         * Its a set so no duplicates
         * In its natural order false precedes true
         */
    }
}
