import java.util.LinkedList;

public class P89_HashTableDictionary<K, V> {
    static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry<K, V>>[] table;
    private int capacity; 
    private int size;     

    @SuppressWarnings("unchecked")
    public P89_HashTableDictionary(int capacity) {
        this.capacity = capacity;
        table = (LinkedList<Entry<K, V>>[]) new LinkedList[capacity];
        size = 0;
    
        for (int i = 0; i < capacity; i++){
            table[i] = new LinkedList<>();
        }
    }
    


    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void insert(K key, V value) {
        int index = hash(key);  

        for (Entry<K, V> entry : table[index]){
            if (entry.key.equals(key)) {
                entry.value = value; 
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
        size++;
    }

    public V search(K key) {
        int index = hash(key);  

        for (Entry<K, V> entry : table[index]){
            if (entry.key.equals(key)) {
                return entry.value; 
            }
        }

        return null;
    }


    public void remove(K key) {
        int index = hash(key);  

        Entry<K, V> toRemove = null;
        for (Entry<K, V> entry : table[index]){     
            if (entry.key.equals(key)) {
                toRemove = entry;
                break;
            }
        }

        if (toRemove != null) {
            table[index].remove(toRemove);
            size--;
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (!table[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : table[i]) {
                    System.out.print("{" + entry.key + ": " + entry.value + "} ");
                }
                System.out.println();
            }
        }
    }


    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        P89_HashTableDictionary<String, Integer> dictionary = new P89_HashTableDictionary<>(10);

        dictionary.insert("apple", 100);
        dictionary.insert("banana", 150);
        dictionary.insert("orange", 200);
        dictionary.insert("grape", 250);
        dictionary.insert("cherry", 300);

        System.out.println("Dictionary contents:");
        dictionary.display();

        System.out.println("Search for 'apple': " + dictionary.search("apple"));
        System.out.println("Search for 'mango': " + dictionary.search("mango"));

        dictionary.remove("banana");
        System.out.println("Dictionary contents after removing 'banana':");
        dictionary.display();
    }
}
