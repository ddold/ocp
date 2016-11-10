package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/2/16.
 */
public class Overview {
    /**
     *
     *                                  Generics
     *                                 ----------
     * - You define a generic class, interface, or method by adding one or more type parameters to it
     * - A class that uses a generic class that uses a parameterized type, replacing the formal parameter with
     *   an actual parameter. Also, invalid casts aren't allowed
     * - Java's naming conventions limit the use of single uppercase letters for type parameters. Though not
     *   recommended, using any valid identifier name for type parameters is acceptable code
     * - A generic class can be extended by another generic or nongeneric class
     * - An extended class must be able to pass type arguments to its generic base class. If it doesn't the
     *   code won't compile
     * - When a nongeneric class extends a generic class, the derived class doesn't define any type parameters
     *   but passes arguments to all type parameters of its generic base class
     * - A generic interface is defined by including one or more type parameters in its declaration
     * - When a nongeneric class implements a generic interface, the type parameters follow the interface name
     * - When a generic class implements a generic, the type parameters follow both class and interface name
     * - A generic method defines its own formal type parameters. You can define a generic method in a generic
     *   or nongeneric class
     * - To define a generic method in a nongeneric class or interface, you must define the type parameters with
     *   the method in its type parameter section
     * - A methods type parameter list is placed just after its access and nonaccess modifiers and before its
     *   return type. Because a type parameter could be used to define the return type, it should be known
     *   before the return type is used
     * - You can define a generic method in a generic class or interface, defining its own type parameters
     * - You can also define a generic constructor in a generic class
     * - You can specify bounds to restrict the set of types that can be used as type arguments to a generic
     *   class, interface or method. It also enables access to to the methods (and variables) defined by the
     *   bounds
     * - For a bounded type parameter, the bound can be a class, an interface or an enum, but not an array or
     *   a primitive type. All cases use the keyword extends to specify the bound. If the bound is an interface
     *   the keyword implement is NOT used
     * - A type parameter can have multiple bounds. The list of bounds consists of one class or multiple interfaces
     * - For a type parameter with multiple bounds, the type argument must be a subtype of all bounds
     * - The wildcard ? represents an unknown type. You can use it to declare the type of a parameter; a local,
     *   instance, or static variable; and a return value of generic types. But you can't use it as a type
     *   argument to invoke a generic method, create a generic class instance, or for a subtype
     * - You can assign an instance of a subclass, say String, to a variable of its base class, Object. But you
     *   can't assign ArrayList<String> to a variable of type List<Object>. Inheritance doesn't apply to type
     *   parameters
     * - When you use a wildcard to declare you variables or method parameters you lose the functionality of
     *   adding objects to a collection
     * - To restrict the types that can be used as arguments in a parameterized type, you can use bounded wildcards
     * - In upper-bounded wildcards, the keyword extends is used for both a class and an interface
     * - For collections defined using upper-bounded wildcards you can't add any objects. You can iterate and
     *   read values from such collections
     * - You can use final classes in upper-bounded wildcards. Although class X extends String won't compile,
     *   <? extends String> will compile successfully
     * - You can restrict the use of type arguments to a type and its supertypes or base types by using
     *   <? super Type>, where Type refers to a class, interface or enum
     * - Type information is erased during compilation process; this is called TYPE ERASURE
     * - When a generic class is compiled, you don't get multiple versions of compiled class files
     * - The compiler erases the type information by replacing all type parameters in generic types with Object
     *   (for unbounded parameter types) or their bounds (for bounded parameter types)
     * - The Java compiler might need to create additional methods referred to as a bridge methods as part of
     *   type erasure process
     *
     *
     *
     *                                      Type Inference
     *                                     ----------------
     * - If you don't specify the type of type arguments to instantiate a generic class or invoke a generic method,
     *   the Java compiler might be able to infer the argument type by examining the declaration of the generic entity
     *   and its invocation. If the type can't be inferred you might get a compilation warning, an error or an exception
     * - By throwing an unchecked warning, the compiler states that it can't ensure type safety. The term unchecked
     *   refers to operations that might result in violation type safety. This occurs when the compiler doesn't have
     *   enough type information to perform all type checks
     * - Starting with Java 7, you can drop the type arguments required to invoke the constructor of a generic class and
     *   use a diamond - that is, <>. But an attempt to drop the diamond will result in a compilation warning
     * - A Java compiler can't infer the type parameters by using the diamond in the case of generic methods. It uses
     *   the type of the actual arguments passed to the method to infer the type parameters
     *
     *
     *
     *                 Understanding Interoperability of collections using raw and generic types
     *                ---------------------------------------------------------------------------
     * - Raw types exist only for generic types
     * - You can assign a paramaterized type to its raw type, but the reverse will give a compiler warning
     * - When you assign a parameterized type to its raw type, you lose the type information
     * - When you mix raw types with generic types, you might get a compiler warning or error or runtime exception
     * - You can assign an object of a subclass to a reference variable of its base class. But this subtyping rule doesn't
     *   work when you assign a collection-of-a-derived-class object to a reference variable of a collection of a base class
     * - If you declare a reference variable List<Object> to a list, whatever you assign to the list must be of generic
     *   type Object. A subclass of type Object isn't allowed
     */
}
