package chapter3.objectorienteddesignprinciples.interfaces;

/**
 * Created by dan on 10/30/16.
 *
 * Can name variables the same name in both interface and class
 */
public interface Livable {
    boolean status = true;
    int ratings = 10;
    int method();
}

class House implements Livable {
    boolean status;
    static int ratings = 7;

    House() {
        System.out.println(status);
        System.out.println(Livable.status);

        System.out.println(ratings);
        System.out.println(Livable.ratings);
    }

    // Has to be public as it can't be less restrictive than interface method
    // If it is anything less than public, the class won't compile
    public int method(){
        return 0;
    }

    public static void main(String [] args){
        new House();
    }
}
