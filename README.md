# Projeto de Ordenação de Candidatos

Este projeto em Java realiza a leitura de um arquivo CSV contendo informações de candidatos a um concurso e os ordena pela pontuação obtida. Em caso de empate nas pontuações, o critério de desempate é a idade dos candidatos, onde o candidato mais velho é classificado em uma posição superior.

## Funcionalidades

- **Leitura de Arquivo CSV**: O programa lê um arquivo CSV que contém os dados dos candidatos (Identificador, Nome, Data de Nascimento e Pontuação).
- **Ordenação Personalizada**: A ordenação dos candidatos é feita pela pontuação, e em caso de empate, pela data de nascimento (candidatos mais velhos são priorizados).
- **Algoritmo de Ordenação**: Utiliza o algoritmo de ordenação **Insertion Sort** implementado para ordenar os candidatos.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Java I/O**: Para leitura do arquivo CSV.
- **Java Time API**: Para trabalhar com datas (LocalDate).
- **Algoritmo de Ordenação**: Implementação do Insertion Sort.
  
## Estrutura do Projeto

```plaintext
ordenacaojava/
│
├── src/
│   ├── ordenacaojava/
│   │   ├── Candidato.java   # Classe que representa o candidato
│   │   ├── InsertionSort.java  # Classe que implementa o algoritmo de ordenação Insertion Sort
│   │   └── Main.java  # Classe principal que executa o programa
├── candidatos.csv  # Arquivo de entrada CSV com os dados dos candidatos
├── README.md  # Este arquivo de documentação
