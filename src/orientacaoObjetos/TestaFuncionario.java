package orientacaoObjetos;

import util.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Daniele",1.200);
		Funcionario func2 = new Funcionario("Lucas",1.400);
		
		func1.aumentarSalario();
		func2.aumentarSalario();
		
		System.out.println("Dados do funcionário " + func1.getNome() +" salario " + func1.getSalario()+ " mil reais");
		System.out.println("Dados do funcionário " + func2.getNome() +" salario " + func2.getSalario()+ " mil reais");
	}


	
}
