
public class CartaV2 {
	private String naipe;
	private String numero;
	
	public void colocaDados(String naipe,String numero) {
		this.naipe = naipe;
		this.numero = numero;
		
	}
	
	public String getNaipe() {
		return this.naipe;
		
	}
	public String getNumero() {
		return this.numero;
	}
}
