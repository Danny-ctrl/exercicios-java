package orientacaoObjetos;

class TestaAgencia {
	
	public static void main(String[] args) {
		Agencia a1 = new Agencia(0);
		a1.numero = 1234;

		Agencia a2 = new Agencia(0);
		a2.numero = 5678;

		System.out.println(a1.numero);
		System.out.println(a2.numero);
	}
}