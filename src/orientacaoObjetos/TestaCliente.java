package orientacaoObjetos;
import util.Cliente;

class TestaCliente {
public static void main(String[] args) {
	
Cliente online = new Cliente(null);
online.nome = "Rafael Cosentino";
online.codigo=1;

Cliente fisico = new Cliente(null);
fisico.nome = "Jonas Hirata";
fisico.codigo = 2;

System.out.println(online.nome);
System.out.println(online.codigo);

System.out.println(fisico.nome);
System.out.println(fisico.codigo);
}
}

