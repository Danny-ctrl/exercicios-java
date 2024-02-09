package orientacaoObjetos;

import util.Conta;

public class TestaMetodosConta {

	public static void main(String[] args) {
		Conta contaTeste = new Conta();
		
		contaTeste.deposita(1000);
		contaTeste.imprimeExtrato();
		
		contaTeste.saca(100);
		contaTeste.imprimeExtrato();
		
		double saldoDisponivel = contaTeste.consultaSaldoDisponivel();
		System.out.println("SALDO DISPONIVEL : " + saldoDisponivel);
	}
}
