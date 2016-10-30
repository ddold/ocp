package chapter3.objectorienteddesignprinciples.cohesionandlowcoupling;

/**
 * Created by dan on 10/30/16.
 */
class Author{
    String name;
    String skypeId;
    public String getSkypeId(){
        return skypeId;
    }
}

class Editor3{
    public void clearEditingDoubts(Author author){
        // Tightly coupled as nonpublic variable skypeId is referred to outside its class Author
        setUpCall(author.skypeId);
        converse(author);

        /**
         * To make it more loosely coupled use getSkypeId() method to get the skypeId
         */
    }
    public void setUpCall(String skypeId){}
    public void converse(Author author){}
}

public class Coupling {
}
