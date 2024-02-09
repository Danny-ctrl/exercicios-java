package logicaDeProgramacao;
import orientacaoObjetos.Turma;

public class TestaTurma {

	public static void main(String[] args) {

		Turma turmaA =new Turma("Manhã",6,"C","Ensino Fundamental");
		Turma turmaB =new Turma("Tarde",2,"A","Educação Infantil");
		
		System.out.println("Primeira turma periodo " + turmaA.getPeriodo() + " do " 
		+ turmaA.getSerie() + " ano " +turmaA.getSigla()+ " do " + turmaA.getTipoEnsino() );
		System.out.println("Primeira turma periodo " + turmaB.getPeriodo() + " do " 
				+ turmaB.getSerie() + " ano " +turmaB.getSigla()+ " do " + turmaB.getTipoEnsino() );
			
	}

}
