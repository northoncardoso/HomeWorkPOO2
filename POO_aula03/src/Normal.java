
public class Normal extends Ingresso{
		
	double valorNormal = 50;

	public double getValorNormal() {
		return valorNormal;
	}

	public void setValorNormal(double valorNormal) {
		this.valorNormal = valorNormal;
	}
	
	public void ingressoNormal(){
		System.out.println(this.valorNormal);
	}

}
