import java.util.*;

public class CustomHashMap {

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private void initBuckets(int N) { // N - capacity/size of buckets array
            buckets = new LinkedList[N];
            for (int i=0; i<buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            int bi = Math.abs(hc)%buckets.length;
            return bi;
        }


        // Traverse the ll and lookf for a node with key, if found returns it's index otherwise it returns null
        private int searchInBucket(K key, LinkedList<Node> ll) {
            for (int i=0; i<ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }

            return -1;
        }

        private void rehash() {
            LinkedList<Node> [] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            n = 0;
            for (var bucket: oldBuckets) {
                for (var node: bucket) {
                    put(node.key, node.value);
                }
            }
        }


        private LinkedList<Node>[] buckets;
        private int n;

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size() {
            // return number of entries in map
            return n;
        }

        public void put(K key, V value) {
            // insert and update

            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(key, currBucket);

            if (ei != -1) { // key doesn't exist, we have to insert a new node
                Node currNode = currBucket.get(ei);
                currNode.value = value;
                
            } else { // update case
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }

            if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        public V get(K key) {
            // return value of the required type
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(key, currBucket);

            if (ei != -1) { // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            } 
            
            return null;
        }

        public V remove(K key) {
            // remove key if present

            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(key, currBucket);

            if (ei != -1) {
                // key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                n--;
                currBucket.remove(ei);
                return val;
            }

            return null;
        }
    }

    public static void main(String args[]) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();

        System.out.println("Testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        // System.out.println(mp.get("c"));
        mp.put("c", 30);
        mp.put("d", 23);
        mp.put("e", 43);
        mp.put("f", 53);
        System.out.println("Size: "+mp.size());
        // System.out.println(mp.get("d"));
        System.out.println(mp.remove("f"));
        System.out.println(mp.remove("e"));
        System.out.println("Size: "+mp.size());
    }
}