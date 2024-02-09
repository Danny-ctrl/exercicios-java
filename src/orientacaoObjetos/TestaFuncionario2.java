package orientacaoObjetos;

import java.util.Scanner;

import util.Funcionario;

public class TestaFuncionario2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Criar um funcionário com valores iniciais
		System.out.println("Digite o nome do Funcionário:");
		String nomeInicial = scanner.nextLine();
		System.out.println("Digite o salário do Funcionário:");
		double salarioInicial = scanner.nextDouble();
		
		Funcionario funcionario = new Funcionario(nomeInicial,salarioInicial);
		
		//alterações nos dados
		int opcao;
		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Alterar nome");
			System.out.println("2 - Alterar salário");
			System.out.println("3 - Visualizar dados atuais");
			System.out.println("0 - Sair");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o novo nome:");
				scanner.nextLine();
				String novoNome = scanner.nextLine();
				funcionario.setNome(novoNome);
				break;
			case 2:
				System.out.println("Digite o novo salário");
				double novoSalario = scanner.nextDouble();
				funcionario.setSalario(novoSalario);
				break;
			case 3:
				funcionario.exibirDados();
				break;
			case 0:
				System.out.println("Encerrando o programa.Adeus!");
				break;
				default:
					System.out.println("Opção inválida.Tente novamente.");
			}
		} while (opcao !=0);
		scanner.close();
	}
	
}
