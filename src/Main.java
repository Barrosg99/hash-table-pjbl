// import binarytree.BinaryTree;
import hashtable.HashTable;
public class Main {
  public static void main(String[] args) {
    HashTable<Aluno> hash = new HashTable<>();
    Aluno al = new Aluno(1, "Gabriel");
    Aluno al2 = new Aluno(2, "Julia");
    Aluno al6 = new Aluno(9, "Helena");
    hash.add(al.getId(), al);
    hash.add(al2.getId(), al2);
    hash.add(al6.getId(), al6);
    Aluno get = hash.get(al6.getId());
    System.out.println(get.getNome());
    Aluno remove = hash.remove(al2.getId());
    System.out.println(remove.getNome());
  } 
}