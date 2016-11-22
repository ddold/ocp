package chapter6.exceptions_and_assertions.override_methods_with_throw;

/**
 * Created by dan on 11/22/16.
 */
public class Overview {
    /**
     * - With overriding and overridden methods, it's all about which checked exceptions an overridden method and an overriding
     *   method declare, not about the checked exceptions both actually throw
     * - If a method in the base class doesn't declare to throw any checked exception, the overriding method in the derived
     *   class can't throw any checked exception
     * - If a method in the base class declares to throw a checked exception, the overriding method in the derived class can
     *   choose not to declare to throw any checked exception
     * - If a method in a base class declares to throw a checked exception, the overriding method in the derived class can declare
     *   to throw the same exception or a subclass of the exception thrown by the method in the base class. An overriding method
     *   in the derived class can't override a method in the base class, if it declares to throw a more generic checked exception
     * - Method overriding rules apply only to checked exceptions. They don't apply to runtime (unchecked) exceptions or errors
     */
}
