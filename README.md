# 🚗 Projeto: Factory Method - Veículos

## 📌 Descrição

Este projeto tem como objetivo demonstrar a aplicação do padrão de projeto **Factory Method** utilizando um sistema simples de criação de veículos.

O sistema permite a criação de diferentes tipos de veículos (Carro, Moto e Caminhão) de forma desacoplada, delegando a responsabilidade de instanciar os objetos para classes específicas (factories).

---

## 🎯 Objetivo

Aplicar o padrão **Factory Method** para:

* Evitar o uso de condicionais (`if/else`) na criação de objetos
* Facilitar a manutenção e extensão do sistema
* Promover baixo acoplamento entre classes

---

## 🧩 Estrutura do Projeto

```bash
padrao-factory-method/
├── src/
│   ├── model/
│   │   ├── Veiculo.java
│   │   ├── Carro.java
│   │   ├── Moto.java
│   │   └── Caminhao.java
│   │
│   ├── factory/
│   │   ├── VeiculoFactory.java
│   │   ├── CarroFactory.java
│   │   ├── MotoFactory.java
│   │   └── CaminhaoFactory.java
│   │
│   └── app/
│       └── Main.java
│
├── test/
│   └── VeiculoFactoryTest.java
│
├── diagrama/
│   └── factory_method_simplified.svg
│
├── pom.xml
└── README.md
```

---

## ⚙️ Como executar o projeto

### ▶️ Executar aplicação

1. Compile o projeto
2. Execute a classe `Main`

Saída esperada:

```bash
=== Sistema de Veículos ===
Veículo: Carro
Veículo: Moto
Veículo: Caminhão
```

---

## 🧪 Testes

O projeto utiliza **JUnit 5** para testes automatizados.

### ▶️ Executar testes na IDE

* Clique com botão direito na classe de teste
* Selecione **Run Tests**

## 🧠 Padrão de Projeto Utilizado

### Factory Method

O padrão **Factory Method** define uma interface para criação de objetos, mas permite que as subclasses decidam qual classe instanciar.

### ✔️ Aplicação no projeto:

* `Veiculo` → interface comum
* `Carro`, `Moto`, `Caminhao` → implementações concretas
* `VeiculoFactory` → classe abstrata com o método factory
* `CarroFactory`, `MotoFactory`, `CaminhaoFactory` → factories concretas

### ✔️ Vantagens:

* Elimina condicionais complexas
* Facilita a adição de novos tipos de veículos
* Promove reutilização e organização do código

---

## 📊 Diagrama UML

O diagrama UML do projeto está disponível em:

```bash
docs/factory_method_simplified.svg
```

Ou visualizado diretamente abaixo:

## 📌 Autor

Alceu Botelho
