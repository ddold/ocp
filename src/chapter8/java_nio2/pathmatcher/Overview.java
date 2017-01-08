package chapter8.java_nio2.pathmatcher;

/**
 * Created by dan on 1/8/17.
 */
public class Overview {
    /**
     * - You can match your file or directory names against a regex or glob pattern by using PathMatcher
     * - A glob pattern supports a simpler form of pattern matching than the regex. It supports a few special constructs
     * - In glob, * matched 0 or more characters. In regex, .* matches 0 or more characters
     * - To match a Path object with a pattern, you should create an object of java.nio.file.PathMatcher. PathMatcher is an interface with
     *   just 1 method: matches(). It returns true if a given path matches this matcher's pattern
     * - You can create a PathMatcher by calling FileSystem.getPathMatcher() and passing it the pattern to be matched
     */
}
