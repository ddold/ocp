package chapter4.genericsandcollections.creating_generic_entities;

/**
 * Created by dan on 11/3/16.
 */
public interface GenericInterface<K, V> {
    void put(K key, V value);
    V get(K key);
}

class MapLegendNonGeneric implements GenericInterface<String, Integer>{
    /**
     * String is the key
     * Integer is the value
     *
     * Overridden methods automatically put in to params
     */
    @Override
    public void put(String key, Integer value) {}

    // If you change the return type, it won't compile
    @Override
    public Integer get(String key) {
        return null;
    }
}

class MapLegendGeneric<K, V> implements GenericInterface<K, V>{

    @Override
    public void put(K key, V value) {

    }

    @Override
    public V get(K key) {
        return null;
    }
}

class MapLegendHalfGeneric<V> implements GenericInterface<String, V>{

    @Override
    public void put(String key, V value) {

    }

    @Override
    public V get(String key) {
        return null;
    }
}

class MapLegendHalfGeneric2<K> implements GenericInterface<K, Integer>{

    @Override
    public void put(K key, Integer value) {

    }

    @Override
    public Integer get(K key) {
        return null;
    }
}