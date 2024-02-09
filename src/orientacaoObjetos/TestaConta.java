package orientacaoObjetos;


import util.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 1234;
		conta1.saldo = 1000;
		conta1.limite = 500;
		conta1.deposita(1000);
		
		
		Conta conta2 = new Conta();
		conta2.numero = 5678;
		conta2.saldo = 2000;
		conta2.limite = 250;
		
		Conta origem = new Conta();
		origem.saldo = 1000;
		
		Conta destino = new Conta();
		
		origem.transfere(destino, 500);
		
		
		System.out.println(conta1.numero);
		System.out.println(conta1.saldo);
		System.out.println(conta1.limite);
		
		
		System.out.println(conta2.numero);
		System.out.println(conta2.saldo);
		System.out.println(conta2.limite);
	}

}
