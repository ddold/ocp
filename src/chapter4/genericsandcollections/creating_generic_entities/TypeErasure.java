package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/10/16.
 */
public class TypeErasure <T> {
    private T t;
    TypeErasure(T t){
        this.t = t;
    }

    public <E> void deliver(E[] array) {
        for(E item : array){}
    }
}

interface Maps<K extends String, V> {
    void put(K key, V value);
    V get(K key);
}
/**
 * When this class is compiled it is changed to the following;
 *  public class TypeErasure {
 *      private Object t;
 *      TypeErasure(Object t){
 *          this.t = t;
 *      }
 *  }
 *
 * Interface;
 *  interface Maps {
 *      void put(String key, Object value);
 *      Object get(String key);
 *  }
 * Notice how K extends String and not it is not assigned Object value but String
 *
 * Methods;
 *  public void deliver(Object[] array){
 *      for(Object item : array){}
 *  }
 */
