# Calculadora Java

Projeto de uma calculadora desenvolvida em Java, com operações matemáticas básicas e testes automatizados utilizando JUnit 5.

## Funcionalidades

- Soma de dois números.
- Subtração de dois números.
- Multiplicação de dois números.
- Divisão de dois números.
- Tratamento de exceção para divisão por zero.

## Tecnologias utilizadas

- **Java 21** — linguagem de programação.
- **Maven** — gerenciamento do projeto e execução dos testes.
- **JUnit 5** — testes automatizados.
- **Git** — controle de versão.

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- JDK 21 ou compatível com a configuração do projeto.
- Maven 3.8.7 ou versão compatível.
- Git.

Para conferir as versões instaladas:

```bash
java -version
mvn -version
git --version
```

## Como executar os testes

Na pasta raiz do projeto, execute:

```bash
mvn test
```

Os testes automatizados verificam as operações matemáticas e o tratamento da divisão por zero.

Para limpar os arquivos gerados anteriormente e executar os testes novamente:

```bash
mvn clean test
```

## Estrutura do projeto

```text
calculadora-java/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   └── java/
    │       ├── Calculadora.java
    │       └── Main.java
    └── test/
        └── java/
            ├── CalculadoraTest.java
            └── TesteCalculadora.java
```

## Objetivo

Este projeto faz parte dos meus estudos de Java e Programação Orientada a Objetos, com foco na prática de testes automatizados, gerenciamento de dependências com Maven e controle de versão com Git.

## Autor

[**Nadson-dotcom**](https://github.com/Nadson-dotcom)

---

Projeto desenvolvido para fins de aprendizado e prática de desenvolvimento de software.
