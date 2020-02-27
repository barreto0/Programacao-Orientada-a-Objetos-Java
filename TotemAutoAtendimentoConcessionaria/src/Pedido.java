
public class Pedido {

	private Veiculo carrosPedidos[] = new Veiculo[5];
	private int numeroPedido;
	private int qtd = 0;
	private String cpfCliente;
	private String nomeCliente;
	private String prazoEntrega = "9 dias úteis";
	
	public String getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(String prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public Veiculo[] getCarrosPedidos() {
		return carrosPedidos;
	}

	public int getQtd() {
		return qtd;
	}

	public void setCarrosPedidos(Veiculo veiculo) {
		if(qtd<carrosPedidos.length) {
			carrosPedidos[qtd] = veiculo;
			qtd++;
		}else {
			 Veiculo temp[] = carrosPedidos;
			 carrosPedidos = new Carro[temp.length * 2];
			 for(int i = 0; i<temp.length;i++) {
				 carrosPedidos[i] = temp[i];
			 }
			 carrosPedidos[qtd] = veiculo;
			 qtd++;
		}
		
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public String sumarioPedido(Pedido pedido) {
		return("Nome: "+pedido.getNomeCliente()+"\n"+"CPF: "+pedido.getCpfCliente()+"\n"+"Pedido n°: "+ pedido.getNumeroPedido()+"\n"+"Estimativa de Entrega: "+pedido.getPrazoEntrega()+"\n");
	}
	
	
	
public String printCarrosPedidos(int i) {
		
		return ("Fabricante: "+carrosPedidos[i].getFabricante()+" "+"Modelo: "+carrosPedidos[i].getNome()+" "+"Motorização: "+carrosPedidos[i].getMotor()+" "+"Combustível: "+carrosPedidos[i].getCombustivel()+" "+"Cor: "+carrosPedidos[i].getCor()+" "+"Ano: "+carrosPedidos[i].getAno()+" "+"Preço: R$"+carrosPedidos[i].getValor()+"\n");

		
		
	}
	
	
	
}
