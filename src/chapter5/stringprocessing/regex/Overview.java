package chapter5.stringprocessing.regex;

/**
 * Created by dan on 11/15/16.
 */
public class Overview {
    /**
     * - Regular expressions, or regex, are used to define patterns of data to be found in a stream
     * - A regex has a syntax, which can be defined by using regular and special characters
     * - As opposed to exact matches, you can use regex to search for data that matches a pattern
     * - Character classes aren't classes defined in the Java API. The term refers to a set of characters
     *   that you can enclose within square brackets []
     * - Java supports predefined and custom character classes
     * - You create a custom character class by enclosing a set of characters within square brackets
     *   - [fdn] can be used to fina an exact match of f, d or n
     *   - [^fdn] can be used to find a character that doesn't match either f, d or n
     *   - [a-zA-Z] can be used to find exact match of a to z or A to Z
     * - You can use predefined classes as follows
     *   - A dot matches any character (may or may not match line terminators)
     *   - \d matches any digit [0-9]
     *   - \D matches any non-digit [^0-9]
     *   - \s matches any whitespace - (space), \t (tab), \n (newline), \x0B (end of line), \f (form feed),
     *     \r (carriage)
     *   - \S matches any non whitespace character [^\s]
     *   - \w matches any word character [a-zA-Z0-9]
     *   - \W matches any non word character [^\w]
     * - To use regex pattern in Java code that includes a backslash, you mist escape the \ by preceding
     *   it with another \. The character literal \ has a special meaning; it's used as an escape character
     *   To use it as a literal, it too must be escaped
     * - Boundary matchers
     *   - \b indicates word boundary
     *   - \B indicates nonword boundary
     *   - ^ indicates beginning of the line
     *   - $ indicates the end of the line
     * - You can specify the number of occurrences of a pattern to match in a target value by using quantifiers
     * - Exam uses greedy quantifiers
     *   - X? matches X once or not at all
     *   - X* matches X zero or more times
     *   - X+ matches X one or more times
     *   - X{min, max} matches X within the specified range
     * - Regex in Java supports Unicode, as it matches against the CharSequence objects
     * - Class Pattern is a compiled representation of a regular expression. It doesn't define a public
     *   constructor. You can instantiate this class by using its factory method compile()
     * - Class Matcher is referred to as an engine that scans a target CharSequence for a matching regex pattern
     *   Class Matcher doesn't define a public constructor. You can create and access a Matcher object by calling
     *   the instance method matcher() on an object of class Pattern
     * - When you have access to the Matcher object, you can match a complete input sequence against a pattern,
     *   match the input sequence at the beginning, find multiple occurrences of the matching pattern, or
     *   retrieve information about the matching group
     */
}
