// import binarytree.BinaryTree;
import hashtable.HashTableOpenAddressing;
public class Main {
  public static void main(String[] args) {
    HashTableOpenAddressing<Aluno> hash = new HashTableOpenAddressing<>();
    Aluno al = new Aluno(1, "Gabriel");
    Aluno al2 = new Aluno(2, "Julia");
    Aluno al3 = new Aluno(3, "Helena");
    Aluno al4 = new Aluno(4, "Lucas");
    Aluno al5 = new Aluno(5, "Sophia");
    Aluno al6 = new Aluno(6, "Pedro");
    Aluno al7 = new Aluno(7, "Isabella");
    Aluno al8 = new Aluno(8, "Matheus");
    Aluno al9 = new Aluno(9, "Mariana");
    Aluno al10 = new Aluno(10, "Enzo");
    Aluno al11 = new Aluno(11, "Lara");
    Aluno al12 = new Aluno(12, "Gustavo");
    Aluno al13 = new Aluno(13, "Alice");
    Aluno al14 = new Aluno(14, "Rafael");
    Aluno al15 = new Aluno(15, "Laura");
    Aluno al16 = new Aluno(16, "Vinicius");
    Aluno al17 = new Aluno(17, "Manuela");
    Aluno al18 = new Aluno(18, "Joaquim");
    Aluno al19 = new Aluno(19, "Eduarda");
    Aluno al20 = new Aluno(20, "Carlos");

    hash.add(al.getId(), al);
    hash.add(al2.getId(), al2);
    hash.add(al3.getId(), al3);
    hash.add(al4.getId(), al4);
    hash.add(al5.getId(), al5);
    hash.add(al6.getId(), al6);
    hash.add(al7.getId(), al7);
    hash.add(al8.getId(), al8);
    hash.add(al9.getId(), al9);
    hash.add(al10.getId(), al10);
    hash.add(al11.getId(), al11);
    hash.add(al12.getId(), al12);
    hash.add(al13.getId(), al13);
    hash.add(al14.getId(), al14);
    hash.add(al15.getId(), al15);
    hash.add(al16.getId(), al16);
    hash.add(al17.getId(), al17);
    hash.add(al18.getId(), al18);
    hash.add(al19.getId(), al19);
    hash.add(al20.getId(), al20);

    Aluno al21 = new Aluno(21, "Raphael");

   

    Aluno get = hash.get(al3.getId());
    System.out.println(get.getNome());
    Aluno remove = hash.remove(al5.getId());
    System.out.println(remove.getNome());

    // hash.add(41, al21);

    
    hash.get(al5.getId());
    System.out.println(hash.get(al10.getId()).getNome());
  } 
}