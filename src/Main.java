import java.text.DecimalFormat;
import java.util.List;

import hashtable.BinaryTree;
import hashtable.OpenAddressing;
import mockaluno.Aluno;
import mockaluno.Mock;

public class Main {
  public static void main(String[] args) {
    OpenAddressing<Aluno> hashOA = new OpenAddressing<>();
    BinaryTree<Aluno> hashBT = new BinaryTree<>();
   
    List<Aluno> alunos = Mock.mockAlunos(10000);

    // Chamando o método de adicionar em ambas hashtables

    for (Aluno aluno : alunos) {
      hashOA.add(aluno.getId(), aluno);
      hashBT.add(aluno.getId(), aluno);
    }

    // Chamando o método de remover em ambas hashtables

    Aluno removedAlunoOA = hashOA.remove(89911);
    Aluno removedAlunoBT = hashBT.remove(89911);

    // Imprime o objeto removido

    System.out.println(removedAlunoOA.getNome() + ' ' + removedAlunoOA.getId());
    System.out.println(removedAlunoBT.getNome() + ' ' + removedAlunoBT.getId());

    // Tenta pegar o objeto que foi removido

    hashOA.get(89911);
    hashBT.get(89911);

    // Testando eficiencia da função de busca
    // no tratamento de colisão: endereçamento aberto

    long tempoInicial;
    long tempoFinal;

    tempoInicial = System.nanoTime();

    hashOA.get(1000001);

    tempoFinal = System.nanoTime();
    double tempoDeExecucaoOA = (tempoFinal - tempoInicial);

    // Testando eficiencia da função de busca
    // no tratamento de colisão: arvore binaria

    tempoInicial = System.nanoTime();

    hashBT.get(1000001);

    tempoFinal = System.nanoTime();
    double tempoDeExecucaoBT = (tempoFinal - tempoInicial); 
    System.out.println("Tempo de execução OA: " + tempoDeExecucaoOA / 1000000);
    System.out.println("Tempo de execução BT: " + tempoDeExecucaoBT / 1000000);

    DecimalFormat df = new DecimalFormat("#.##");
    
    double efficiency = (tempoDeExecucaoOA - tempoDeExecucaoBT) * 100 / tempoDeExecucaoOA;
    
    String reFormat = df.format(efficiency);

    System.out.println("A busca na hashtableBT é " + reFormat + "% mais eficiente em termos de tempo em comparação com a busca na hashtableOA" );
  } 
}