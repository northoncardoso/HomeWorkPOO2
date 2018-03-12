
public class Assistente extends Funcionario{
	
	int matricula = 0;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void exibeDados(){
		System.out.println(this.matricula);
	}

}
