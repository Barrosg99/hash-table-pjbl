package binarytree;

public class Node<V> {
  public int key;
  public V data;
  
  public Node<V> left;
  public Node<V> right;

  public Node(int key, V data) {
    this.key = key;
    this.data = data;
    left = right = null;
  }
}