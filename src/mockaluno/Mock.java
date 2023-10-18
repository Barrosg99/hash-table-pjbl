package mockaluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mock {
  private static List<Integer> generateIds(int quantity) {
    List<Integer> numbers = new ArrayList<>();

    for (int i = 1; i <= quantity; i++) {
      numbers.add(i * 10 + 1);
    }

    return numbers;
  }

  private static List<String> generateNames(int quantidade) {
    List<String> names = new ArrayList<>();
    Random rand = new Random();

    String[] personNames = { "Alice", "Bob", "Carol", "David", "Eva", "Frank", "Grace", "Harry", "Ivy", "Jack" };
    String[] surnames = { "Smith", "Johnson", "Brown", "Lee", "Davis", "Moore", "Hall", "White", "Young",
        "Harris" };

    int numNames = personNames.length;
    int numSurnames = surnames.length;

    for (int i = 0; i < quantidade; i++) {
      String name = personNames[rand.nextInt(numNames)];
      String surname = surnames[rand.nextInt(numSurnames)];
      names.add(name + " " + surname);
    }

    return names;
  }

  public static List<Aluno> mockAlunos(int quantity) {
    List<String> names = generateNames(quantity);
    List<Integer> ids = generateIds(quantity);
    List<Aluno> alunos = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      alunos.add(new Aluno(ids.get(i), names.get(i)));
    }
    return alunos;
  }
}
