package orientacaoObjetos;

import util.Conta;

public class TestaContaEAgencia {

	public static void main(String[] args) {
		Agencia minasAgencia = new Agencia(0);
		Conta correnteMinasAgencia = new Conta();
	
	minasAgencia.numero = 178;
	correnteMinasAgencia.saldo = 1000;
	
	//ligando os objetos
	
	correnteMinasAgencia.agencia = minasAgencia;
	
	System.out.println(correnteMinasAgencia.agencia.numero);
	System.out.println(correnteMinasAgencia.saldo);
	}

}
