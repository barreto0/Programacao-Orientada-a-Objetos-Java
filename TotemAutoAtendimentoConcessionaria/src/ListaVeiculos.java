
public class ListaVeiculos {
	private Veiculo listaCarros[] = new Veiculo[5];
	private int qtd = 0;
	
	
	public void add(Veiculo carro) {
		if(qtd<listaCarros.length) {
			listaCarros[qtd] = carro;
			qtd++;
		}else {
			 Veiculo temp[] = listaCarros;
			 listaCarros = new Carro[temp.length * 2];
			 for(int i = 0; i<temp.length;i++) {
				 listaCarros[i] = temp[i];
			 }
			 listaCarros[qtd] = carro;
			 qtd++;
		}
	}
	
	public Veiculo[] getArray() {
		return listaCarros;
	}
	
	public Veiculo get(int indice) {
		return listaCarros[indice];
	}
	
	public void remove(int indice) {
		listaCarros[indice] = null;
	}
	
	public int size() {
		return qtd;
	}
	
	public String print(int i) {
		
		return (i+" - "+"Fabricante: "+listaCarros[i].getFabricante()+" "+"Modelo: "+listaCarros[i].getNome()+" "+"Motorização: "+listaCarros[i].getMotor()+" "+"Combustível: "+listaCarros[i].getCombustivel()+" "+"Cor: "+listaCarros[i].getCor()+" "+"Ano: "+listaCarros[i].getAno()+" "+"Preço: R$"+listaCarros[i].getValor()+"\n");

		
		
	}
	
	
}
