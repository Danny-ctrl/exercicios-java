package orientacaoObjetos;

public class Gerente {
	String nome;
	double salario;
	
	void aumentoSalario() {
		this.aumentoSalario(0.1);
	}

	 void aumentoSalario(double taxa) {
		this.salario += this.salario * taxa;
	}
}
