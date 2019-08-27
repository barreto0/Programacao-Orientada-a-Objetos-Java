
public interface Veiculo {
	
	public void setDados(String fabricante, String nome, String motor, String combustivel, String cor, String tipoCorDisponivel ,String ano, double valor);     
	public String getFabricante();
	public String getNome();
	public String getMotor();
	public String getCombustivel();
	public String getCor();
	public String getTipoCorDisponivel();
	public String getAno();
	public double getValor();
	public double getNovoValor();
	public void setValor(double valor);
	public void setNovoValor(double novoValor);
	public void sumarioDoCadastro(Veiculo carro);
	public void validaDuplicata(Veiculo novo, Veiculo[] existente) throws DuplicataException;
	public void validaTipoCor(Veiculo veiculo, String tipoCor) throws TipoCorException;
	
}
