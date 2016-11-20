package chapter5.stringprocessing.formatting_strings;

/**
 * Created by dan on 11/20/16.
 */
public class Overview {
    /**
     * - Class java.util.Formatter is an interpreter for printf-style format strings
     * - A formatter provides support for layout justification and alignment; common formats for numeric, string and date/time data
     *   and locale-specific output
     * - Formatters format() is used to format data
     * - To use format(), you need to define a format string that defines how to format text and an object argument list that defines
     *   what to format
     * - You can define a combination of fixed text and one or more embedded format specifiers, to be passed to the methods format()
     *   first argument
     * - The format specifier takes the following form:
     *     %[argument_index$] [flags] [width] [.precision] conversion
     * - A format specification must start with a % sign and end with a conversion character;
     *   - b for boolean
     *   - c for char
     *   - d for int, byte, short and long
     *   - f for float and double
     *   - s for string
     * - If the number of arguments exceeds the required count the extra variables are quietly ignored by the compiler and JVM. But
     *   if the number of required arguments falls short, the JVM throws a runtime exception
     * - The - indicates to left-justify this argument; you must specify width as well. Number flags (oly applicable for numbers, f and d)
     *   are as follows;
     *     - The + indicates to include a sign (+ or -) with this argument
     *     - 0 indicates to pad this argument with zeros. Must specify width as well
     *     - , indicates locale-specific grouping separators (for ex the comma in 123,456)
     *     - ( is used to enclose negative numbers in parenthesis
     * - The flags +, 0, (, and , can be specified only with the numeric specifiers %d and %f. If you try to use them with any other
     *   format specifier (%b, %s or %c), you'll get runtime exception
     * - Format specifier %b
     *   - You can pass any type of primitive variable or object reference to specifier %b
     *   - If the target argument arg is null, then %b outputs the result false. If arg is boolean or Boolean, the result is the String
     *     returned by String.valueOf(). Otherwise it is true
     * - Format specifier %c
     *   - %c outputs the result as Unicode character
     *   - You can pass only literals and variables that can be converted to a Unicode character (char, byte, short, int, Character, Byte,
     *     Short and Integer) to the %c specifier. Passing variables of type boolean, long, float, Boolean, Long or Float will
     *     throw a IllegalFormatConversionException
     * - Format specifier %f
     *   - You can format decimal numbers (float, Float, double and Double) by using format specifier %f
     *   - By default, %f prints 6 digits after the decimal. It also rounds off the last digit
     * - Format specifier %d
     *   - You can format integers (byte, short, int, long, Byte, Short, Integer and Long) by using %d specifier
     *   - If you pass literal values or variables of type float, double, Float or Double to the format specifier %d, the code
     *     will throw a runtime exception
     * - Format specifier %s
     *   - %s outputs the value for a primitive variable. For reference variables it calls toString() on objects that are not null
     *     and outputs null for null values
     *   - You can pass any type of primitive variable or object reference to specifier %s
     */
}
