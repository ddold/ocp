package chapter5.stringprocessing.search_parse_build_strings;

/**
 * Created by dan on 11/15/16.
 */
public class Overview {
    /**
     * - Can search Strings for exact matches of characters or strings, at the beginning of a string, or starting
     *   at a specified position, using String class's overloaded methods indexOf() (Note capital O)
     * - Method indexOf() returns first matching position of a character or string, starting from the specified
     *   position of this string or from its beginning
     * - Method lastIndexOf() returns the last matching position of a character in the entire string or its subset
     *   (position 0 to the specified position)
     * - Methods indexOf() and lastIndexOf() differ in the manner that they search a target string - indexOf()
     *   searches in increasing position numbers and lastIndexOf() searches backward. Due to this difference,
     *   indexOf('a', -100) will search the complete string but lastIndexOf('a', -100) won't. In a similar
     *   manner, because lastIndexOf() searches backwards, lastIndexOf('a', 100) will search the string, but
     *   indexOf('a', 0) or indexOf('a' -100) won't
     * - Methods indexOf() or lastIndexOf() don't throw a compilation error or runtime exception if the search
     *   position is negative or greater than the length of the string. If no match is found, -1 is returned
     * - Method contains() searches for an exact match in the string. Because contains() accepts a method
     *   parameter of interface CharSequence, you can pass to it both a String and a StringBuilder object
     * - Methods subSequence() (Uppercase S) and substring() (no uppercase s) accept int parameters and return
     *   a substring of the target string
     * - Method substring() defines overloaded versions, which accept one or two int method parameters to
     *   specify the start and end positions
     * - Method subSequence() defines only one variant, the one that accepts two int method parameters for
     *   the start and end positions
     * - Methods subSequence() and substring() don't include the character at the end position in the result String
     *   Also, unlike methods indexOf() and lastIndexOf(), they throw runtime exception StringIndexOutOfBoundsException
     *   for invalid start and end positions
     * - The name of methods subSequence() and substring() can be used to determine their return type. subSequence()
     *   returns CharSequence and substring() returns String
     * - Methods split(String regex) and split(String regex, int limit) in class String search for a matching
     *   regex pattern and split a String into an array of string values
     * - The String value returned by split() doesn't contain the values that it matches to split the target string
     * - You can limit the max number of tokens that you want to retrieve by using split(String regex, int limit)
     * - replace(char oldChar, char newChar) returns a new String resulting from finding and replacing all
     *   occurrences of the old character with the new character
     * - replace(CharSequence oldVal, CharSequence newVal) returns a new String resulting from finding and replacing
     *   each substring of the string that matches the old target sequence with the specified new replacement
     *   sequence
     * - replaceAll(String regex, String replacement) replaces each substring of the string that matches the given
     *   regex with the given replacement
     * - replaceFirst(String regex, String replacement) replaces the first substring of the string that matches the
     *   given regex with the given replacement
     * - Unlike replace(), replaceAll() doesn't accept method parameters of type CharSequence. Watch out for passing
     *   of objects of class StringBuilder to replaceAll()
     * - The combination of replace(), replaceAll() and replaceFirst() overloaded methods can be confusing on the
     *   exam. Take note of the method parameters that can be passed to each of these methods
     * - Scanner can be used to parse and tokenize strings
     *   - If no delimiter is specified a pattern that matches whitespace is used by default for a Scanner object
     *   - You can specify a custom delimiter by calling useDelimiter() with a regex
     *   - Method next() returns an object of type string
     *   - Scanner also defines multiple nextXXX() methods where XXX refers to primitive data type. These methods
     *     return the value as the corresponding primitive type
     *   - Methods hasNext() and hasNextXXX() only return true or false but don't advance. Only next() and nextXxx()
     *     advance in the input
     *   - Method findInLine() matches the specified pattern with no regard to delimiters in the input
     */
}
