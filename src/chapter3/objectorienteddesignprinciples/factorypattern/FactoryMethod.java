package chapter3.objectorienteddesignprinciples.factorypattern;

/**
 * Created by dan on 10/30/16.
 */
interface App2 {
    void open(String filename);
}

class WordProcessor2 implements App2 {
    @Override
    public void open(String filename) {
        System.out.println("Launch WordProcessor using " + filename);
    }
}

class TextEditor2 implements App2 {
    @Override
    public void open(String filename) {
        System.out.println("Launch TextEditor using " + filename);
    }
}

abstract class AppFactory2 {
    public App2 getAppInstance(){
        App2 appln = getApp();
        return appln;
    }

    public abstract App2 getApp();
}

class WordAppFactory extends AppFactory2 {
    @Override
    public App2 getApp() {
        return new WordProcessor2();
    }
}

class TextEditAppFactory extends AppFactory2 {
    @Override
    public App2 getApp() {
        return new TextEditor2();
    }
}

public class FactoryMethod {
    public static void main(String [] args){
        AppFactory2 factory = new WordAppFactory();
        App2 app = factory.getAppInstance();
        app.open("Hello.doc");

        app = new TextEditAppFactory().getAppInstance();
        app.open("Hello.xml");
    }
}
