package orientacaoObjetos;

public class Turma {
	private String periodo;
	private int serie;
	private String sigla;
	private String tipoEnsino;
	
	public Turma(String periodo) {
		this.periodo = periodo;
	}
	 public Turma(String string,int i , String string2,String string3) {
	        this.serie = i;
	        this.sigla = string2;
	        this.tipoEnsino = string3;
	    }
	 
	public String getPeriodo() {
		 return periodo;
	 }
	 
	 public int getSerie() {
		 return serie;
	 }
	 public String getSigla() {
		 return sigla;
	 }
	 public String getTipoEnsino() {
		 return tipoEnsino;
	 }
}
