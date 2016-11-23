package chapter6.exceptions_and_assertions.assertions;

/**
 * Created by dan on 11/23/16.
 */
public class Overview {
    /**
     * - An assertion offers a way of asserting what should always be true
     * - An assertion is implemented by using an assert statement that enables you to test your assumptions about the values
     *   assigned to variables and the flow of control in your code
     * - An assert statement uses a boolean expression, which you believe to be true. If this boolean expression evaluates to be
     *   false, an AssertionError is thrown (if assertions are enabled)
     * - Assertions are used for testing and debugging your code. They're off by default
     * - Assertions are disabled by default so they don't become a performance liability in deployed applications
     * - An assertion is defined using an assert statement that can take 2 forms. The simpler form uses only a boolean expression:
     *   assert <boolean expression>;
     * - The longer form of an assert statement includes an expression with the boolean expression:
     *   assert <boolean expression> : <expression>; The second expression used here must return a value (of any type)
     * - In the longer form of an assert statement, when the boolean expression evaluates to false, the JRE creates an object
     *   of AssertionError by passing the value of the second expression to AssertionError constructor
     * - In the longer form of an assert statement, if you use a method with no return value (void) for the second expression,
     *   your code won't compile
     * - In the longer form of an assert statement, you can create an object for the second expression. Note that a constructor
     *   creates and returns an object, and so it satisfies the requirement that the second expression must return a value
     * - You can test multiple types of invariants in your code by using assertions:
     */
}