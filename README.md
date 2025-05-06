Sistema Bancário Simples em Java
![image](https://github.com/user-attachments/assets/a55063b5-3819-40f4-8854-b43e7d796ab6)


Este é um sistema bancário simples desenvolvido em Java que permite criar uma conta, consultar saldo, realizar depósitos e saques através do console.

->> Funcionalidades

Criação de Conta: Permite ao usuário inserir seu nome, sobrenome e CPF para criar uma conta bancária.
Consulta de Saldo: Exibe o saldo atual da conta.
Depósito: Permite adicionar fundos à conta. Valida se o valor do depósito é positivo.
Saque: Permite retirar fundos da conta. Valida se há saldo suficiente e se o valor do saque é positivo.
*Menu Interativo: Oferece um menu simples para o usuário escolher as operações bancárias.

->> Estrutura do Código

O código é organizado em uma única classe chamada `sistemaBancario` com os seguintes componentes principais:

* **Classe Interna `ContaBancaria`:**
    * Atributos: `nome`, `sobrenome`, `cpf`, `saldo`.
    * Construtor: Inicializa uma nova conta com nome, sobrenome e CPF, definindo o saldo inicial como 0.0.
    * Métodos:
        * `contaCriada()`: Exibe os dados da conta recém-criada.
        * `consultarSaldo()`: Exibe o saldo atual da conta.
        * `depositar(double valor)`: Adiciona um valor ao saldo, com validação para valores positivos.
        * `sacar(double valor)`: Subtrai um valor do saldo, com validação para valores positivos e saldo suficiente.
* **Método `exibirMenu()`:** Exibe as opções do menu bancário para o usuário.
* **Método `main(String[] args)`:**
    * Ponto de entrada do programa.
    * Utiliza a classe `Scanner` para obter a entrada do usuário (nome, sobrenome, CPF, opções do menu, valores de depósito e saque).
    * Cria uma instância da classe `ContaBancaria` para o cliente.
    * Exibe os dados da conta criada.
    * Entra em um loop `do-while` para exibir o menu e processar as opções escolhidas pelo usuário até que a opção de sair seja selecionada.
    * Utiliza uma estrutura `switch` para executar a ação correspondente à opção do menu.
    * Fecha o `Scanner` ao final da execução.


->> Próximos Passos e Melhorias

Este sistema bancário é uma implementação básica e pode ser aprimorado com diversas funcionalidades e melhorias, como:

Persistência de Dados: Em vez de manter os dados apenas na memória durante a execução, implementar a persistência de dados utilizando arquivos, bancos de dados como MySQL.
Histórico de Transações: Adicionar a funcionalidade de registrar e exibir o histórico de depósitos e saques.
Transferências: Permitir transferências entre diferentes contas.
Validação de CPF: Implementar uma validação mais robusta para o formato do CPF.
Tratamento de Erros: Melhorar o tratamento de entradas inválidas (por exemplo, entrada de texto quando se espera um número).
Interface Gráfica: Desenvolver uma interface gráfica de usuário (GUI) para tornar a interação mais amigável.
Segurança: Implementar mecanismos de segurança para proteger as contas dos usuários.
Múltiplas Contas: Permitir que o sistema gerencie múltiplas contas de diferentes clientes.
Exceções: Utilizar tratamento de exceções de forma mais explícita para lidar com erros.

