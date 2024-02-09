package util;

import orientacaoObjetos.Agencia;

public class Conta {
public int numero;
public double saldo;
public int limite = 100;
public Agencia agencia;

public Conta (Agencia agencia){
	this.agencia = agencia;
}
Conta (int numero){
	this.numero = numero;
}
Conta (int numero,double limite){
	this(numero);
	this.limite = (int) limite;
}
public Conta() {
	// TODO Auto-generated constructor stub
}
public void deposita(double valor) {
	this.saldo +=valor;
	}

public double consultaSaldoDisponivel() {
	return this.saldo + this.limite;
}

public void saca (double valor) {
	this.saldo -=valor;
}

public void imprimeExtrato() {
	this.imprimeExtrato(15);
}
public void imprimeExtrato(int dias) {
	
}

public void transfere(Conta destino,double valor) {
	this.saldo -=valor;
	destino.saldo +=valor;
}
}
