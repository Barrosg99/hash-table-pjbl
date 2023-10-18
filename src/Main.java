import hashtable.BinaryTree;
import hashtable.OpenAddressing;
public class Main {
  public static void main(String[] args) {
    OpenAddressing<Aluno> hashOA = new OpenAddressing<>();
    BinaryTree<Aluno> hashBT = new BinaryTree<>();
    Aluno al = new Aluno(1, "Gabriel");
    Aluno al2 = new Aluno(11, "Julia");
    Aluno al3 = new Aluno(21, "Helena");
    Aluno al4 = new Aluno(31, "Lucas");
    Aluno al5 = new Aluno(41, "Sophia");

    for (int i = 0; i < 12000; i++) {
      hashOA.add(i , al); // 1 51 101
      hashOA.add(i + 1, al2); // 11 61 111
      hashOA.add(i + 2, al3); // 21 71
      hashOA.add(i + 3, al4); // 31 81
      hashOA.add(i + 4, al5); // 41 91

      hashBT.add(i, al);
      hashBT.add(i + 1, al2);
      hashBT.add(i + 2, al3);
      hashBT.add(i + 3, al4);
      hashBT.add(i + 4, al5);
    }

    // System.out.println(hashOA.get(10003).getNome());
    System.out.println(hashOA.remove(5002).getNome());
    // System.out.println(hashOA.get(10003));
    // hashOA.add(5002, al3);

    // System.out.println(hashOA.get(al5.getId()).getNome());


    // System.out.println(hashBT.get(al3.getId()).getNome());
    System.out.println(hashBT.remove(5002).getNome());
    // System.out.println(hashBT.get(al3.getId()));
    // hashBT.add(al3.getId(), al3);

    
    // System.out.println(hashBT.get(al5.getId()).getNome());

    long tempoInicial = System.nanoTime();

    // Chame a função ou o código que deseja medir
    hashOA.get(10003);

    long tempoFinal = System.nanoTime();
    long tempoDeExecucao = (tempoFinal - tempoInicial) / 1_000_000;
    System.out.println(tempoDeExecucao);

    tempoInicial = System.nanoTime();

    // Chame a função ou o código que deseja medir
    hashBT.get(10003);

    tempoFinal = System.nanoTime();
    tempoDeExecucao = (tempoFinal - tempoInicial) / 1_000_000;
    System.out.println(tempoDeExecucao);
    
  } 
}