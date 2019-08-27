
public class TipoCorException extends Exception {
	public TipoCorException(Veiculo veiculo, String tipoCor) {

		System.out.println("Cor "+ veiculo.getCor()+ " do tipo "+tipoCor+" está INDISPONÍVEL");
		
	}
}
