package hashtable;

import java.util.Arrays;

import binarytree.BinarySearchTree;

@SuppressWarnings("unchecked")

public class BinaryTree<V> extends HashTable<V> {
  private BinarySearchTree<V>[] pairs;

  public BinaryTree() {
    pairs = new BinarySearchTree[capacity];
    size = 0;
  }

  @Override
  public void ensureCapacity() {
    double loadFactor = (double) (size + 1) / capacity;
    
    if (loadFactor >= 1) {
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

      if (pairs[slot] == null) {
        BinarySearchTree<V> bt = new BinarySearchTree<>();
        bt.add(key, value);
        pairs[slot] = bt;
      } else {
        BinarySearchTree<V> bt = pairs[slot];
        bt.add(key, value);
      }

      size++;
    }
  } 

  @Override
  public V get(int key) {
    int slot = getHash(key);
      
    if (pairs[slot] != null) {
      BinarySearchTree<V> bt = pairs[slot];
      return bt.search(key);
    }
    
    System.out.println("Elemento não encontrado.");
    return null;
  }

  @Override
  public V remove(int key) {
    int slot = getHash(key);

    if (pairs[slot] != null) {
      BinarySearchTree<V> bt = pairs[slot];
      return bt.remove(key);
    }
    
    System.out.println("Elemento não encontrado.");
    return null;
  }
  
}
