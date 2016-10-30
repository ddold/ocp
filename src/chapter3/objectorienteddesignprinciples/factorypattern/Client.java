package chapter3.objectorienteddesignprinciples.factorypattern;

/**
 * Created by dan on 10/30/16.
 */
interface App {
    void open(String filename);
}

class WordProcessor implements App {
    @Override
    public void open(String filename){
        System.out.println("Launch WordProcessor using " + filename);
    }
}

class TextEditor implements App {
    @Override
    public void open(String filename) {
        System.out.println("Launch TextEditor using " + filename);
    }
}

class AppFactory {
    public static App getAppInstance(String fileExtn){
        App appln = null;
        if(fileExtn.equals(".doc")){
            appln = new WordProcessor();
        } else if(fileExtn.equals(".txt") || fileExtn.equals(".xml")){
            appln = new TextEditor();
        }
        return appln;
    }
}

public class Client {
    public static void main(String[] args){
        App app = AppFactory.getAppInstance(".doc");
        app.open("Hello.doc");
        App app2 = AppFactory.getAppInstance(".xml");
        app2.open("Hello.xml");
    }

}
