package OopsPractice;

public class Generics <K,V> {
//    private Object value;
//
//    public Object getValue(){
//        return value;
//    }
//    public void setValue(Object value){
//        this.value=value;
//    }
//    private T value;
//    public T getValue(){
//        return value;
//    }
//    public void setValue(T value){
//        this.value=value;
//    }
    private K key;
    private V value;

    public Generics (K key, V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
