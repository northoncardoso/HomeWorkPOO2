
public class Ingresso {
	
	double valor = 100;
	
	public double setValor(){
		return valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public void imprimeValor(){
		System.out.println("R$" + this.valor );
	}
	
}

