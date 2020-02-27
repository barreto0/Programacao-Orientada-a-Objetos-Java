
public class AcessoNegadoException extends Exception {
	
	public AcessoNegadoException(Pessoas pessoa) {

		System.out.println("Acesso Negado, " +pessoa.getLogin()+" procure o administrador ");
		
	}
}
