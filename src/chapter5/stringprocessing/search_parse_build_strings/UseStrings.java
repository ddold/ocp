package chapter5.stringprocessing.search_parse_build_strings;

/**
 * Created by dan on 11/20/16.
 */
public class UseStrings {
    public static void main(String [] args){
        String sentence = "paint the cup and the plate";

        System.out.println("indexOf() and lastIndexOf()");
        System.out.println("---------------------------");
        System.out.println();

        System.out.printf("String being used is -> \"%s\"\n", sentence);
        System.out.println();

        // prints index of first occurrence of t - 4
        System.out.printf("index of char 't' is %d\n", sentence.indexOf('t'));
        // prints 6 - starts at end, counts 15 in and then uses that as position 0 to find next value of t
        // Starts searching at position 15 (counting from right - left) or position 11 (counting from left - right) - char 'u'
        // Starting at 'u', move to the left until first occurrence of 't' is found and print that index value as if counting left - right
        System.out.printf("last index of char 't' starting at position 15 is %d\n", sentence.lastIndexOf('t', 15));

        // prints 6 - index of first char in the word
        System.out.printf("index of string \"the\" is %d\n", sentence.indexOf("the"));
        // start at index 15 and find next occurrence of t which in index 18
        System.out.printf("index of char 't' starting from index 15 is %d\n", sentence.indexOf('t', 15));

        // start at the end and look from right to left for string and print index of char at start of string - 18
        System.out.printf("last index of the string \"the\" is %d\n", sentence.lastIndexOf("the"));
        // Start at end and go from right - left, print index of first occurrence of t - 25
        System.out.printf("last index of the char 't' is %d\n", sentence.lastIndexOf('t'));

        System.out.println();
        System.out.println();

        // Prints 1 - starts at position 0, implicitly or explicitly and finds first occurrence of 'a'
        System.out.printf("index of char 'a' is %d\n", sentence.indexOf('a'));
        System.out.printf("index of char 'a' starting at position 0 is %d\n", sentence.indexOf('a', 0));
        // Starts at position -100 and looks from left - right to find first occurrence of 'a'
        // This prints 1, starts at position -100 and works its way up until it finds its first occurrence of 'a'
        // even though there is no values to left of position 0 this still works because values appear as it searched left - right
        System.out.printf("index of char 'a' starting at position -100 is %d\n", sentence.indexOf('a', -100));
        // prints -1 as position starts at 100 and counts left - right so no values show
        // no null pointer is returned just -1 if no values match
        System.out.printf("index of char 'a' starting at position 100 is %d\n", sentence.indexOf('a', 100));

        // Searches right to left and prints index of first occurrence of 'a'
        System.out.printf("last index of char 'a' is %d\n", sentence.lastIndexOf('a'));
        // starts at position 0 and searches to the left
        // because there are no values ot the left of position 0, -1 is returned
        System.out.printf("last index of char 'a' starting at position 0 is %d\n", sentence.lastIndexOf('a', 0));
        // Searches right to left and prints index of first occurrence of 'a'
        // starts at position 100 and searches to the left
        System.out.printf("last index of char 'a' starting at position 100 is %d\n", sentence.lastIndexOf('a', 100));
        // starts at position -100 and searches to the left
        // because there are no values ot the left of position -100, -1 is returned
        System.out.printf("last index of char 'a' starting at position -100 is %d\n", sentence.lastIndexOf('a', -100));


        System.out.println();
        System.out.println("subSequence() and substring()");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("methods subSequence() and substring() don't include char at the last position");
        System.out.println("substring() returns String");
        System.out.println("subSequence() returns CharSequence");
        System.out.println("Both methods throw IndexOutOfBoundsException for invalid start/end positions");

        System.out.println();
        System.out.println("split()");
        System.out.println("-------");
        System.out.println();
        System.out.println("method declaration - split(String regex) and split(String regex, int limit)");
        System.out.println("split() searches for regex pattern and split string into an array os string values");

        // t.e matches with the and uses that as a delimiter for splitting the string, the values are then stored in an array
        String [] tokens = sentence.split("t.e");
        for(String s : tokens){
            System.out.println(s);
        }

        // int limit set the number of tokens to store
        // With no limit it splits on all of the tokens and adds to an array
        // In the last one with no limit 3 values added to array
        // But with limit set to 2, only 2 values added to array
        String [] tokens2 = sentence.split("t.e", 2);
        for(String s : tokens2){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("replace() and replaceAll()");
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("replace(char old, char new)");
        System.out.println("replace(CharSequence old, CharSequence new)");
        System.out.println("replaceAll(String regex, String replacement)");
        System.out.println("replaceFirst(String regex, String replacement)");
        System.out.println();

        String str = "RENT-TENT";
        String newString = str.replace(str.substring(2, 5), str.subSequence(str.indexOf('T'), str.lastIndexOf('N')));
        System.out.printf("String value str is - %s\n", str);
        System.out.println("Putting str through this process - str.replace(str.substring(2, 5), str.subSequence(str.indexOf('T'), str.lastIndexOf('N')))");
        System.out.printf("New String value newString is - %s\n", newString);

        System.out.println();
        String string = "cat cup copp";
        String stringNew = string.replaceAll("c.p\\B", "()");
        System.out.printf("Original String is - %s\n", string);
        System.out.println("Putting it through the process - str.replaceAll(\"c.p\\\\B\", \"()\")");
        System.out.printf("New String is - %s\n", stringNew);

        System.out.println();
        System.out.println("other methods");
        System.out.println("-------------");
        System.out.println();

        System.out.println("endsWith(String suffix) - Returns true id String ends with suffix");
        System.out.println("startsWith(String prefix) - Returns true if string starts with prefix");
        System.out.println("startsWith(String prefix, int offset) - Returns true if substring of this string beginning at the " +
                           "specified index starts with the specified prefix");
        System.out.println("compareTo(String anotherStr) - Compares the string with another string. Returns negative, zero or positive " +
                           "value depending on whether this string is less than, equal to or greater than anotherStr");
        System.out.println("compareToIgnoreCase(String anotherStr) - same as compareTo() but ignores the case differences");
        System.out.println("equals(Object object) - Returns true if the object being compared defines the same sequence of characters");
        System.out.println("equalsIgnoreCase(String anotherStr) - same as equals() but ignores case differences");

        String value = "Start startup, time to start";
        System.out.printf("Does \"value\" starts with the string \"Start\"? - %b\n", value.startsWith("Start"));
        System.out.printf("Does \"value\" starts with the string \"Start\" at position 0? - %b\n", value.startsWith("Start", 0));

        System.out.printf("Does \"value\" starts with the string \"Start\" at position -1? - %b\n", value.startsWith("Start", -1));
        System.out.printf("Does \"value\" starts with the string \"Start\" at position 1? - %b\n", value.startsWith("Start", 1));

        System.out.println();

        String a = "a";
        String b = "A";
        System.out.printf("Does %s.compareTo(%s) return negative, zero or positive number? -> %d\n", a, b, a.compareTo(b));
        System.out.printf("Does %s.compareTo(%s) return negative, zero or positive number? -> %d\n", b, a, b.compareTo(a));
    }
}
