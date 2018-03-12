
public class VIP extends Ingresso{
	
	double adicional = 250;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
		
	public void returnVip(){
		return this.adicional + setValor();
	}
		
}
