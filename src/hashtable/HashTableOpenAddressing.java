package hashtable;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class HashTableOpenAddressing<V> {
  private int capacity = 40;
  private Pair<V>[] pairs;
  private int size;

  public HashTableOpenAddressing() {
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
    if (value == null) {
      System.out.println("Por favor informe um valor a ser guardado");
    } else {
      ensureCapacity();
      int slot = getHash(key);

      while (pairs[slot] != null && pairs[slot].getValue() != null)
        slot = getNextSlot(slot);

      pairs[slot] = new Pair<>(key, value);
      size++;
    }
  }

  public V get(int key) {
    int slot = getHash(key);
      
    while (pairs[slot] != null) {
      if (pairs[slot].getKey() == key && pairs[slot].getValue() != null) {
        return pairs[slot].getValue();
      }

      slot = getNextSlot(slot);
    }
    
    System.out.println("Elemento não encontrado.");
    return null;
  }

  public V remove(int key) {
    int slot = getHash(key);

    while (pairs[slot] != null) {
      if (pairs[slot].getKey() == key && pairs[slot].getValue() != null) {
        V pair = pairs[slot].getValue();
        pairs[slot] = new Pair<>(key, null);
        return pair;
      }

      slot = getNextSlot(slot);
    }
    
    System.out.println("Elemento não encontrado.");
    return null;
  }

  private void ensureCapacity() {
    double loadFactor = (double) (size + 1) / capacity;
    
    if (loadFactor >= 1) {
        capacity *= 2;
        pairs = Arrays.copyOf(pairs, capacity);
    }
  }
}


