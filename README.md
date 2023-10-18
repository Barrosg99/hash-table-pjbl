# Estrutura de Dados - Implementação de Tabela de Hash e Árvore Binária em Java

Este projeto Java é uma implementação de estruturas de dados fundamentais, incluindo uma tabela de hash (hash table) com tratamento de colisões por endereçamento aberto (open addressing) e uma árvore binária de busca (binary search tree).

## Classes Implementadas

### `HashTable<V>`

- Classe abstrata que serve como base para a implementação da tabela de hash.
- Define operações básicas, como adicionar (add), buscar (get) e remover (remove) elementos.
- Inclui um método abstrato `ensureCapacity` para garantir que a tabela de hash tenha capacidade suficiente para adicionar elementos.
- Usa a capacidade padrão de 10 e realiza o redimensionamento quando necessário.

### `OpenAddressing<V>`

- Implementação concreta da tabela de hash com tratamento de colisões por endereçamento aberto.
- Usa um array de pares chave-valor para armazenar os elementos.
- Implementa o método `ensureCapacity` para redimensionar a tabela quando necessário.
- Inclui operações para adicionar, buscar e remover elementos.
- Utiliza uma classe interna `Pair` para representar pares chave-valor.

### `BinaryTree<V>`

- Implementação de uma árvore binária de busca (binary search tree).
- Usa uma árvore de busca binária para armazenar elementos.
- Implementa o método `ensureCapacity` para redimensionar a árvore quando necessário.
- Inclui operações para adicionar, buscar e remover elementos.
- Permite armazenar dados genéricos associados a chaves inteiras.

### `BinarySearchTree<V>`

- Implementação da árvore de busca binária.
- Inclui operações de adicionar, buscar e remover elementos na árvore.
- Usa uma classe interna `Node` para representar os nós da árvore.

### `Node<V>`

- Classe que representa um nó em uma árvore de busca binária.
- Armazena uma chave inteira e um valor genérico.
- Contém referências para os nós filhos esquerdo e direito.

### `Aluno`

- Classe de exemplo que representa um aluno com um ID e um nome.

## Uso do Programa de Linha de Comando

Para utilizar este programa, você pode seguir estas etapas:

1. Compile os arquivos-fonte Java.
2. Execute a classe `Main` para interagir com a tabela de hash e a árvore binária.

## Contribuição

Você é bem-vindo(a) a contribuir com melhorias ou correções neste projeto. Sinta-se à vontade para abrir uma pull request e teremos o prazer de revisar suas contribuições.
