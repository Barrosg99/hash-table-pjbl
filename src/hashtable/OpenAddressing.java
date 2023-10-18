package hashtable;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class OpenAddressing<V> extends HashTable<V> {

  private class Pair<S> {
    public int key;
    public S value;

    public Pair(int key, S value) {
      this.key = key;
      this.value = value;
    }
  }

  private Pair<V>[] pairs;

  public OpenAddressing() {
    pairs = new Pair[capacity];
  }

  @Override
  public void ensureCapacity() {
    double loadFactor = (double) (size + 1) / capacity;
    
    if (loadFactor >= 0.7) {
        capacity *= 2;
        pairs = Arrays.copyOf(pairs, capacity);
    }
  }

  @Override
  public void add(int key, V value) {
    if (value == null) {
      System.out.println("Por favor informe um valor a ser guardado");
    } else {
      ensureCapacity();
      int slot = getHash(key);

      while (pairs[slot] != null && pairs[slot].value != null && pairs[slot].key != key)
        slot = getNextSlot(slot);

      if (pairs[slot] != null && pairs[slot].key == key) {
        pairs[slot] = new Pair<>(key, value);
      } else {
        pairs[slot] = new Pair<>(key, value);
        size++;
      }
      
    }
  }  

  @Override
  public V get(int key) {
    int slot = getHash(key);
      
    while (pairs[slot] != null) {
      if (pairs[slot].key == key && pairs[slot].value != null) {
        return pairs[slot].value;
      }

      slot = getNextSlot(slot);
    }
    
    System.out.println("Elemento não encontrado.");
    return null;
  }

  @Override
  public V remove(int key) {
    int slot = getHash(key);

    while (pairs[slot] != null) {
      if (pairs[slot].key == key && pairs[slot].value != null) {
        V pair = pairs[slot].value;
        pairs[slot] = new Pair<>(key, null);
        size--;
        return pair;
      }

      slot = getNextSlot(slot);
    }
    
    System.out.println("Elemento não encontrado.");
    return null;
  }

  
}