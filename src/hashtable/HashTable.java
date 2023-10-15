package hashtable;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class HashTable<V> {
  private int capacity = 2;
  private Pair<V>[] pairs;
  private int size;

  public HashTable() {
    pairs = new Pair[capacity];
    size = 0;
  }

  private int getHash(int key) {
    return key % capacity;
  }

  private int getNextSlot(int slot) {
    return (slot + 1) % capacity;
  }

  public void add(int key, V value) {
    size++;

    ensureCapacity();
    int slot = getHash(key);

    while (pairs[slot] != null)
      slot = getNextSlot(slot);

    pairs[slot] = new Pair<>(key, value);
  }

  public V get(int key) {
    int slot = getHash(key);
      
    while (pairs[slot] != null) {
      if (pairs[slot] != null && pairs[slot].getKey() == key) {
        return pairs[slot].getValue();
      } else if (pairs[slot] == null)
        break;
      slot = getNextSlot(slot);
    }
    
    System.out.println("Elemento não encontrado.");
    return null;
  }

  public V remove(int key) {
    int slot = getHash(key);

    while (pairs[slot] != null) {
      if (pairs[slot] != null && pairs[slot].getKey() == key) {
        V pair = pairs[slot].getValue();
        pairs[slot] = null;
        return pair;
      } else if (pairs[slot] == null) {
        System.out.println("Elemento não encontrado.");
        break;
      }

      slot = getNextSlot(slot);
    }
    
    return null;
  }

  private void ensureCapacity() {
    double loadFactor = (double) size / capacity;
    
    if (loadFactor >= 0.7) {
        capacity *= 2;
        pairs = Arrays.copyOf(pairs, capacity);
    }
  }
}


