package binarytree;

public class BinarySearchTree<V> {
  private Node<V> root;
  private V removedData;

  public BinarySearchTree() {
    root = null;
  }

  // Metodos privados da árvore que usam recursão para percorrê-la

  private Node<V> add(Node<V> node, int key, V data) {
    if (node == null) {
      return new Node<>(key, data);
    }

    if (key > node.key) {
      node.right = add(node.right, key, data);
    } else if(key < node.key) {
      node.left = add(node.left, key, data);
    } else {
      node.data = data;
    }

    return node;
  }

  private V search(Node<V> node, int key) {
    if (node == null) {
      return null;
    }
    
    if (key > node.key) {
      return search(node.right, key);
    } else if (key < node.key) {
      return search(node.left, key);
    } else
      return node.data;
  }

  private int minValue(Node<V> node) {
    int minValue = node.key;

    while (node.left != null) {
      minValue = node.left.key;
      node = node.left;
    }

    return minValue;
  }

  private Node<V> remove(Node<V> node, int key) {
    if (node == null) {
      System.out.println("Elemento não encotrado.");
      removedData = null;
      return node;
    }

    if (key > node.key)
      node.right = remove(node.right, key);
    else if (key < node.key)
      node.left = remove(node.left, key);
    else {
      removedData = node.data;
      if (node.left == null)
        return node.right;
      else if (node.right == null)
        return node.left;

      int minValue = minValue(node.right);
      node.key = minValue;
      node.right = remove(node.right, minValue);
    }

    return node;
  }
  
  private void print(Node<V> node, int space) {
    if (node == null) {
      return;
    }

    // Aumenta o espaço entre os níveis
    space += 5;

    // Imprime o nó da direita primeiro
    print(node.right, space);

    // Imprime o nó atual com espaço
    for (int i = 5; i < space; i++) {
      System.out.print(" ");
    }
    System.out.println(node.key);

    // Imprime o nó da esquerda
    print(node.left, space);
  }

  // Metodos públicos para chamar os métodos privados da árvore

  public void add(int key, V data) {
    root = add(root, key, data);
  }

  public V search(int key) {
    return search(root, key);
  }

  public V remove(int key) {
    root = remove(root, key);
    return removedData;
  }

  public void print() {
    print(root, 0);
  }
}
