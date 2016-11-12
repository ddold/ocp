package chapter4.genericsandcollections.creating_generic_entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dan on 11/11/16.
 */
public class SubtypingGenerics {
    List list = new ArrayList();                        // Allowed
    Object object = new String();                       // Allowed
    List list2 = new ArrayList<String>();               // Allowed
    //Lists<Object> list3 = new ArrayList<String>();     // Not Allowed
}
