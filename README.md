# Sistema Bancário

### Índice

- [Descrição do Projeto](#descrição-do-projeto)

- [Requisitos](#requisitos)

- [Funcionalidades](#funcionalidades)

- [Técnicas e Tecnologias Utilizadas](#tecnicas-e-tecnologias-utilizadas)

- [Acesso ao Projeto](#acesso-ao-projeto)

- [Abrir e Executar o Projeto](#abrir-e-executar-o-projeto)

- [Desenvolvedores](#desenvolvedores)


## Descrição do Projeto

Este projeto Java implementa um sistema bancário simples com classes abstratas e concretas, bem como interfaces para representar diferentes entidades do banco. O sistema permite a criação de funcionários do banco, clientes com endereços associados e a realização de operações bancárias básicas, como depósitos, saques e transferências.

## Requisitos

1. **Criação das Classes Abstratas:**
   - As Classes `Conta` e `Pessoa` são classes abstratas, ou seja, objetos não podem ser instanciados a partir dessas classes.

2. **Criação da Interface `IUsuario`:**
   - A interface `IUsuario` possui apenas a assinatura de um método.
   - O método, quando implementado nas classes que realizam a interface, deve retornar apenas `True`.

3. **Criação das Classes Concretas:**
   - As classes concretas correspondem a todas as demais classes, sendo que algumas delas possuem relacionamento de herança com as classes abstratas do modelo.

Considerações sobre os Métodos nas Classes Concretas:

   a. **Método `listarEnderecos()` da classe `Cliente`:**
      - O método deve imprimir no console todos os endereços armazenados para um cliente.

   b. **Método `depositar()` da classe `Conta`:**
      - Cria um objeto do tipo `Credito` vinculado à conta que está recebendo o depósito.

   c. **Método `sacar()` da classe `Conta`:**
      - Cria um objeto do tipo `Debito` vinculado à conta que está sofrendo o saque.
      - A conta não pode ter saldo negativo além do seu limite.

   d. **Método `transferir()` da classe `ContaCorrente`:**
      - Retira dinheiro da conta corrente de origem e envia para uma conta destino.
      - A conta não pode ter saldo negativo além do seu limite.

   e. **Método `calcularSaldo()` da `ContaPoupanca`:**
      - Soma o valor de todos os créditos e subtrai pela soma dos valores de todos os débitos.

   f. **Método `calcularSaldo()` da `ContaCorrente`:**
      - Soma o valor de todos os créditos e subtrai pela soma dos valores de todos os débitos.
      - Após, soma o valor do limite.
      - Ao final, retorna o valor.

## 🔨 Funcionalidades

- `Funcionalidade 1:` 

- Criar dois funcionários do banco, um gerente e um atendente.

- `Funcionalidade 2:` 

- Criar um cliente e adicione 3 endereços a ele.
- Imprimir os endereços desse cliente.

- `Funcionalidade 3:` Criar um cliente que possua uma ContaCorrente.
- Efetuar três depósitos de 100 nessa ContaCorrente.
- Efetuar um saque de 50 reais nessa ContaCorrente.
- Imprimir o valor do saldo dessa ContaCorrente.

- `Funcionalidade 4:` 

- Criar um cliente que possua uma ContaCorrente.
- Efetuar um depósito de 1000 nessa ContaCorrente.
- Criar um cliente que possua uma ContaPoupanca.
- Efetuar um depósito de 1000 reais nessa conta Poupanca.
- Efetue uma transferência de 500 reais da ContaCorrente para ContaPoupanca.

## ✔️ Técnicas e Tecnologias Utilizadas

- **Linguagem de Programação:** ``Java 8``
- **Ambiente de Desenvolvimento:** ``IntelliJ IDEA``
- **Paradigma de Programação:** ``Orientação a Objetos``


## 📁 Acesso ao Projeto

Você pode acessar os arquivos do projeto [clicando aqui](https://github.com/asergioscosta/sistema-bancario-java/tree/main/src) ou [baixá-lo como um arquivo zip](https://github.com/asergioscosta/sistema-bancario-java/archive/refs/heads/main.zip).

## Abrir e Executar o Projeto

Após baixar o projeto, siga as instruções abaixo para abrir e executar o projeto utilizando o `IntelliJ IDEA`.

1. Abra o IntelliJ IDEA;
2. No menu principal, selecione "File" -> "Open" e navegue até o diretório onde você baixou o projeto;
3. Selecione a pasta do projeto e clique em "Open";
4. Aguarde o IntelliJ IDEA carregar o projeto;
5. Localize o arquivo principal, geralmente denominado `Main.java` ou similar.
6. Clique com o botão direito no arquivo principal e selecione "Run" para iniciar a aplicação.

Certifique-se de que as configurações do seu ambiente Java estão corretamente configuradas no IntelliJ IDEA. Caso necessário, o IntelliJ deve sugerir automaticamente a configuração do SDK Java.

## Desenvolvedores

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/102989796?v=4" width=115><br><sub>Augusto Sérgio</sub>](https://github.com/asergioscosta)
| :---: | :---: | :---: |