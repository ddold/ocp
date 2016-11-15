package chapter5.stringprocessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dan on 11/15/16.
 */
public class UseRegex {
    public static void main(String [] args){
        // Target String and Regex Pattern
        String targetString = "I am fine to dine at nine";
        String regex = "[fdn]ine";

        // Pass regex String to Pattern object
        Pattern pattern = Pattern.compile(regex);
        // Create matcher object from pattern method - pass it sentence to be searched
        Matcher matcher = pattern.matcher(targetString);

        /**
         * find() returns true as long as it finds matches of regex in the String
         * group() returns the String found with the regex
         * start() returns the char index of the target string
         * end() returns end position of target string - it is always 1 position after actual end of string
         */
        while(matcher.find()){
            System.out.println(matcher.group() + " starts at " +
                               matcher.start() + ", ends at " +
                               matcher.end());
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        targetString = "A b$9;";
        regex = "\\W";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);
        String replacedStr = matcher.replaceAll("[]");

        System.out.println(replacedStr);

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        targetString = "The leather in their coat made her seethe";
        regex = "\\b[Tt]he\\b";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);

        while(matcher.find()){
            System.out.println(matcher.group() + " starts at " +
                    matcher.start() + ", ends at " +
                    matcher.end());
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        targetString = "bday";
        // ? matches 0 or 1 times
        regex = "d?";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);

        while(matcher.find()){
            System.out.printf("Found :%s: starting at %d and ending at %d",
                    matcher.group(), matcher.start(), matcher.end());
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        targetString = "b234a A6Z abc";
        // * matches 0 or more occurrences
        regex = "[a-zA-Z]\\d*[a-zA-Z]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);

        while(matcher.find()){
            System.out.printf("Found :%s: starting at %d and ending at %d",
                    matcher.group(), matcher.start(), matcher.end());
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        targetString = "b234a A6Z abc";
        // * matches 0 or more occurrences
        regex = "[a-zA-Z][1-5]*[a-zA-Z]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);

        while(matcher.find()){
            System.out.printf("Found :%s: starting at %d and ending at %d",
                    matcher.group(), matcher.start(), matcher.end());
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        targetString = "food, fod, fooodder, fd";
        // + matches 1 or more occurrences
        regex = "fo+d";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);

        while(matcher.find()){
            System.out.printf("Found :%s: starting at %d and ending at %d",
                    matcher.group(), matcher.start(), matcher.end());
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        targetString = "b234a A6Z abc";
        // + matches 1 or more occurrences
        regex = "[a-zA-Z]\\d+[a-zA-Z]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(targetString);

        while(matcher.find()){
            System.out.printf("Found :%s: starting at %d and ending at %d",
                    matcher.group(), matcher.start(), matcher.end());
            System.out.println();
        }
    }
}
