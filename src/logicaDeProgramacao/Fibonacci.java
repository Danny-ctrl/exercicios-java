package logicaDeProgramacao;

public class Fibonacci {

	public static void main(String[] args) {
		int i;
		
        for (i = 1; i <= 30; i++) {
            System.out.printf("%d ", fib(i));
        }
        System.out.println();
    }
	
	
	
public static int  fib(int n){
	if(n==1) {
		return 0;
	} if (n==2) {
		return 1;
	}
	
	int antesTermo=0,primeiroTermo=0,segundoTermo=1;
	for(int i=3; i<=n; i++){
	antesTermo=primeiroTermo+segundoTermo;
	primeiroTermo=segundoTermo;
	segundoTermo=antesTermo;
	
}
return (antesTermo);
}
}
