import java.util.List;


public interface Pessoas {

	public String getLogin();
	public String getSenha();
	public String getGrauAcesso();	
	public String getCpf();
	public String getNome();
	public Pedido getPedido();
	public void setLogin(String login);
	public void setSenha(String senha);
	public void setGrauAcesso(String grauAcesso);
	public void setCpf(String cpf);
	public void setNome(String nome);
	public void setPedido(Pedido pedido);
	public void validaAcesso(Pessoas novo, List<Pessoas> usuarios) throws AcessoNegadoException;	
}
