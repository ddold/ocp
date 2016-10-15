package chapter1.javaclassdesign.overloadedmethods;

/**
 * Created by dan on 10/15/16.
 */
class Paper {}
class Smartphone {}
class Laptop {}

public class Lecture {
    void takeNotes(Paper paper) {}
    void takeNotes(Smartphone phone) {}
    void takeNotes(Laptop laptop) {}
}

class Canvas {}
class FineArtLecture extends Lecture {
    void takeNotes(Canvas canvas) {}
}
/**
 * takeNotes() in FineArtLecture overloads takeNotes() from
 * Lecture by specifying a different parameter list
 */
