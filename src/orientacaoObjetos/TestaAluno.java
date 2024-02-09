package orientacaoObjetos;

public class TestaAluno {
public static void main(String[] args) {
	

		Aluno aluno1 = new Aluno("Carlos",15);
		Aluno aluno2 = new Aluno("Ana",16);
		
		System.out.println("Nome " + aluno1.getNome());
		System.out.println("matricula " + aluno1.getMatricula());
		
		System.out.println("Nome " + aluno2.getNome());
		System.out.println("Matricula " + aluno2.getMatricula());
		
	}

}
