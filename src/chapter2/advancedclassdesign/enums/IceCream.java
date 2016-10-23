package chapter2.advancedclassdesign.enums;

/**
 * Created by dan on 10/23/16.
 *
 * enum constant list must be first in the enum definition
 * and should be followed by a semicolon
 *
 * An enum cant define a constructor as public or protected
 * An enum can be top level or a member of a class or interface
 * Can't define an enum in a method
 */
public enum IceCream {
    VANILLA("white"),
    STRAWBERRY("pink"),
    WALNUT("brown"){
        // following methods only available to enum constant WALNUT
        // This is known as a constant specific class body
        public String toString() {
            return "WALNUT is Brown in color";
        }
        // This method can't be executed
        public String flavor() {
            return "great!";
        }
    },
    CHOCOLATE("dark brown");

    private String color;

    // Enum constructor
    IceCream(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString() {
        return "MyColor:" + color;
    }

    public static void main(String[] args){
        System.out.println(VANILLA);
        System.out.println(CHOCOLATE);
    }
}

class UseIceCream {
    public static void main(String[] args){
        IceCream.VANILLA.setColor("white");
        System.out.println(IceCream.VANILLA.getColor());
        System.out.println(IceCream.VANILLA);
        // toString() method called for this

        System.out.println(IceCream.WALNUT);
        //System.out.println(IceCream.WALNUT.flavor); => wont compile

        System.out.println();
        for(IceCream c : IceCream.values()){
            System.out.println(c);
        }
    }
}