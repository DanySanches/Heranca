# 📊 Projeto de Gerenciamento de Pessoas

Bem-vindo ao projeto de gerenciamento de pessoas! Este projeto foi desenvolvido em Java e demonstra a implementação de uma hierarquia de classes para representar diferentes tipos de pessoas em uma empresa, incluindo `Pessoa`, `Fornecedor`, `Empregado`, `Administrador`, `Operario` e `Vendedor`. Cada classe possui atributos e métodos específicos que permitem a manipulação de dados e o cálculo de salários, incluindo bonificações e comissões.

## 🛠️ Estrutura do Projeto

### Classes Principais
- **Pessoa**: Classe base que contém os atributos comuns a todas as pessoas, como `nome`, `endereço` e `telefone`.
- **Fornecedor**: Subclasse de `Pessoa` que adiciona os atributos `valorCredito` e `valorDivida`, além de um método `obterSaldo()` para calcular a diferença entre crédito e dívida.
- **Empregado**: Subclasse de `Pessoa` que inclui os atributos `codigoSetor`, `salarioBase` e `imposto`. Também possui um método `calcularSalario()` que calcula o salário após a dedução dos impostos.
- **Administrador**: Subclasse de `Empregado` que adiciona o atributo `ajudaDeCusto` e redefine o método `calcularSalario()` para incluir esta ajuda no cálculo do salário final.
- **Operario**: Subclasse de `Empregado` que adiciona os atributos `valorProducao` e `comissao`, e redefine o método `calcularSalario()` para incluir a comissão no salário final.
- **Vendedor**: Subclasse de `Empregado` que adiciona os atributos `valorVendas` e `comissao`, e redefine o método `calcularSalario()` para incluir a comissão sobre as vendas no salário final.

## 🚀 Funcionalidades
- **Cálculo de Salário**: Cada classe que herda de `Empregado` tem um método específico para calcular o salário com base em seus atributos adicionais (ajuda de custo, comissão, etc.).
- **Gestão de Fornecedores**: A classe `Fornecedor` permite calcular o saldo entre o crédito concedido e a dívida com o fornecedor.
- **Herança e Polimorfismo**: Demonstra o uso de herança e polimorfismo em Java, com métodos sobrepostos para cálculo de salários em subclasses específicas.

## 🧩 Exemplo de Uso

Aqui está um exemplo de como instanciar e usar as classes do projeto:

```java
public class TesteProjeto {
    public static void main(String[] args) {
        // Criando um fornecedor
        Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "1234-5678", 10000.0, 2500.0);
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());

        // Criando um empregado
        Empregado empregado = new Empregado("Carlos", "Avenida B, 789", "8765-4321", 101, 3000.0, 10.0);
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());

        // Criando um administrador
        Administrador administrador = new Administrador("Ana", "Praça C, 456", "5678-1234", 202, 5000.0, 12.0, 1500.0);
        System.out.println("Salário do Administrador: " + administrador.calcularSalario());

        // Criando um operário
        Operario operario = new Operario("José", "Rua D, 321", "4321-8765", 303, 2000.0, 8.0, 50000.0, 5.0);
        System.out.println("Salário do Operário: " + operario.calcularSalario());

        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Maria", "Rua E, 654", "6789-1234", 404, 2500.0, 9.0, 30000.0, 10.0);
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
    }
}

📦 Estrutura de Diretórios

src/
├── Pessoa.java
├── Fornecedor.java
├── Empregado.java
├── Administrador.java
├── Operario.java
└── Vendedor.java


Aqui está um exemplo de um README.md elaborado para o projeto Java que inclui as classes Pessoa, Fornecedor, Empregado, Administrador, Operario e Vendedor.

markdown
Copiar código
# 📊 Projeto de Gerenciamento de Pessoas

Bem-vindo ao projeto de gerenciamento de pessoas! Este projeto foi desenvolvido em Java e demonstra a implementação de uma hierarquia de classes para representar diferentes tipos de pessoas em uma empresa, incluindo `Pessoa`, `Fornecedor`, `Empregado`, `Administrador`, `Operario` e `Vendedor`. Cada classe possui atributos e métodos específicos que permitem a manipulação de dados e o cálculo de salários, incluindo bonificações e comissões.

## 🛠️ Estrutura do Projeto

### Classes Principais
- **Pessoa**: Classe base que contém os atributos comuns a todas as pessoas, como `nome`, `endereço` e `telefone`.
- **Fornecedor**: Subclasse de `Pessoa` que adiciona os atributos `valorCredito` e `valorDivida`, além de um método `obterSaldo()` para calcular a diferença entre crédito e dívida.
- **Empregado**: Subclasse de `Pessoa` que inclui os atributos `codigoSetor`, `salarioBase` e `imposto`. Também possui um método `calcularSalario()` que calcula o salário após a dedução dos impostos.
- **Administrador**: Subclasse de `Empregado` que adiciona o atributo `ajudaDeCusto` e redefine o método `calcularSalario()` para incluir esta ajuda no cálculo do salário final.
- **Operario**: Subclasse de `Empregado` que adiciona os atributos `valorProducao` e `comissao`, e redefine o método `calcularSalario()` para incluir a comissão no salário final.
- **Vendedor**: Subclasse de `Empregado` que adiciona os atributos `valorVendas` e `comissao`, e redefine o método `calcularSalario()` para incluir a comissão sobre as vendas no salário final.

## 🚀 Funcionalidades
- **Cálculo de Salário**: Cada classe que herda de `Empregado` tem um método específico para calcular o salário com base em seus atributos adicionais (ajuda de custo, comissão, etc.).
- **Gestão de Fornecedores**: A classe `Fornecedor` permite calcular o saldo entre o crédito concedido e a dívida com o fornecedor.
- **Herança e Polimorfismo**: Demonstra o uso de herança e polimorfismo em Java, com métodos sobrepostos para cálculo de salários em subclasses específicas.

## 🧩 Exemplo de Uso

Aqui está um exemplo de como instanciar e usar as classes do projeto:

```java
public class TesteProjeto {
    public static void main(String[] args) {
        // Criando um fornecedor
        Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "1234-5678", 10000.0, 2500.0);
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());

        // Criando um empregado
        Empregado empregado = new Empregado("Carlos", "Avenida B, 789", "8765-4321", 101, 3000.0, 10.0);
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());

        // Criando um administrador
        Administrador administrador = new Administrador("Ana", "Praça C, 456", "5678-1234", 202, 5000.0, 12.0, 1500.0);
        System.out.println("Salário do Administrador: " + administrador.calcularSalario());

        // Criando um operário
        Operario operario = new Operario("José", "Rua D, 321", "4321-8765", 303, 2000.0, 8.0, 50000.0, 5.0);
        System.out.println("Salário do Operário: " + operario.calcularSalario());

        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Maria", "Rua E, 654", "6789-1234", 404, 2500.0, 9.0, 30000.0, 10.0);
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
    }
}
```

📦 Estrutura de Diretórios

src/
├── Pessoa.java
├── Fornecedor.java
├── Empregado.java
├── Administrador.java
├── Operario.java
└── Vendedor.java


📝 Requisitos
Java 8 ou superior: Certifique-se de que o JDK está instalado e configurado corretamente.
IDE: Recomenda-se o uso de uma IDE como IntelliJ IDEA, Eclipse ou NetBeans para facilitar o desenvolvimento.

🔄 Executando o Projeto

1.Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

2.Navegue até o diretório do  projeto:

cd seu-repositorio

3.Compile e execute o programa de teste:

javac src/TesteProjeto.java
java src.TesteProjeto

📚 Documentação
Para mais detalhes sobre a implementação e o uso das classes, consulte os comentários no código-fonte. Eles fornecem uma descrição detalhada dos métodos e atributos utilizados.


👨‍💻 Autor: Danielle Sanches
📅 Última Atualização: Agosto de 2024



