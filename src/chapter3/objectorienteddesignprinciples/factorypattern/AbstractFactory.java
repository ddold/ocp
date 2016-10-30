package chapter3.objectorienteddesignprinciples.factorypattern;

/**
 * Created by dan on 10/30/16.
 */
interface App3 {
    void open(String filename);
}

class WordProcessor3 implements App3 {
    @Override
    public void open(String filename) {
        System.out.println("Launch WordProcessor using " + filename);
    }
}

class TextEditor3 implements App3 {
    @Override
    public void open(String filename) {
        System.out.println("Launch TextEditor using " + filename);
    }
}

interface Font {}
class RichFont implements Font{}
class RegularFont implements Font{}

abstract class AppFactory3 {
    protected abstract App3 getApp();
    protected abstract Font getFont();

    public App3 getAppInstance(){
        App3 appln = getApp();
        return appln;
    }

    public Font getFontInstance(){
        Font font = getFont();
        return font;
    }
}

class WordAppFactory3 extends AppFactory3 {
    @Override
    protected App3 getApp() {
        return new WordProcessor3();
    }

    @Override
    protected Font getFont() {
        return new RichFont();
    }
}

class TextEditAppFactory3 extends AppFactory3 {
    @Override
    protected App3 getApp() {
        return new TextEditor3();
    }

    @Override
    protected Font getFont() {
        return new RegularFont();
    }
}

public class AbstractFactory {
    public static void main(String [] args){
        AppFactory3 factory1 = new WordAppFactory3();
        App3 app1 = factory1.getAppInstance();
        Font font1 = factory1.getFontInstance();
        System.out.println(app1 + ":" + font1);

        AppFactory3 factory2 = new TextEditAppFactory3();
        App3 app2 = factory2.getAppInstance();
        Font font2 = factory2.getFontInstance();
        System.out.println(app2 + ":" + font2);

    }
}
