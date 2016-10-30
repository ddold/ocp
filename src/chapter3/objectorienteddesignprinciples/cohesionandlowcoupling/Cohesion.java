package chapter3.objectorienteddesignprinciples.cohesionandlowcoupling;

/**
 * Created by dan on 10/30/16.
 */

// Low cohesion - class Editor is performing set of unrelated tasks
class Editor{
    public void editBooks(){}
    public void manageBookPrinting(){}
    public void reachOutToNewAuthors(){}
}

// High Cohesion - class Editor is performing multiple but related tasks
class Editor2{
    public void useEditTools(){}
    public void editFirstDraft(){}
    public void clearEditingDoubts(){}
}

public class Cohesion {
}
