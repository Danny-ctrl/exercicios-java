package logicaDeProgramacao;
import java.util.Scanner;

public class GeradorDePadroes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 while (true) {
	            System.out.println("Escolha uma opção:");
	            System.out.println("1 - Fibonacci");
	            System.out.println("2 - Varios Triangulos");
	            System.out.println("3 - Imprimi Nome");
	            System.out.println("4 - Imprimi Triangulo");
	            System.out.println("5 - Imprimi Padrao 1");
	            System.out.println("0 - Sair");
	            
	            int opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    Fibonacci.main(args);
	                    break;
	                case 2:
	                    VariosTriangulos.main(args);
	                    break;
	                case 3:
	                    ImprimiNome.main(args);
	                    break;
	                case 4:
	                    ImprimiTriangulo.main(args);
	                    break;
	                case 5:
	                    ImprimiPadrao1.main(args);
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	}
	}
}
