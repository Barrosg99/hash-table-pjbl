package binarytree;

public class BinaryTree {
  private Node root;

  public BinaryTree() {
    root = null;
  }

  // Metodos privados da árvore que usam recursão para percorrê-la

  private Node add(Node node, int data) {
    if (node == null) {
      return new Node(data);
    }

    if (data >= node.data) {
      node.right = add(node.right, data);
    } else {
      node.left = add(node.left, data);
    }

    return node;
  }

  private boolean search(Node node, int data) {
    if (node == null) {
      return false;
    }
    
    if (data > node.data) {
      return search(node.right, data);
    } else if (data < node.data) {
      return search(node.left, data);
    } else
      return true;
  }

  private int minValue(Node node) {
    int minValue = node.data;

    while (node.left != null) {
      minValue = node.left.data;
      node = node.left;
    }

    return minValue;
  }

  private Node remove(Node node, int data) {
    if (node == null) {
      return node;
    }

    if (data > node.data)
      node.right = remove(node.right, data);
    else if (data < node.data)
      node.left = remove(node.left, data);
    else {
      if (node.left == null)
        return node.right;
      else if (node.right == null)
        return node.left;

      int minValue = minValue(node.right);
      node.data = minValue;
      node.right = remove(node.right, minValue);
    }

    return node;
  }
  
  private void print(Node node, int space) {
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
    System.out.println(node.data);

    // Imprime o nó da esquerda
    print(node.left, space);
  }

  // Metodos públicos para chamar os métodos privados da árvore

  public void add(int data) {
    root = add(root, data);
  }

  public boolean search(int data) {
    return search(root, data);
  }

  public void remove(int data) {
    root = remove(root, data);
  }

  public void print() {
    print(root, 0);
  }
}
