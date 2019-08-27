public class Carta {
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

	/*
	 * @Override public int compareTo(Carta c) { int numAqui =
	 * Integer.parseInt(this.numero); int numLa = Integer.parseInt(c.getNumero());
	 * if (numAqui > numLa) { return 1; } else if (numAqui < numLa) { return -1; }
	 * return 0; }
	 */
	
	
	
}
