package chapter7.java_io_fundamentals.byte_stream_io;

import java.io.*;

/**
 * Created by dan on 12/6/16.
 *
 * Constructors
 * - ObjectInputStream(InputStream in)
 * - ObjectOutputStream(OutputStream out)
 *
 * Class must implement Serializable interface to write to a file
 * If the class doesn't implement and tries to write object NotSerializableException is thrown
 */
public class ObjectIOStreams {
    static File file = new File("/home/dan/IdeaProjects/OCP/src/chapter7/java_io_fundamentals/byte_stream_io");
    public static void main(String [] args){
        try (
                FileOutputStream fos = new FileOutputStream(new File(file, "object.data"));
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(new File(file, "object.data"));
                ObjectInputStream ois = new ObjectInputStream(fis)
             )
        {

            Car c = new Car();
            oos.writeObject(c);
            oos.flush();
            Car c2 = (Car) ois.readObject();
            System.out.println(c2);

            // If the class being wrote to a file extends another class
            // and the base class doesn't implement Serializable - it will all work fine as expected

            System.out.println(c2.name + " : " + c2.model);

            /**
             * class AnotherCar can't be written to a file because it has nonserializable data member - Engine
             *
             * The following will throw a NonSerializableException
             *   AnotherCar aCar = new AnotherCar()
             *   oos.writeObject(aCar)
             *   oos.flush()
             *
             *
             * Can read and write Primitive data and Objects to file
             * Must be read in the order they were put in
             */

            // Transient variables aren't written to a file
            FinalCar fc = new FinalCar("AAA");
            oos.writeObject(fc);
            oos.flush();

            new FinalCar("BBB");

            FinalCar fc2 = (FinalCar) ois.readObject();
            System.out.println(fc2.name);
            System.out.println(fc2.model + " : " + fc2.days);
            System.out.println(fc2.carCount);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class FinalCar implements Serializable {
    String name;
    transient String model;
    transient int days;
    static int carCount;
    FinalCar(String value){
        name = value;
        model = "some model";
        days = 98;
        ++carCount;
    }
}

class Car extends Vehicle implements Serializable {
    static int count = 0;
    String model = "Luxury";
    Car() {
        count++;
    }
    public String toString() {
        return "Count - " + count;
    }
}

class Vehicle {
    String name = "Vehicle";
}

class AnotherCar extends Vehicle implements Serializable {
    String model = "Luxurious";
    Engine engine = new Engine();
}

class Engine {
    String make = "198760";
}