package chapter4.genericsandcollections.collections_framework;

import java.util.*;

/**
 * Created by dan on 11/12/16.
 */
public class LinkedHashSets {
    public static void main(String [] args){
        Set<City> route = new LinkedHashSet<>();

        route.add(new City("Seattle"));
        route.add(new City("Copenhagen"));
        route.add(new City("New Delhi"));

        List<City> extendedRoute = new ArrayList<>();
        extendedRoute.add(new City("Beijing"));
        extendedRoute.add(new City("Tokyo"));

        route.addAll(extendedRoute);

        Iterator<City> iterator = route.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // returns false as class City does not override method equals()
        System.out.println(route.contains(new City("Seattle")));
    }
}

class City {
    String name;
    City(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
