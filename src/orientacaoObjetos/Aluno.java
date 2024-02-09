package orientacaoObjetos;

import orientacaoObjetos.Turma;
import java.time.LocalDate;

public class Aluno {
String nome;
String rg;
LocalDate dataDeNascimento;
public int matricula;
private Turma turma;



public Aluno(String nome, int matricula) {
    this.nome = nome;
    this.matricula = matricula;
}



public String getNome() {
    return nome;
}

public int getMatricula() {
    return matricula;
}

public String getTurmaPeriodo() {
	if(turma!=null) {
	return turma.getPeriodo();
}
	return "Turma não definida";
}

public void setTurma(Turma turma) {
	 this.turma=turma;
}

public Turma getTurma() {
	return turma;
}



public static void main(String[] args) {
	Turma turmaA = new Turma("Turma A");
	Aluno aluno1= new Aluno("João",101);
	Aluno aluno2 = new Aluno("Maria",102);
	
	aluno1.setTurma(turmaA);
	aluno2.setTurma(turmaA);
	
	System.out.println("Aluno: "+ aluno1.getNome()+ ",Matrícula" + aluno1.getMatricula());
	System.out.println("Turma do Aluno: "+ aluno1.getTurma().getSerie());
	
	System.out.println("Aluno: "+ aluno2.getNome()+ ",Matrícula: " +aluno2.getMatricula());
	System.out.println("Turma do Aluno: " + aluno2.getTurma().getSerie());
}


}


