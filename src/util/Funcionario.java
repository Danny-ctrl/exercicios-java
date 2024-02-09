package util;


public class Funcionario {
	
	private String nome;
	private double salario = 1000.0;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	
	public void aumentarSalario() { // Método para aumentar o salário em 10%
		salario=salario * 1.10;
	}

	//Método para exibir os dados do funcionario
		public void exibirDados() {
			System.out.println("Nome: "+nome);
			System.out.println("Salário: "+salario);
		}

		 public void setSalario(double salario) {
		        this.salario = salario;
		    }

		 public void setNome(String nome) {
		        this.nome = nome;
		    }
		}
			
