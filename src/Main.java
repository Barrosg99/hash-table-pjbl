// import binarytree.BinaryTree;
import hashtable.HashTable;
public class Main {
  public static void main(String[] args) {
    HashTable<Aluno> hash = new HashTable<>();
    Aluno al = new Aluno(1, "Gabriel");
    Aluno al2 = new Aluno(2, "Julia");
    Aluno al6 = new Aluno(9, "Helena");
    hash.add(al.id, al);
    hash.add(al2.id, al2);
    hash.add(al6.id, al6);
    Aluno get = hash.get(al6.id);
    System.out.println(get.nome);
    Aluno remove = hash.remove(al2.id);
    System.out.println(remove.nome);
  } 
}