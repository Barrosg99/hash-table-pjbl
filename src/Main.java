import hashtable.BinaryTree;
import hashtable.OpenAddressing;
public class Main {
  public static void main(String[] args) {
    // OpenAddressing<Aluno> hash = new OpenAddressing<>();
    BinaryTree<Aluno> hash = new BinaryTree<>();
    Aluno al = new Aluno(1, "Gabriel");
    Aluno al2 = new Aluno(11, "Julia");
    Aluno al3 = new Aluno(21, "Helena");
    Aluno al4 = new Aluno(31, "Lucas");
    Aluno al5 = new Aluno(41, "Sophia");

    hash.add(al.getId(), al);
    hash.add(al2.getId(), al2);
    hash.add(al3.getId(), al3);
    hash.add(al4.getId(), al4);
    hash.add(al5.getId(), al5);

   

    System.out.println(hash.get(al3.getId()).getNome());
    System.out.println(hash.remove(al3.getId()).getNome());
    System.out.println(hash.get(al3.getId()));
    // hash.add(al3.getId(), al);

    
    System.out.println(hash.get(al5.getId()).getNome());
  } 
}