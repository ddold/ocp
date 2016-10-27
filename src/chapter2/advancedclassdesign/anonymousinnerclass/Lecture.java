package chapter2.advancedclassdesign.anonymousinnerclass;

/**
 * Created by dan on 10/27/16.
 */
class Pen {
    public void write() {
        System.out.println("Pen-write");
    }
}

public class Lecture {
    // How instance is normally created
    Pen pen = new Pen();

    Pen pen2 = new Pen(){
        public void write() {
            System.out.println("Writing with a pen");
        }
    };

    static Pen pen3 = new Pen(){};

    public void notes(Pen pen){
        pen.write();
    }

    public static void main(String [] args){
        // Returns Pen object
        System.out.println(new Pen());

        // Returns instance of anon inner class that extends Pen
        System.out.println(pen3);

        new Student().attendLecture();
    }
}

class Student {
    void attendLecture() {
        Lecture lecture = new Lecture();
        lecture.notes(new Pen() {
            public void write() {
                System.out.println("Okay I am writing");
            }
        });
    }
}