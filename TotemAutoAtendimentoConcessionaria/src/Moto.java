
public class Moto implements Veiculo {
	private String fabricante;
	private String nome;
	private String motor;
	private String combustivel;
	private String cor;
	private String tipoCorDisponivel;
	private String ano;
	private double valor;
	private double novoValor;
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getNovoValor() {
		return novoValor;
	}

	public void setNovoValor(double novoValor) {
		this.novoValor = novoValor;
	}

	public String getFabricante() {
		return this.fabricante;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMotor() {
		return this.motor;
	}
	
	public String getCombustivel() {
		return this.combustivel;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String getTipoCorDisponivel() {
		return tipoCorDisponivel;
	}
	
	
	public String getAno() {
		return this.ano;
	}
	
	public double getValor() {
		return this.valor;
	}

	
	public void setDados(String fabricante, String nome, String motor, String combustivel, String cor, String tipoCorDisponivel ,String ano, double valor) {
		this.fabricante = fabricante;
		this.nome = nome;
		this.motor = motor;
		this.combustivel = combustivel;
		this.cor = cor;
		this.tipoCorDisponivel = tipoCorDisponivel;
		this.ano = ano;
		this.valor = valor;
		
	}


	public void sumarioDoCadastro(Veiculo veiculo) {
		System.out.println("Fabricante: "+veiculo.getFabricante()+"\n"+"Modelo: "+veiculo.getNome()+"\n"+"Motorização: "+veiculo.getMotor()+"\n"+"Combustível: "+veiculo.getCombustivel()+"\n"+"Cor: "+veiculo.getCor()+"\n"+"Ano: "+veiculo.getAno()+"\n"+"Preço: R$"+veiculo.getValor());    
	}
	
	public void validaDuplicata(Veiculo novo, Veiculo carros[]) throws DuplicataException {
		for(int i = 0; i<carros.length;i++) {
			if(carros[i]==null) {
				System.out.println("hmm");
				
			}else{
				if(novo.toString().equals(carros[i].toString())) {
					throw new DuplicataException(novo);

				}
			}
		}
		
	}
	
	public void validaTipoCor(Veiculo veiculo, String tipoCor) throws TipoCorException {
		if(veiculo.getTipoCorDisponivel().toString().equals(tipoCor)) {
			System.out.println("Tipo de cor disponível");
		}else {
			throw new TipoCorException(veiculo,tipoCor);
		}
	}
	
	
	


	
}
