package chapter4.genericsandcollections.maps;

import java.util.*;

/**
 * Created by dan on 11/12/16.
 */
public class HashMaps {
    public static void main(String [] args){
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Paul", 8888.8);
        salaryMap.put("Shreya", 99999.9);
        salaryMap.put("Selvan", 5555.5);

        // HashMap constructor can contain Map object
        Map<String, Double> copySalaryMap = new HashMap<>(salaryMap);

        Set<String> keys = copySalaryMap.keySet();
        for(String k : keys){
            System.out.println(k);
        }

        // remove element from salaryMap - it won't effect copySalaryMap
        salaryMap.remove("Paul");

        keys = copySalaryMap.keySet();
        for(String k : keys){
            System.out.println(k);
        }

        // Both lines work the same
        Map<String, List<Double>> map = new HashMap<>();
        Map<String, List<Double>> map2 = new HashMap<String, List<Double>>();

        // The following won't
        //Map<String, List<Double>> map3 = new HashMap<<>, List<>>();
        //Map<String, List<Double>> map4 = new HashMap<String, List<>>();
        //Map<String, List<Double>> map5 = new HashMap<String, ArrayList<Double>>();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        Map<String, List<IceCream>> iceCreamMap = new HashMap<>();
        List<IceCream> iceCreamList = new ArrayList<>();
        iceCreamList.add(IceCream.CHOCOLATE);
        iceCreamList.add(IceCream.WALNUT);
        iceCreamList.add(IceCream.STRAWBERRY);

        iceCreamMap.put("Shreya", iceCreamList);
        System.out.println(iceCreamMap.get("Shreya"));

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Not overriding hashCode() or equals()");

        Map<Emp, Emp> empMgrMap = new HashMap<>();
        empMgrMap.put(new Emp("Shreya"), new Emp("Selvan"));
        System.out.println(empMgrMap.get(new Emp("Shreya")));
        // prints null because hashCode() and equals() not implemented

        Map<Emp2, Emp2> empMgrMap2 = new HashMap<>();
        empMgrMap2.put(new Emp2("Shreya"), new Emp2("Selvan"));
        System.out.println(empMgrMap2.get(new Emp2("Shreya")));
        // prints proper value because hashCode() and equals() overriden

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Adding duplicate or null keys");

        Map<String, Double> map1 = new HashMap<>();
        map1.put("Paul", 8888.8);
        map1.put("Paul", 99999.9);
        System.out.println(map1.get("Paul"));

        map1.put(null, 88.8);
        map1.put(null, 99.9);
        System.out.println(map1.get(null));
        String s = null;
        map1.put(null, 77.7);
        System.out.println(map1.get(s));

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Removing HashMap entries with remove() and clear()");

        System.out.println(map1.remove("Paul"));

        Map<List, String> flavorNameMap = new HashMap<>();
        flavorNameMap.put(iceCreamList, "Shreya");

        List<IceCream> iceCreamList1 = new ArrayList<>();
        iceCreamList1.add(IceCream.CHOCOLATE);
        iceCreamList1.add(IceCream.WALNUT);
        iceCreamList1.add(IceCream.STRAWBERRY);

        System.out.println(flavorNameMap.remove(iceCreamList1));

        Map<String, Double> maps = new HashMap<>();
        maps.put("Paul", 88.8);
        maps.put("Shreya", 99.9);
        maps.clear();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Copying another Map object");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Shreya");
        map3.put(11, "Paul");
        System.out.println("Value at 1 from map3 is " + map3.get(new Integer(1)));

        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(1, "Harry");
        System.out.println("Value at 1 from anotherMap is " + anotherMap.get(new Integer(1)));

        anotherMap.putAll(map3);
        System.out.println("Value at 1 from anotherMap after copying map3 is " + anotherMap.get(new Integer(1)));

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Retrieving Keys, Values and Key-Value pairs");

        Map<Color, String> colorMap = new HashMap<>();
        colorMap.put(Color.RED, "Passion");
        colorMap.put(Color.BLUE, "Stability");
        colorMap.put(Color.YELLOW, "Energy");

        Collection<String> mood = colorMap.values();
        Set<Color> colors = colorMap.keySet();
        Set<Map.Entry<Color, String>> colorMood = colorMap.entrySet();

        for(String st : mood){
            System.out.println(st);
        }

        for(Color c : colors){
            System.out.println(c);
        }

        for(Map.Entry pair : colorMood){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}

enum Color {
    RED,
    BLUE,
    YELLOW
}

enum IceCream {
    CHOCOLATE,
    STRAWBERRY,
    WALNUT
}

class Emp {
    String name;
    Emp(String name){
        this.name = name;
    }
}

class Emp2 {
    String name;
    Emp2(String name){
        this.name = name;
    }
    public int hashCode(){
        return name.hashCode();
    }
    public boolean equals(Object o){
        if(o instanceof Emp2){
            return ((Emp2) o).name.equals(name);
        } else {
            return false;
        }
    }
    public String toString(){
        return name;
    }
}

