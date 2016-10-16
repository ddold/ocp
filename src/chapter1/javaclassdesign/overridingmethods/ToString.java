package chapter1.javaclassdesign.overridingmethods;

/**
 * Created by dan on 10/16/16.
 *
 * Object method toString() returns
 *   => getClass().getName() + "@" + Integer.toHexString(hashCode())
 * It has to be overriden to print something useful
 */
public class ToString {
    public static void main(String [] args){
        Magazine magazine = new Magazine();
        System.out.println(magazine);   //Magazine@35cd9e66

        Mag mag = new Mag();
        mag.title = "Playboy";
        System.out.println(mag);
    }
}

class Magazine {
    String title;
}

class Mag {
    String title;
    @Override
    public String toString(){
        return title;
    }
}
/**
 * If method toString() returns text thats class specific it is used inappropiatly
 * i.e. class name or static values
 * The code will still compile and print the values, it will just be used inappropriatly
 */