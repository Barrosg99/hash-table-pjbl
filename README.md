<img src="img/hash.png" alt="logo" width="200"/>

# Projeto de Hashtable com Tratamento de Colisões

Este projeto demonstra a implementação de uma hashtable com tratamento de colisões usando duas abordagens diferentes: endereçamento aberto e árvore binária. O projeto também inclui uma classe de aluno mock para gerar dados de exemplo.

## Estrutura do Projeto

O projeto está organizado em pacotes, cada um contendo classes relacionadas:

- `binarytree`: Contém a implementação da árvore binária usada para a abordagem de tratamento de colisões na hashtable.
- `hashtable`: Contém as classes `OpenAddressing` e `BinaryTree`, que implementam as duas abordagens de tratamento de colisões.
- `mockaluno`: Contém a classe `Aluno` e `Mock` para criar dados de exemplo de alunos.
- `Main.java`: A classe principal que demonstra o uso das duas implementações de hashtable e realiza algumas operações de benchmarking de eficiência.

## Funcionalidades

O projeto inclui as seguintes funcionalidades:

- Inicialização de uma hashtable com tratamento de colisões usando endereçamento aberto ou árvore binária.
- Adição de elementos à hashtable com base em um valor de chave único.
- Remoção de elementos com base na chave.
- Recuperação de elementos com base na chave.
- Benchmarking de eficiência para comparar a eficiência de busca nas duas implementações de tratamento de colisões.

## Como Executar o Projeto

1. Clone o repositório para sua máquina local:

```bash
git clone https://seurepositorio.com/projeto-hashtable.git
```

2. Compile o código:

```bash
cd projeto-hashtable
javac Main.java
```

3. Execute o código:

```bash
java Main
```

Isso executará a classe principal e demonstrará as funcionalidades do projeto.

## Conclusão

Este projeto mostra como implementar uma hashtable com tratamento de colisões usando duas abordagens diferentes e compara a eficiência de busca entre elas. Você pode usar este projeto como referência para entender como implementar estruturas de dados de hashtable com tratamento de colisões em suas próprias aplicações.

Sinta-se à vontade para expandir este projeto e adicionar mais funcionalidades, como redimensionamento automático da hashtable ou outras técnicas de tratamento de colisões, conforme necessário.