import java.util.Scanner;

public class sistemaBancario {

	// Classe interna para dados pessoais e operações bancárias
	static class ContaBancaria {

		String nome;
		String sobrenome;
		String cpf;
		double saldo;

		public void contaCriada() {
			System.out.println("\n=== Dados da Conta Criada ===");
			System.out.println("Nome completo: " + nome + " " + sobrenome);
			System.out.println("CPF: " + cpf);
			System.out.println("Saldo inicial: R$" + saldo);
		}

		// Construtor
		public ContaBancaria(String nome, String sobrenome, String cpf) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.cpf = cpf;
			this.saldo = 0.0;
		}

		// Métodos de operação
		public void consultarSaldo() {
			System.out.println("Seu saldo atual agora é: R$" + saldo);
		}

		public void depositar(double valor) {
			String msgDeposito = valor > 0 ? "Depósito de R$" + valor + " realizado com sucesso."
					: "Valor de depósito inválido ou você digitou letra ou número negativo.";

			if (valor > 0) {
				saldo += valor;
			}

			System.out.println(msgDeposito);
		}

		public void sacar(double valor) {
			String msgSaque = valor > 0 && valor <= saldo ? "Saque de R$" + valor + " realizado com sucesso."
					: "Saque inválido ou sem saldo corrija o valor.";

			if (valor > 0) {
				saldo -= valor;
			}

			System.out.println(msgSaque);
		}

	}

	// Método de exibição do menu
	public static void exibirMenu() {
		System.out.println("\n----- Menu Bancário -----");
		System.out.println("1 - Consultar saldo");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("4 - Sair");
		System.out.print("Escolha uma opção: ");
	}

	// Método principal
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nBem-vindo ao Sistema de Gerenciamento Bancário!");
		// Coletar dados do usuário
		System.out.print("\nDigite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();

		System.out.print("Digite seu CPF sem ponto e sem traço: ");
		String cpf = scanner.nextLine();

		// Criar conta bancária
		ContaBancaria contaCliente = new ContaBancaria(nome, sobrenome, cpf);
		contaCliente.contaCriada();

		int opcaoMenu;
		do {
			exibirMenu();
			opcaoMenu = scanner.nextInt();

			switch (opcaoMenu) {
			case 1:
				contaCliente.consultarSaldo();
				break;
			case 2:
				System.out.print("Digite o valor para depósito: R$");
				double deposito = scanner.nextDouble();
				contaCliente.depositar(deposito);
				break;
			case 3:
				System.out.print("Digite o valor para saque: R$");
				double saque = scanner.nextDouble();
				contaCliente.sacar(saque);
				break;
			case 4:
				System.out.println("Encerrando o sistema. Obrigado por usar nosso banco!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcaoMenu != 4);
		scanner.close();
	}
}