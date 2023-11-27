package _07_generic._Tesk;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class A {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>("One", 1);
        Pair<Integer, String> pair2 = new Pair<Integer, String>(2, "Two");

        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }
}
