package orientacaoObjetos;

import util.Conta;

public class TestaValoresPadrao {

	public static void main(String[] args) {
		Conta novaConta = new Conta();
		
		System.out.println(novaConta.numero);
		System.out.println(novaConta.saldo);
		System.out.println(novaConta.limite);
	}

}
