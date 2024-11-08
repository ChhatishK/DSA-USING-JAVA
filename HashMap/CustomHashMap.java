import java.util.*;

class Hashmap<K, V> {

    private class Node {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int DEFAULT_CAPACITY = 8;
    private static final float DEFUALT_LOAD_FACTOR = 0.75f;
    private LinkedList<Node>[] buckets;
    private int size;

    Hashmap() {
        initBucket(DEFAULT_CAPACITY);
    }

    Hashmap(int initialCapaicty) {
        initBucket(initialCapaicty);
    }

    public void rehash() {
        LinkedList<Node>[] oldBucket = buckets;
        initBucket(oldBucket.length*2);
        size = 0;
        for (var bucket : buckets) {
            for (Node node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    private void initBucket(int N) {
        buckets = new LinkedList[N];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int BucketIndex(K key) {
        int hash_code = key.hashCode();
        int bucket_idx = Math.abs(hash_code)%buckets.length;
        return bucket_idx;
    }

    private int searchInBucket(K key, LinkedList<Node> ll) {

        for (int i=0; i<ll.size(); i++) {
            if (ll.get(i).key == key) {
                return i;
            }
        }
        return -1;
    }

    public void put(K key, V value) {
        // insert and update in map
        int bucket_idx = BucketIndex(key);
        LinkedList<Node> currBucket = buckets[bucket_idx];
        int existed_idx = searchInBucket(key, currBucket);

        if (existed_idx == -1) {
            Node node = new Node(key, value);
            currBucket.add(node);
            size++;
        } else {
            Node currNode = currBucket.get(existed_idx);
            currNode.value = value;
        }

        if (size >= buckets.length*DEFUALT_LOAD_FACTOR) {
            rehash();
        }
    }

    public V get(K key) {
        int bucket_idx = BucketIndex(key);
        LinkedList<Node> currBucket = buckets[bucket_idx];
        int existed_idx = searchInBucket(key, currBucket);

        if (existed_idx != -1) {
            Node currNode = currBucket.get(existed_idx);
            return currNode.value;
        } else {
            return null;
        }
    }

    public V remove(K key) {
        int bucket_idx = BucketIndex(key);
        LinkedList<Node> currBucket = buckets[bucket_idx];
        int existed_idx = searchInBucket(key, currBucket);

        if (existed_idx == -1) {
            return null;
        } else {
            Node currNode = currBucket.get(existed_idx);
            V val = currNode.value;
            size--;
            currBucket.remove(currNode);
            return val;
        }
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        int bucket_idx = BucketIndex(key);
        LinkedList<Node> currBucket = buckets[bucket_idx];
        int existed_idx = searchInBucket(key, currBucket);
        if (existed_idx == -1) return false;
        else return true;
    }

    public int initialCapacity() {
        return DEFAULT_CAPACITY;
    }

    public float loadFactor() {
        return DEFUALT_LOAD_FACTOR;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public LinkedList<K> keySet() {
        LinkedList<K> keyset = new LinkedList<>();
        for (var bucket : buckets) {
            for (Node node : bucket) {
                keyset.add(node.key);
            }
        }
        return keyset;
    }

    public LinkedList<V> entries() {
        LinkedList<V> entry = new LinkedList<>();
        for (var bucket : buckets) {
            for (Node node : bucket) {
                entry.add(node.value);
            }
        }

        return entry;
    }

    public void clear() {
        initBucket(DEFAULT_CAPACITY);
    }

    public ArrayList<String> entrySet() {
        ArrayList<String> entries = new ArrayList<>();
        for (var bucket: buckets) {
            for (Node node : bucket) {
                String ele = node.key +"="+node.value;
                entries.add(ele);
            }
        }

        return entries;
    }
}

public class CustomHashMap {
    public static void main(String args[]) {
        Hashmap<String, Integer> mp = new Hashmap<>();

        mp.put("a", 1); // add/update in the map.
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("c", 30);
        mp.put("d", 23);
        mp.put("e", 43);
        mp.put("f", 53);
        System.out.println(mp.get("d")); // return value of given key if exists otherwise returns null.
        System.out.println(mp.remove("e")); // remove key from map if exists and return value otherwise returns null.
        System.out.println("Size: "+mp.size()); // returns current size of map.
        System.out.println(mp.containsKey("A"));  // returns boolean value if key exists otherwise false.
        System.out.println(mp.keySet()); // returns all keys from the map.
        System.out.println(mp.entries()); // return all value from the map.
        mp.clear(); // Make the map empty.
        System.out.println(mp.entrySet()); // returns key value pair of the map.
    }
}
