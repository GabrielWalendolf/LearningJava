# Notas:
## Introdução ao Java
* Aprender git e github.
* Anotar tudo o que aprendi nas aulas nesse arquivo .md

# 1 - Orientação a objetos:

A POO é um paradigma que organiza o código se baseando em "objetos" que representam entidades do mundo real ou abstrações lógicas.
Esses objetos:

* **Têm atributos** (características);
* **Têm métodos** (ações que executam);
* **Pertencem a classes** que funcionam como moldes.
 
**O objetivo principal:** Tornar o código mais organizado, reutilizável, escalável e fácil de manter.

# 2 - Classes e Objetos:

### Classe:
É o **molde** ou **estrutura** que define oque um objeto vai ter e fazer.
Explo em Java:

    public class Pessoa {
    String nome;
    int idade;
    
        void falar() {
            System.out.println("Olá, meu nome é " + nome);
        }
    }
### Objeto:
É uma instância da classe, ou seja, um exemplo concreto.

    Pessoa p1 = new Pessoa();
    p1.nome = "Gabriel";
    p1.idade = 19;
    p1.falar();  // Saída: Olá, meu nome é Gabriel

## 3 - Construtores e Encapsulamento:

### Construtores:
Método especial chamado automaticamente ao criar um objeto.
Serve para inicializar os atributos.

    public class Pessoa {
    String nome;
    
        // Construtor
        public Pessoa(String nome) {
            this.nome = nome;
        }
    }
    Pessoa p = new Pessoa("Gabriel");

### Encapsulamento:
Consiste em esconder os atributos da classe e fornecer métodos públicos de acesso/modificação, como os famosos getters e setters.

    public class Pessoa {
    private String nome;
    
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
    }

Vantagem: protege os dados e permite validações antes de alterá-los.

## 4 - Associações, Agregação e Composição:
Essas três  representam relacionamentos entre classes.

### Associação:
Relacionamento genérico entre duas classes.

    class Pessoa {
    Carro carro;
    }

### Agregação:
Uma classe possui outra, mas ela pode existir separadamente.

    class Departamento {
    List<Funcionario> funcionarios;
    }

### Composição 
Uma classe é parte fundamental de outra. Se a principal for destruída, a outra também.

    class Casa {
    Quarto quarto = new Quarto();
    }

O quarto não existe sem a casa.

## 5 - Diagrama de Classes e de Objetos (UML):
### Diagrama de Classes:
Mostra as classes, atributos, métodos e os relacionamentos entre elas. É estático e muito usado em projetos de software.
Exemplo visual:
    
    +------------------+
    |     Pessoa       |
    +------------------+
    | - nome: String   |
    | - idade: int     |
    +------------------+
    | +falar(): void   |
    +------------------+
    
    Relacionamento: Pessoa — possui —> Carro

### Diagrama de Objetos:
Mostra exemplos concretos de objetos em um determinado momento, com valores reais nos atributos.
Exemplo:

    p1: Pessoa
    nome = "Gabriel"
    idade = 19





















