package hashtable;

public abstract class HashTable<V> {
  int capacity = 10;
  int size = 0;
   
  int getHash(int key) {
    return key % capacity;
  }

  int getNextSlot(int slot) {
    return (slot + 1) % capacity;
  }

  public abstract void ensureCapacity();

  public abstract void add(int key, V value);

  public abstract V get(int key);

  public abstract V remove(int key);

}
