package chapter4.genericsandcollections.autoboxing_unboxing;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dan on 11/13/16.
 */
public class Sample {
    public static void main(String [] args){
        Double d1 = new Double(12.67);
        System.out.println(d1.compareTo(21.68));
        // value passes to compareTo() is autoboxed to wrapper class

        ArrayList<Double> list = new ArrayList<>();
        // following is autoboxed
        list.add(12.12);
        list.add(11.24);
        Double total = 0.0;
        for(Double d : list){
            // unboxed using += operator
            total += d;
        }


        // Unboxing
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(new Double(12.12D));
        list2.add(new Double(11.24D));
        Double total2 = Double.valueOf(0.0D);
        for(Iterator iterator = list2.iterator(); iterator.hasNext();){
            Double d = (Double) iterator.next();
            total += total.doubleValue() + d.doubleValue();
        }
    }
}
