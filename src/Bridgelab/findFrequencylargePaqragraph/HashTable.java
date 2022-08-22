package Bridgelab.findFrequencylargePaqragraph;
import java.util.ArrayList;

public class HashTable <K, v> {
    myNode head;
    myNode tail;
    private final int numofbuckets;
    ArrayList<myNode<K, V>> myBucketArray;

    public hashTable() {
        this.numofbuckets = 10;
        this.myBucketArray = new ArrayList<>();
        for (int i = 0; i < numofbuckets; i++)
            this.myBucketArray.add(null);
    }

    public void add(K key, V value) {
        int index = this.BucketIndex(key);
        myNode<K, V> myNode = this.myBucketArray.get(index);
        if (myNode == null) {
            myNode = new myNode<>(key, value);
            this.myBucketArray.set(index, myNode);
        }
        myNode = (myNode<K, V>) searchNode(key);
        if (myNode == null) {
            myNode = new myNode<>(key, value);
            this.append(myNode);
        } else {
            myNode.setValue(value);
        }
    }

    public void append(myNode myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public myNode<K, V> searchNode(K data) {
        myNode currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(data)) {
                return currentNode.next;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    // Searching for the word and get the value from the linked list
    public V get(K word) {
        int index = this.BucketIndex(word);
        if (this.myBucketArray.get(index) == null)
            return null;
        myNode<K, V> myMapNode = searchNode(word);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    private int BucketIndex(K word) {
        int hashCode = Math.abs(word.hashCode());
        int index = hashCode % numofbuckets;
        return index;
    }


    @Override
    public String toString() {
        return " \n{" + head + "}";
    }
}
