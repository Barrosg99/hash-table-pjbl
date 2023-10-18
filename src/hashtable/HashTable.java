package hashtable;

public abstract class HashTable<V> {
  int capacity = 60000;
  int size = 0;
   
  int getHash(int key) {
    return key % capacity;
    // return 1;
  }

  int getNextSlot(int slot) {
    return (slot + 1) % capacity;
    // return slot + 1;
  }

  public abstract void ensureCapacity();

  public abstract void add(int key, V value);

  public abstract V get(int key);

  public abstract V remove(int key);

}
