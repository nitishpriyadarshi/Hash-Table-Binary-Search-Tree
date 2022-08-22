package Bridgelab.findFrequencylargePaqragraph;

public class Node {

 K key;
    V value;
    com.bridgelabz.findFrequencylargePaqragraph.myNode<K, V> next;

    public myNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public com.bridgelabz.hashTable.myNode<K, V> getNext() {
        return next;
    }

    public void setNext(com.bridgelabz.hashTable.myNode<K, V> next) {
        this.next = (com.bridgelabz.hashTable.myNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nK=").append(key).append(" V=").append(value);
        if(next != null)
            builder.append(next);
        return builder.toString();
    }
}
