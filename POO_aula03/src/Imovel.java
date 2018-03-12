
public class Imovel {


		private int endereco; //CEP
		private int preco;
		
		
		public int getEndereco() {
			return endereco;
		}
		public void setEndereco(int endereco) {
			this.endereco = endereco;
		}
		
		public int getPreco() {
			return preco;
		}
		public void setPreco(int preco) {
			this.preco = preco;
		}
		
		
		public void builderImovel(){
			System.out.println(this.endereco);
			System.out.println(this.preco);
			
		}
	
}
