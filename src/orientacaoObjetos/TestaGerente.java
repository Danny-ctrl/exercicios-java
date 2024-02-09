package orientacaoObjetos;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente setor1 = new Gerente();
		setor1.salario = 1000;
		
		System.out.println("Salário: " + setor1.salario);
		
		System.out.println("Aumentando o salário em 10% ");
		setor1.aumentoSalario();
		
		System.out.println("Salário: " + setor1.salario);
		
		System.out.println("Aumentando o salario em 30% ");
		setor1.aumentoSalario(0.3);
		
		System.out.println("Salário: " + setor1.salario);
		
	}

}
