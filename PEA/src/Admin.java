import java.util.List;

public class Admin implements Pessoas {
	
	private String login;
	private String senha;
	private String grauAcesso;
	private String cpf;
	private String nome;
	private Pedido pedido;
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Admin() {
		this.login = "admin";
		this.senha = "admin";
		this.grauAcesso = "1";
		this.cpf = "default";
		this.nome = "default";
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGrauAcesso() {
		return grauAcesso;
	}
	public void setGrauAcesso(String grauAcesso) {
		this.grauAcesso = grauAcesso;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return("Login: "+this.getLogin()+" "+"Senha: "+this.getSenha()+" "+"Grau de Acesso: "+this.getGrauAcesso());
	}
	
	/*
	 * public void validaAcesso(Pessoas novo, Pessoas existente) throws
	 * AcessoNegadoException { if(novo.toString().equals(existente.toString())) {
	 * System.out.println("Acesso Garantido, seja bem vindo "+existente.getLogin());
	 * }else { throw new AcessoNegadoException(novo); } }
	 */
	
	public void validaAcesso(Pessoas novo, List<Pessoas> usuarios) throws AcessoNegadoException {
		
			if(usuarios.toString().contains(novo.toString())) {
				System.out.println("Acesso Garantido, seja bem vindo "+novo.getLogin());
			}else {
				throw new AcessoNegadoException(novo);
			}
		
		
		
	}
	
}
