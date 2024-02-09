package orientacaoObjetos;
import util.Cliente;

public class TestaClienteECartao {

	public static void main(String[] args) {
	//Criando objetos	
		Cliente c = new Cliente(null);
		CartaoDeCredito cartaoBradesco = new CartaoDeCredito();
	
		//Carregando alguns dados
		c.nome = "Rafael Cosentino";
		
		// Ligando os objeos
		cartaoBradesco.cliente = c;
		
		System.out.println(cartaoBradesco.numero);
		System.out.println(cartaoBradesco.cliente.nome);
	}

}
