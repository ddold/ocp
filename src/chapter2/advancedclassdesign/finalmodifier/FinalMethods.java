package chapter2.advancedclassdesign.finalmodifier;

/**
 * Created by dan on 10/23/16.
 *
 * Final methods can't be overriden by derived class
 */
class Base {
    final void finalMethod(){}
    private void finalMethod2(){}
}
public class FinalMethods extends Base {
    //void finalMethod(){};
    // Won't compile

    final void finalMethod2(){}
    // Private methods aren't inherited so this method is not overriden it is a new method
}
